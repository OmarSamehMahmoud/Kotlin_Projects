fun main(args: Array<String>) {
    println("Enter your name")
    val x: String? = readLine()
    println("Your Name is $x")

    println("Enter your age")
    val y: Int = readLine()!!.toInt()
    println("Your Age is $y")
}
