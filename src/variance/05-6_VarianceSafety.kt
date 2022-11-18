package variance

// variance 한정자의 안정성 - contravariant

class Boxx<in T>(
    // 코틀린에서 사용할 수 없는 코드
     private val value: T
)

fun main() {
     val garage: Boxx<Car> = Boxx(Car())
     val amphibiousSpot: Boxx<Amphibious> = garage
     //val boat2: Boat = garage.value // 하지만 Boat를 위한 공간?, type mismatch, 책 오류인듯..(컴파일에러)
     //val boat2: Boat = amphibiousSpot.value // 하지만 Boat를 위한 공간?(런타임에러)

     val noSpot: Boxx<Nothing> = Boxx<Car>(Car())
     //val boat3: Nothing = noSpot.value // 아무것도 만들 수 없음
}