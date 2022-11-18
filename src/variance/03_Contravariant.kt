package variance

// contravariant - 반변성

fun main() {
    //val b: Basket<Cat> = Basket<Nabi>()
    val a: Basket<Nabi> = Basket<Cat>()

    //val anys: Basket<Any> = Basket<Int>()
    val nothings: Basket<Nothing> = Basket<Int>()
}

class Basket<in T>
open class Cat
class Nabi: Cat()