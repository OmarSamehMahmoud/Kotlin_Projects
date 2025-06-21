fun main(args: Array<String>){
  var x:String="Omar"
  println("Str1: "+x.plus(" Hello"))
  println("Str2: "+x.equals("Welcome"))
  println("Str3: "+x.count())
  println("Str4: "+x.drop(3))
  println("Str5: "+x.take(3))
  println("Str6: "+x.removeRange(2,3))
  println("Str7: "+x.toUpperCase()) 
  println("Str8: "+x.toLowerCase())
  println("Str9: "+x.last())
  println("Str10: "+x.first())  
  println("Str11: "+x.replace('m','w'))  
}