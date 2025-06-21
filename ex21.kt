fun main(args: Array<String>){
  println("Enter Num 1: ")
  var x:Int=readLine()!!.toInt()
  println("Enter Num 2: ")
  var y:Int=readLine()!!.toInt()
  println(x>2&&y<3)
  println(x>2||y<3)
  println(x!=3)
}