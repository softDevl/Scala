package PatternMatching

import scala.util.Random

object PatternMatch extends App {
  // switch on steroids  
  val random = new Random
  val x = random.nextInt(5)
  
  val description = x match {
    case 1 => "the One"
    case 2 => "double or nothing"
    case 3 => "third time is the charm"
    //default
    case _ => "something else" // =wild card
  }
  
  println(x)
  println(description)
  
  // 1. Decompose values
  case class Person(name:String, age:Int)
  val bob = Person("Bob",20)
  
  val greeting = bob match{
    case Person(n,a) if a<21 => s"Hi my name is $n and Iam $a years can't drink in US"
    case Person(n,a) => s"Hi my name is $n and Iam $a years"    
    case _ => "I don't know who I am"
  }
  println(greeting)
  /*
   * cases are matched in order
   * what if no cases matched
   * type of pattern match expression?unified all type of all cases
   * PM works well with case classes
   */
  
  //PM on sealed hierarchies
  sealed class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot(greeting : String) extends Animal
  
  val animal: Animal = Dog("Terra Nova")
  animal match{
    case Dog(someBreed) => println(s"Matched dog $someBreed breed")
  }
  
  // match everything
  val isEven = x match{
    case n if n%2 == 0 =>true
    case _ => false
  }
  
  //why?
  val isEvenCond = if(x%2 == 0) true else false
  val isEvenNormal = x%2 == 0
  
  /*
   * excercise
   * simple function uses pm
   * takes and expr => human readable forces
   * 
   * Sum(Number(2),Number(3)) => 2+3
   */
  trait Expr
  case class Number(n:Int) extends Expr
  case class Sum(e1:Expr,e2:Expr) extends Expr
  case class Prod(e1:Expr, e2:Expr) extends Expr
  
  def show(e:Expr):String = e match{
    case Number(n) => s"$n"
    case Sum(e1,e2) => show(e1) +" + " + show(e2)
    case Prod(e1,e2) => {
      def maybeShowParanthesis(exp:Expr) = exp match{
        case Prod(_ , _) =>show(exp)
        case Number(_) => show(exp)
        case _ => "("+ show(exp) +")"
      }
      maybeShowParanthesis(e1) + "*" + maybeShowParanthesis(e2)
    }       
  }
  println(show(Sum(Number(2), Number(3))))
}
