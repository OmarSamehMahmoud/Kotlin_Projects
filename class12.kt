fun main(args: Array<String>) {
    val h1 = sameh()
    println("Please Enter Data:")
    h1.eye = readLine()

    h1.eye_color()  //get func
    h1.myClass()
}

open class Human {
    public var eye: String? = null
    protected var age: Int = 3
        
    fun eye_color() {
        println("The eye")
        println(this.age)
    }
}

class sameh:Human(){
    private var age2=8;
    fun myClass(){
      println("age2 is :${this.age2}")
    }
}
