fun main(args: Array<String>) {
    val h1 = Human()
    val h2 = Human()
    println("Please Enter Data:")
    h1.eye = readLine()
    h1.eye_color()
    h1.eye_color(2,3)
    h1.age = readLine()!!.toInt()
}

class Human {
    var eye: String? = null
    var age: Int? = null

    fun eye_color() {
        println("The eye: ${this.eye}")
    }

    fun eye_color(a:Int,b:Int) {
        println("The age: ${a+b}")
    }
}
