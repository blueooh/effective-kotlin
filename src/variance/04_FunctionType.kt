package variance

fun main() {
    val list: List<Any>
    val intToDouble: (Int) -> Number = { it.toDouble() }
    val numberAsText: (Number) -> Any = { it.toShort() }
    val intToInt: (Number) -> Int = { it.toInt() }

    printProcessNumber(intToDouble)
    printProcessNumber(numberAsText)
    printProcessNumber(intToInt)
}

// (Int)->Any타입의 함수는 (Int)->Number, (Number)->Any, (Number)->Number, (Number)->Int, (Any)->Number, (Number)->Int 등으로 작동
// 왼쪽에서 오른쪽으로 하위타입 계층
fun printProcessNumber(transition: (Int)->Any) {
    println(transition(42))
}