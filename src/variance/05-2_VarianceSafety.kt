package variance

// variance 한정자의 안정성

fun main() {
    // 파라미터 타입을 예측할 수 있다면 어떤 서브타입이라도 전달
    // 암묵적으로 업캐스팅
    takeDog(Dog())
    takeDog(Puppy())
    takeDog(Hound())
}

// convariant하지 않음
fun takeDog(dog: Dog) {}
