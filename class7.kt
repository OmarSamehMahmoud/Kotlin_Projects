fun main(args: Array<String>) {
    val h1 = Human(20)
    val h2 = Human(30)
}

class Human (p_age:Int) {
    var eye: String? = null
    var age: Int? = null

    init{
		println("Hello from constructor "+p_age)
	}
}
