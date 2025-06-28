fun main(args: Array<String>){
  val h1=Human()
  val h2=Human()
  h1.eye="brown"
  h2.age=20
  println(h1.eye)
  println(h2.age)
}

class Human{
  var eye=""
  var age=0
  var length=0
}