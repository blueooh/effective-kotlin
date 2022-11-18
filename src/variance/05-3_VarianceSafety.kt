package variance

// variance 한정자의 안정성 - convariant
class House<out T> {
    private var value: T? = null

    // 코틀린에서 사용할 수 없는 코드 -> private 가시성을 바꾸면 가능 -> 업케스트 객체에 covariant(out 한정자)를 사용할 수 없기 때문
    // 파라미터 자리는 읽기, 쓰기 모두 가능해서 위험(런타임에러)
    private fun set(value: T) {
        this.value = value
    }

    // 생성되거나 노출되는 타입에만 안전하기때문에 out 한정자 사용
    // producer, immutable에 많이 사용(List<out E>)
    fun get(): T = value ?: error("Value not set")
}

fun main() {
    val puppyHouse = House<Puppy>()
    val dogHouse: House<Dog> = puppyHouse
    //dogHouse.set(Hound()) // 하지만 puppy를 위한 공간입니다. Hound가 Dog의 하위타입이라 커머파일 하용, set 파라미터 컴파일 허용했다면 런타임에러!

    val dogHouse2 = House<Dog>()
    val house: House<Any> = dogHouse2
    //house.set("some string") // 하지만 Dog를 위한 공간입니다.
    //house.set(42) // 하지만 Dog를 위한 공간입니다.

    // 캐스팅 후에 실질적인 객체가 그대로 유지되고, 타이핑 시스템에서만 다르게 처리

    // MutableList<T>에서 T는 in 한정자 위치에서 사용(append 파라미터)
    // 안전하지 않으므로 invariant
    val strs = mutableListOf<String>("A", "B", "C")
    //append(strs) // type mismatch
    //val str: String = strs[3]
    print(strs)
}

fun append(list: MutableList<Any>) {
    list.add(42)
}


