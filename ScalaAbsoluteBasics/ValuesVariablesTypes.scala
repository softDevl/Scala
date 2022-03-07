package SparkPack

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql._

import scala.io.Source._


object SparkObj {
  def main(args:Array[String]):Unit={
    
    println("========== values variables and types============")
    
    val x:Int =42
    val y = 52
    println(x)
    // vals are Immutable
    // Compiler can infer types
    
    val astring:String = "Hello World..!";
    val anotherstring = "goodbye"
    println(astring)
    
    
    val aBoolean: Boolean =false
    val aChar : Char = 'a'
    val anInt: Int = x
    val aShort: Short = 4613
    val aLong: Long = 234567567
    val aFloat: Float = 2.0f
    val aDouble: Double = 3.14
    
    // variables
    
    var aVariable :Int=4
    aVariable=5 //side effects
    
    
  }
}

















