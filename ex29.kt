fun main(args: Array<String>)
{
  omar@for (i in 1..10){
    ahmed@for(j in 1..10){
      println("$i*$j="+(i*j))
      if(j==5){
        break@omar
      }
    }
  }
}