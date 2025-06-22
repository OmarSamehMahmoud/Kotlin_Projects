fun main(args: Array<String>){
  var a = ArrayList<Int>()
  a.add(5)
  a.add(8)
  a.add(5)
  a.add(5)
  a.add(5)
  a.add(5)
  a.add(2,3)
  a.remove(5)
  a.removeAt(2)
  println(a.first())
  println(a.last())
  println(a.isEmpty())
  println(a.isNotEmpty())
  println(a.contains(8))
  for (i in 0 until a.size){
    println(a[i])
  }

}