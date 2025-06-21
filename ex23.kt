fun main(args: Array<String>){
  println("Please Enter Degree: ")
  var x:Int=readLine()!!.toInt()
  when(x){
    in 0..35 -> {println("Good")}
    in 35..100 -> {println("excellent")}
    else -> {println("False")}
  }
}