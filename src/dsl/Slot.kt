package dsl

fun main() {
    val slot = Slot {
        id {
            "0"
        }

        prop {
            color {
                "2ff00bb"
            }
            bold {
                true
            }
        }
    }

    print(slot.prop.color)
}

fun Slot(init: SlotBuilder.()->Unit): Slot = SlotBuilder().apply(init).build()

data class Slot(
    val id: String,
    val prop: Prop,
)

data class Prop(
    val color: String,
    val bold: Boolean
)

class SlotBuilder() {
    private lateinit var id: String
    private lateinit var prop: Prop

    fun id(id: () -> String) {
        this.id = id()
    }

    fun prop(init: PropBuilder.()->Unit) {
        prop = PropBuilder().apply(init).build()
    }

    fun build() = Slot(id, prop)
}

class PropBuilder() {
    private lateinit var color: String
    private var bold: Boolean = false

    fun color(color: ()->String) {
        this.color = color()
    }

    fun bold(bold: ()->Boolean) {
        this.bold = bold()
    }

    fun build(): Prop = Prop(color, bold)
}