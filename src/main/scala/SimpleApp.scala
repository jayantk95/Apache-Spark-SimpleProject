import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkContext				
import org.apache.spark.SparkConf
object SimpleApp {
  def main(args: Array[String]) {
    val conf = new SparkConf().setMaster("local[2]").setAppName("Spark pi")
    val ssc = new SparkContext(conf)
    val logFile = "YOUR DATASET FILE PATH" 
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("scala")).count() //CHANGE THE WORD YOU WANT TO SEARCH
    val numBs = logData.filter(line => line.contains("java")).count() //CHANGE THE WORD YOU WANT TO SEARCH
    println(s"Number of Logins: $numAs, Number of Logouts: $numBs")
    ssc.stop()
  }
}
