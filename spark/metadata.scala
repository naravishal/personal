import org.apache.spark.sql.SparkSession

case class Metadata(
  databaseName: String,
  tableName:    String,
  columNames:   String)

object metaDataExtractor {

  def main(args: Array[String]): Unit = {
    println("Hello World")

    val spark = SparkSession.builder.master("local[*]").appName("SimpleApp").getOrCreate()

    spark.sql("truncate table audit_table").show()

    val databaseDf = spark.sql("show databases")

    val databaseList = databaseDf.select("databaseName").collect().map(_(0).toString).toList

    val finalDf = databaseList.foreach(databaseName => {

      spark.sql("use" + databaseName)
      val tableNameDf = spark.sql("show tables")
      val tableList = tableNameDf.select("tableName").collect().map(_(0).toString).toList

      val tableMetadata = tableList.map(tableName => {
        val columnList = try {
          val columnList = spark.table(tableName).columns.mkString(",")

        } catch {
          case e: Exception => "Dont have access to list columns for this table"
        }
        (databaseName, tableName, columnList)

      })

      import spark.implicits._

      val df = tableMetadata.toDF("DatabaseName", "TableName", "ColumnNames")

      df.write.format("hive").saveAsTable("tableName")

    })

    spark.stop()
  }

}