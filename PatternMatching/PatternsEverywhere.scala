package PatternMatching

object PatternsEverywhere extends App{
  
  //big idea #1
  
  try{
    //code
  }catch{
      case e:RuntimeException => "runtime"
      case npe: NullPointerException =>"npe"
      case _ => "something else"
  }
  
/*  try{
    
  }catch (e){
    e match{
      case e:RuntimeException => "runtime"
      case npe: NullPointerException =>"npe"
      case _ => "something else"
    }
  }*/
  // big idea #2
  
  val list = List(1,2,3,4)
  val evenOnes = for{
    x<- list if x%2 ==0
  }yield 10*x
  
  // generators also based on pattern matching
  
  val tuples =List((1,2),(3,4))
  val filterTuples  = for{
    (first,second) <- tuples
  }yield first*second
 
  //bigidea 3
  val tuple = (1,2,3)
  val (a,b,c) = tuple
  println(b)
  
  //multiple value definitions based on Pattern Matching
  val head :: tail = list
  println(head)
  println(tail)
  
  // bigidea #4 - new
  // partial function
  
  val mappedList = list.map{
    case v if v %2 ==0 => v+ "is even"
    case 1 =>"the one"
    case _ => "something else"
      
  }
}












