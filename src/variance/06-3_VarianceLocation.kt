package variance

// variance 한정자의 위치

interface Golf
interface Funny
data class GoodPro(val name: String): Golf, Funny
data class NormalPro(val name: String): Golf
data class BadPro(val name: String): Funny

// mutableList는 in한정자를 포함하면, 요소를 리턴할 수 없으므로 in 한정자를 붙이지 않음
// 단일 파라미터 타입에 in한정자를 붙여서 contravariant를 가지게 가능
// 이렇게하면 여러가지 타입을 받아들이게 할 수 있음
fun fillWithGoodPro(list: MutableList<in GoodPro>) {
    list.add(GoodPro("andy"))
    list.add(GoodPro("messi"))
}

fun main() {
    val golfs = mutableListOf<Golf>(NormalPro("kale"))
    fillWithGoodPro(golfs)
    println(golfs)

    val bads = mutableListOf<Funny>(BadPro("nobody"))
    fillWithGoodPro((bads))
    println(bads)
}