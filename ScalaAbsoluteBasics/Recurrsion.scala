package SparkPack

import scala.annotation.tailrec

object Recurrsion {
  
    def factorial1(n:Int):Int = {
      if(n<=1) 1
      else {
        println("computing"+n)
        val result = n* factorial1(n-1)
        result
      }
    }
    
    
    
    
    def anotherFactorial(n:Int):BigInt={
      @tailrec
      def factHelper(x:Int,accumulator:BigInt):BigInt={
        
        if(x<=1) accumulator
        else factHelper(x-1,x*accumulator) // Tail recursive
      }
      factHelper(n,1)
    }
    
    @tailrec
    def concatenateString(aString:String,n:Int,accumulator:String):String={
      
      if(n<=0) accumulator
      else concatenateString(aString,n-1,aString+accumulator)
      
    }
    
    def isPrime(n:Int):Boolean = {
      @tailrec
      def isPrimeTailrec(t:Int,isStillPrime:Boolean):Boolean={
        
        if(!isStillPrime) false
        else if(t<=1) true
        else isPrimeTailrec(t-1,n%t!=0 && isStillPrime)
        
        
      }
      isPrimeTailrec(n/2,true)
    }
    
    def fibonacci(n:Int):Int = {
      
      def fiboTailrec(i:Int,last:Int,nextToLast:Int):Int={
        
        if(i>=n) last
        else fiboTailrec(i+1,last+nextToLast, last)
      }
      if (n<=2) 1
      else fiboTailrec(3,1,1)
    }
    
    
    def main(args:Array[String]):Unit={  
      
      // when you need to use loops use tail recurrsion
      println(factorial1(10))
      println(anotherFactorial(5000))
      println(concatenateString("Hello",3,""))
      
     
      
  }
}