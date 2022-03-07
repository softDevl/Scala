package SparkPack

object Expressions {
  
  def main(args:Array[String]):Unit={
    
    println("======== Expressions======")
    
    val x = 1 + 2 // Expression
    println(x)
    
   // + - * / & | ^ << >> >>>(right shift with zero extensions)
    
    println(1 == x)
    
    println(!(1 == x))
    
    var aVariable = 2
    aVariable += 3 
   
    // Instructions vs Expressions
    
    //If expression

    val aCondition  = true
    
    val aConditionValue =  if(aCondition) 5 else 3
    
    println(aConditionValue)
    println(if(aCondition) 5 else 3)
    
    // While loop
    
    var i = 0
    while (i<10){
      println(i)
      i +=1
    }
    
    // Never write this again
    
    // Everything in scala is an Expression
    
    val aWeirdValue = (aVariable =3) 
    // unit=== void --- unit is equivalent to void in other languages
    
    println(aWeirdValue)
    
    // side effects: println(),whiles,reassigning
    
    //code blocks
    
    val aCodeBlock = {
      
      val y=2
      val z = y+1
      
      if (z>2) "hello" else "goodBye"
    }
    println(aCodeBlock)
    
    // 1. difference between "hello World" vs println("hello World")?
        // "hello World"--- string       println("hello World")--Unit      Expression
    // 2.
    
    val someValue = {
      2<3
    }
    println(someValue)
    val someOtherValue = {
      if(someValue) 239 else 986
      42
    }
    println(someOtherValue)
  }
}















