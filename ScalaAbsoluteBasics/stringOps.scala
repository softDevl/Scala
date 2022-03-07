package SparkPack

object stringOps {
  
  val str:String =  "Hello, I am Learning Scala"
  
  //Get Index of string
  println(str.charAt(2))
  //grabs part of string based on index
  println(str.substring(7 , 11))
  
  println(str.split(" ").toList)
  
  println(str.startsWith("Hello"))
  
  println(str.replace(" ", "---"))
  
  println(str.toLowerCase())
  println(str.toUpperCase())
  
  println(str.length)
  
  
  val aNumberString = "45"
  
  val aNumber = aNumberString.toInt
  
  print("a" +: aNumberString :+ "z")
  
  println(str.reverse)
  println(str.take(2))
  
  //Scala - Specific string Interpolation
  
  // S- interpolation
  
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and Iam $age years";
  val anothergreeting = s"Hello, my name is $name and Iam ${age + 1} years"
   
  
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  
  println(myth)
  def main(args:Array[String]):Unit={
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}