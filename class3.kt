fun main(args: Array<String>){
  val h1=Human()
  val h2=Human()
  println("Please Enter Data:")
  h1.eye=readLine()
  h1.eye_color()
}

class Human{
  var eye:String?=null
  var age=0
  fun eye_color(){
	println("The eye: ${this.eye}")
  }
}