fun main(args: Array<String>) {
    val h1 = sameh()
    println("Please Enter Data:")
    h1.eye = readLine()
    h1.eye_color()
    h1.myClass()
}

open class Human {
    var eye: String? = null
    var age: Int? = null

    fun eye_color() {
        println("The eye: ${this.eye}")
    }

    fun eye_color(a:Int,b:Int) {
        println("The age: ${a+b}")
    }
}

open class omar:Human(){
    init{
      
    }
} 

class sameh:omar(){
  var age2=8;
    fun myClass(){
      println("eye is :${super.eye}")
      println("age2 is :${this.age2}")
    }
}
