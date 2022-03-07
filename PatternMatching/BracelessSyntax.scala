package PatternMatching

object BracelessSyntax extends App {
  
  // if -expression
  val anIfExpression = if(2>3) "bigger" else "smaller"
  
   //compact
    val anIfExpression_v3 = 
      if(2>3) "bigger"
      else "smaller"
   // scala3
    val anIfExpression_v4 = 
      if 2 > 3 then
        "bigger"
      else
        "smaller"
    
    val anIfExpression_v5 = 
      if 2 > 3 then
        "bigger"
      else
        "smaller"
       
       
  
  def main(args:Array[String]):Unit={
    
  }
}