package SparkPack

object DefaultArgs {
  
  def trFact(n: Int , acc: Int = 1): Int={
    if(n<=1) acc
    else trFact(n-1,n*acc)
  }
  def main(args:Array[String]):Unit={
    
    val fact10  =   trFact(10)
  }
}