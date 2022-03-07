package SparkPack

object CallbyNameAndValue {
  
  def calledByValue(x: Long):Unit={
    println("by value:"+x)
    println("by value:"+x)
  }
  
  def calledByName(x: =>  Long):Unit={
    println("by name:"+x)
    println("by name:"+x)
  }
  
  def main(args:Array[String]):Unit={  
    calledByValue(System.nanoTime())
    calledByName(System.nanoTime())
  }

}