fun main(args: Array<String>) {
    val h1 = sameh()
    println("Please Enter Data:")
    h1.eye = readLine()
    h1.eye_color()
}

open class Human {
    var eye: String? = null
    var age: Int? = null

    open fun eye_color() {
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
    override fun eye_color(){
      println("eye is pretty")
    }
}
