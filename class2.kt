fun main(args: Array<String>){
  val h1=Human()
  val h2=Human()
  println("Please Enter Data:")
  h1.eye=readLine()
  println("Eye: ${h1.eye}")
}

class Human{
  var eye:String?=null
  var age=0
  var length=0
}