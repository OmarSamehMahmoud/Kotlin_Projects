fun main(args: Array<String>){
  omar@while(true){
    try{
      println("Enter your age: ")
      val x = readLine()!!.toInt()
      println("Your Age is $x")
      break@omar
    }catch(e:Exception){
      println("Wrong Age")
      continue@omar
    }
  }
}