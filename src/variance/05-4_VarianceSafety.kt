package variance

// variance 한정자의 안정성

sealed class Response<out R, out E>
class Failure<out E>(val error: E): Response<Nothing, E>()
class Success<out R>(val value: R): Response<R, Nothing>()