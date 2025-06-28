fun main(args: Array<String>) {
    val h1 = Human()
    val h2 = Human()
}

class Human {
    var eye: String? = null
    var age: Int? = null

    constructor(){
		println("Hello from constructor")
	}
}
