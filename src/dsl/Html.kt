package dsl

fun main() {
    val indexPage = table {
        tr {
            td {
                +"data1"
            }
            td {
                +"data2"
            }
        }
        tr {
            td {
                +"data1"
            }
            td {
                +"data2"
            }
        }
    }

    println(indexPage)
}

fun table(init: TableBuilder.()->Unit) = TableBuilder().apply(init)

class TableBuilder {
    var trs = listOf<TrBuilder>()

    fun tr(init: TrBuilder.()->Unit) {
        trs = trs + TrBuilder().apply(init)
    }
}

class TrBuilder {
    var tds = listOf<TdBuilder>()

    fun td(init: TdBuilder.()->Unit) {
        tds = tds + TdBuilder().apply(init)
    }
}

class TdBuilder {
    var text = ""

    operator fun String.unaryPlus() {
        text += this
    }
}