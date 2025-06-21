fun main(args: Array<String>){
  println("Enter Mark:")
  var x:Int=readLine()!!.toInt()
  when(x){
    0 -> {
      println("BAD")
    }
    100 ->{
      println("Good")
    }
  }
}