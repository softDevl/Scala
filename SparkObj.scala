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
      
    val conf = new SparkConf().setAppName("sparkDemo").setMaster("local[*]")
    
    val sc = new SparkContext(conf)
    
    val spark = SparkSession.builder().getOrCreate()
    
    import spark.implicits._
    
    // To load the data
    val df =  spark.read
                    .format("csv")
                    .option("header","true")
                    .load("file:///I:/bank_prospects.csv")
    //Convert string to int and float
    val dfCast =  df.withColumn("Age", col("Age").cast(IntegerType))
                 .withColumn("Salary", col("Salary").cast(FloatType))
                 
    /*val mean_age_val = dfCast.select(mean(dfCast("Age")).alias("Age"))*/
    
    // replace value with nulls with if condition            
    val dfReplace =  dfCast.withColumn("Age",when(col("Age").isNull,0).otherwise(col("Age")))
                            .withColumn("Salary",when(col("Salary").isNull, 0).otherwise(col("Salary")))

    dfReplace.show()

  }
}