package sam

fun main() {
    setOnClickListner { name -> println(name)  }
}

//interface OnClick {
//    fun clicked(name: String)
//}
typealias OnClick = (String)->Unit

fun setOnClickListner(listener: OnClick) {
    listener("andy")
}

class ClickListner: (String)->Unit {
    override fun invoke(name: String) {
        println(name)
    }
}
