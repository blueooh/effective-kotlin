package variance

// variance 한정자의 안정성

// List<out E>() -> covariance
// MutableList보다 List를 더 많이 사용

// java 배열은 convariant
// JavaArray 클래스 참고(Runtime 에러)

fun main() {
    // kotlin의 Array는 invariant
    val i: Array<Int> = arrayOf(1, 2, 3)
    //val a: Array<Any> = i // type mismatch
}
