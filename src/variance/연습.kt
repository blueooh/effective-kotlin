package variance

fun main() {
    val bookList = listOf(
        Book(500, true),
        Book(1000, false),
        Book(300, true),
    )

    val p = 10
    println(
        bookList
            .filter { it.bought }
            .sumOf { p }
    )

    val result = 10.justSum {
        p
    }
    println(result)

    val languages = listOf(Language("kotlin"), Language(null), Language("java"))
    val names = languages
        .mapNotNull { it.name }
    println(names)

    val iterator = ('a'..'c').iterator()
    for((index, value) in iterator.withIndex()) {
        println("index=$index, value=$value")
    }

}

data class Book(
    val price: Int,
    val bought: Boolean
)

inline fun Int.justSum(selector: ()->Int): Int {
    return this + selector()
}

@JvmInline
value class Minute(private val minute: Int) {
   fun toMills(min: Int) = min * (60 * 1000)
}

@JvmInline
value class Mills(private val mills: Int)

data class Language(val name: String?)