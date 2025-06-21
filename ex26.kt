fun main(args: Array<String>){
  while(true){
    println("Please Enter Degree: ")
    var x:Int=readLine()!!.toInt()
    while(x<4){
      println("X= $x")
      x--
    }
  }
}