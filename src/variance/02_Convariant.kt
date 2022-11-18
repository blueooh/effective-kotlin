package variance

import java.lang.RuntimeException

// convariant - 공변성

fun main() {
    val b: Box<Dog> = Box<Puppy>() //ok
    //val a: Box<Puppy> = Box<Dog>()
    val anys: Box<Any> = Box<Int>() // ok
    //val nothings: Box<Nothing> = Box<Int>()
}

class Box<out T>

open class Dog
class Puppy: Dog()
class Hound: Dog()