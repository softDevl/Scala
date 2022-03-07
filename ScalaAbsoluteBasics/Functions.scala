package SparkPack

object Functions {
  
  def aFunction(a:String,b:Int):String = {
    a+" "+ b
  }
    
  def aParameterLessFunction():Int = 42
  
  def aRepeatedFunction(aString:String,n:Int):String={
    
    if (n==1) aString
    else aString + aRepeatedFunction(aString,n-1)
  }
  
  def aFunctionWithSideEffects(aString:String):Unit=println(aString)
  
  def aBigFunction(n:Int):Int={
    
    def aSmallerFunction(a:Int,b:Int):Int = a + b
    
    aSmallerFunction(n,n-1)
  }
  
  def aGreetingFunction(name:String, age:Int):String={
    
    "Hi my name is "+name+" and Iam  "+ age +" years old."
  }
  
  def aFactorialFunction(n:Int):Int={
    if(n<=0) 1
    else n * aFactorialFunction(n-1)
  }
  
  def aFabonacciFunction(n:Int):Int={
    if(n<=2) 1
    else aFabonacciFunction(n-1)+aFabonacciFunction(n-2)
    
  }
  
  def IsPrime(n:Int):Boolean={
    
    def isPrimeUntil(t:Int):Boolean={
      if(t<=1) true
      else n%t !=0 && isPrimeUntil(t-1)
      
      
    }
    isPrimeUntil(n/2)
  }
  
  def main(args:Array[String]):Unit={   
    println("=== Functions===")
    println("")
    println(aFunction("hello",3))
    println(aParameterLessFunction())
    println(aParameterLessFunction)
    println(aRepeatedFunction("Hello",5))  
    // when you need loops use recurrsion
    // recurrsive method needs to specify return type
    println()
    println("========= Assignment =============")
    println()
/*    1. A greeting function (name,age) => "Hi my name is $name and Iam  $age years old."
 *    2. Factorial function 1*2* 3...n
 *    3. A Fibonacci function
 *    			f(1) = 1
 *    			f(2) = 1
 *    			f(n) = f(n-1) + f(n-2)
 *    4. Test if a number is prime
 
     */
    
    //1.
    println(aGreetingFunction("Krishna",16))
    //2. 
    println(aFactorialFunction(5))
    //3.
    println(aFabonacciFunction(8))
    //4.  
    println(IsPrime(10))
  }
}