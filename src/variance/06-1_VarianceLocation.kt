package variance

// variance 한정자의 위치

// 선언쪽의 variance 한정자
class Food<out T>(val value: T)
val foodStr: Food<String> = Food("str")
val foodAny: Food<Any> = foodStr