fun main(args: Array<String>){
  println("Enter Mark:")
  var x:Int=readLine()!!.toInt()
  if(x>50){
    println("GOOD")
  }else{
    if(x>20 && x<40){
      println("BAD")
    }
  }
}