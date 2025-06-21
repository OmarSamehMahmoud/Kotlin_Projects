fun main(args: Array<String>){
  println("Enter Num: ")
  var x=readLine()!!.toInt()
  if(x>0){
    println("Positive")
  }else if(x<0){
    println("Negative")
  }else{
    println("Zero")
  }
}