package PatternMatching

object AllPatterns {
  //1- constants
  val x:Any = "Scala"
  val constants = x match{
    case 1 => " a number"
    case "Scala" => "The Scala"
    case true => "The truth"
    case AllPatterns => "A singleton Object"
      
  }
  //2 - match anything
  //2.1 wildcard
  
  val matchAnything = x match{
    case _ =>
  }
  
  //2.2 variable
  
  val matchVariable =  x match{
    case something => s"I've found $something"
    
  }
  
  //3 tuples
  
  val aTuple = (1,2)
  val matchATuple = aTuple match{
    case (1,1) =>
    case (something,2) => s"I've found $something"
  }
  
  val nestedTuple = (1,(2,3))
  val matchNestedTuple = nestedTuple match{
    case (_, (2,v)) =>
  }
  
  //4 - case classes - constructor pattern
  val aList: MyList[Int] = Cons(1,Cons(2,Empty))
  val matchAList = aList match{
    case Empty =>
    case Cons(head,Cons(subhead,subtail))=>
  }
  
  //5 list patterns
  
  val astandardList = List(1,2,3,42)
  val standardListMatching = astandardList match{
    case List(1,_,_,_) =>//extractor
    case List(1,_) =>// list of aribitary length - advanced
    case 1:: List(_)=> //infix pattern
    case List(1,2,3) :+42 =>//infix patter
  }
  
  //6 type specifiers
  
  val unknown:Any =2
  val unknownMatch = unknown match{
    case list: List[Int] =>// explicit type specifier
    case _ =>
  }
  
  // 7- name binding
  val nameBindingMatch = aList match{
    case nonEmpltyList @ Cons(_,_)=> // name binding => use name later (here)
    case Cons(1,rest @Cons(2,_) =>
  }
  
  //8 multi patterns
  
  val multipattern = aList match{
    case Empty | Cons(0,_) =>
  }
  
  // 9 if guards
  val secondElementSpecial = aList match{
    case Cons(_,Cons(specialElement,_)) if specialElement%2==0=>
      
      
  }
  //ALL
  
  val numbers = List(1,2,3)
  val numbersMatch = numbers match{
    case listofString: List[string]=>"a list of strings"
    case listofNumbers : List[Int] =>"a list of numbers"
    case _ =>""
  }
  println(numbersMatch)
  
  // JVM tric question
  
}













