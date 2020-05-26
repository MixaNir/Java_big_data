import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object LR10 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("LR10").setMaster("local[*]")
    val sc = new SparkContext(conf);
    val spark = SparkSession.builder.appName("Test app").getOrCreate()
    val datafile = spark.read
      .format("com.databricks.spark.csv")
      .option("header",true)
      .load("C:/Users/mixan/IdeaProjects/Lab10/netflix_titles.csv")
    datafile.createOrReplaceTempView("Netflix_titles")
    // Вывод информации о всех произведениях 2019 года
    spark.sql("SELECT `title`, `type`, `country` FROM Netflix_titles WHERE `release_year` = 2019").show()
    // Вывод количества произведений каждого типа
    spark.sql("SELECT `type`, COUNT(`title`) as count FROM Netflix_titles group by `type`").show()
    // Поиск произведений из United Kingdom с возрастным ограничением 14 лет
    spark.sql("SELECT `title`, `description` FROM Netflix_titles WHERE `country` = 'United Kingdom' AND `rating` = 'TV-14'").show()
    spark.stop()
  }
}
