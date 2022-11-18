package variance

// variance 한정자의 위치

class Sports<T>(val value: T)
val sportsStr: Sports<String> = Sports("str")
// 사용하는 쪽의 variance 한정자
val sportsAny: Sports<out Any> = sportsStr