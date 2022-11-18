package variance

// variance 한정자의 안정성 - contravariant

open class Car
interface Boat
open class Amphibious: Car(), Boat

fun getAmphibious(): Amphibious = Amphibious()

// out 위치는 암묵적인 업캐스팅을 허용
// contravariant에 맞는 동작이 아님
val car: Car = getAmphibious()
val boat: Boat = getAmphibious()