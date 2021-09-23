# Introduction 

- [Architecutre of Spark](https://spark.apache.org/docs/latest/cluster-overview.html)
- [Spark Ecosystem](https://data-flair.training/blogs/apache-spark-ecosystem-components/)
- [What is Spark Context and Spark Session](https://data-flair.training/blogs/learn-apache-spark-sparkcontext/) 
- [Features of Spark ](https://data-flair.training/blogs/apache-spark-features/)
- [Why Spark better than Hadoop or MR](https://intellipaat.com/blog/what-is-apache-spark/)
- [Major Version of Spark](https://spark.apache.org/history.html)
- [How Spark is fault tolerant](https://data-flair.training/blogs/fault-tolerance-in-apache-spark/)
- [Role of YARN in Apache Spark ](https://blog.knoldus.com/understanding-how-spark-runs-on-yarn-with-hdfs/)
- [YARN Client Mode vs Cluster mode](https://blog.knoldus.com/understanding-how-spark-runs-on-yarn-with-hdfs/)

# RDDs

- [What is RDD and Its Importance](https://spark.apache.org/docs/latest/rdd-programming-guide.html)
- [Ways to create RDDs](https://data-flair.training/blogs/create-rdds-in-apache-spark/)
- [RDD Features](https://data-flair.training/blogs/apache-spark-rdd-features/)
- [RDD Limitations](https://data-flair.training/blogs/apache-spark-rdd-limitations/)
- [What is Transformation and Action](https://data-flair.training/blogs/spark-rdd-operations-transformations-actions/)
- [Paired RDD](https://data-flair.training/blogs/spark-paired-rdd/)
- [Transformation]()
    - [Map](http://apachesparkbook.blogspot.com/search/label/a56%7C%20map%28%29)
    - [FlatMap](http://apachesparkbook.blogspot.com/search/label/a56%7C%20flatMap%28%29)
    - [Filter](http://apachesparkbook.blogspot.com/search/label/a66%7C%20filter%28%29)
    - [MapPartiion](https://stackoverflow.com/questions/21185092/apache-spark-map-vs-mappartitions)
    - [MapPartiionWithIndex](http://apachesparkbook.blogspot.com/search/label/a56%7C%20mapPartitionsWithIndex%28%29)
    - [Sample](http://apachesparkbook.blogspot.com/search/label/a52%7C%20takeSample%28%29)
    - [Union](http://apachesparkbook.blogspot.com/search/label/a62%7C%20intersection%28%29)
    - [Intersect](http://apachesparkbook.blogspot.com/search/label/a62%7C%20intersection%28%29)
    - [distinct](http://apachesparkbook.blogspot.com/search/label/a62%7C%20intersection%28%29)
    - [GroupByKey](http://apachesparkbook.blogspot.com/search/label/a72%7C%20groupByKey%28%29)
    - [SortByKey](http://apachesparkbook.blogspot.com/search/label/a66%7C%20groupBy%28%29)
    - [ReduceByKey](http://apachesparkbook.blogspot.com/search/label/a72%7C%20reduceByKey%28%29)
    - [aggregateByKey](https://medium.com/@yesilliali/apache-spark-understanding-zerovalue-in-aggregatebykey-function-3d7df62567ae)
    - [GroupBy](http://apachesparkbook.blogspot.com/search/label/a72%7C%20groupByKey%28%29)    
    - [Joins](http://apachesparkbook.blogspot.com/search/label/a74%7C%20join%28%29)

       - LeftOuterjoin
       - rightOuterjoin 
       - fullOuterjoin

    - [Repartition](http://apachesparkbook.blogspot.com/search/label/d13%7C%20repartition%28%29)
    - [Colesce](http://apachesparkbook.blogspot.com/search/label/d13%7C%20repartition%28%29)
    - [Cogroup](http://apachesparkbook.blogspot.com/search/label/a66%7C%20groupBy%28%29)

- [Actions]()
    - [collect](https://spark.apache.org/docs/latest/rdd-programming-guide.html#actions)
    - [take](https://spark.apache.org/docs/latest/rdd-programming-guide.html#actions)
    - [head](https://spark.apache.org/docs/latest/rdd-programming-guide.html#actions)
    - [reduce](http://apachesparkbook.blogspot.com/search/label/a52%7C%20reduce%28%29)
    - [fold](http://apachesparkbook.blogspot.com/search/label/a52%7C%20reduce%28%29)
  

- [Explain DAG in Spark ](https://data-flair.training/blogs/dag-in-apache-spark/)
- [Lazy Evaluation ](https://data-flair.training/blogs/apache-spark-lazy-evaluation/)
- [In Memory Transformation](https://data-flair.training/blogs/spark-in-memory-computing/)
- [RDD Cache ](https://data-flair.training/blogs/spark-in-memory-computing/)
- [RDD Persist](https://data-flair.training/blogs/spark-in-memory-computing/)
- [map vs flatMap](https://data-flair.training/blogs/apache-spark-map-vs-flatmap/)
- [RDD Read ( TextFiles vs WholeTextFiles vs sequencefile)](https://spark.apache.org/docs/latest/rdd-programming-guide.html)
- [Difference Between Map and Map Partitions](https://intellipaat.com/community/6560/apache-spark-map-vs-mappartitions)
- [Difference Between Map Partition and Map Parition with Index]()
- [Difference bweween reduceByKey , aggregateByKey and groupByKey](https://www.edureka.co/community/11996/groupbykey-vs-reducebykey-in-apache-spark)
- [Why Collect should not be used in program](https://umbertogriffo.gitbook.io/apache-spark-best-practices-and-tuning/dont_collect_large_rdds)
- [Difference Between Repartition and coalesce](https://medium.com/@mrpowers/managing-spark-partitions-with-coalesce-and-repartition-4050c57ad5c4)

# DataFrames 

 - [What are DataFrames ](https://databricks.com/blog/2015/02/17/introducing-dataframes-in-spark-for-large-scale-data-science.html)
 - [Difference between DataFrames and RDD](https://databricks.com/blog/2016/07/14/a-tale-of-three-apache-spark-apis-rdds-dataframes-and-datasets.html)
 - [DataFrame Operations]()
    - [Select ](https://spark.apache.org/docs/2.2.0/sql-programming-guide.html)
    - [filter](https://sparkbyexamples.com/spark/working-with-spark-dataframe-filter/)
    - [Distinct](https://sparkbyexamples.com/spark/spark-remove-duplicate-rows/)
    - [GroupBy](https://sparkbyexamples.com/spark/using-groupby-on-dataframe/#agg)
    - [WithColumn](https://sparkbyexamples.com/spark/spark-dataframe-withcolumn/)
    - [WithColumnRenamed](https://sparkbyexamples.com/spark/spark-dataframe-withcolumn/)
    - [OrderBy](https://sparkbyexamples.com/spark/spark-how-to-sort-dataframe-column-explained/)
    - [Distribute By](https://deepsense.ai/optimize-spark-with-distribute-by-and-cluster-by/)
    - [Join ](https://sparkbyexamples.com/spark/spark-sql-dataframe-join/)
        - Inner Join
        - Left Outer Join 
        - Right Outer Join 
        - Full Outer Join 
    - [Caching](https://spark.apache.org/docs/2.2.0/sql-programming-guide.html) 
        - Cache
        - Persist
    - [Repartition](https://sparkbyexamples.com/spark/spark-repartition-vs-coalesce/) 
        - repartiion
        - coalesce
    - [Convert Data Frame to RDD](https://stackoverflow.com/questions/32531224/how-to-convert-dataframe-to-rdd-in-scala)
    - [Explain Tungsten ](https://databricks.com/blog/2015/04/28/project-tungsten-bringing-spark-closer-to-bare-metal.html)
    - [Explain Catalyst](https://databricks.com/blog/2014/03/26/spark-sql-manipulating-structured-data-using-spark-2.html)
    - [Read About Spark SQL Execution plan](https://www.youtube.com/watch?v=AoVmgzontXo)
    - [Spark Join Optimization](https://www.youtube.com/watch?v=fp53QhSfQcI)
        - Theta Join
        - [Salting] (https://medium.com/appsflyer/salting-your-spark-to-scale-e6f1c87dd18)
        - Few more from Spark Summit
    - [Spark Memory Architecutre]()
    - [How can you make sure , Min file size is 200 MB in Spark]()
    - [How to Avoid Small file problem in Spark]()
    - [Create DataFrame without using Case Class]()
    - [List of Functions avaialble on org.apache.spark.sql.fucntions]()
    - [Lit]()    
    - [regexreplace]()
    - [Difference between where and filter]()
    - [Analytical Functions](https://sparkbyexamples.com/spark/spark-sql-window-functions/)
        - Rank
        - Row_number
        - Sum
        - percent_rank
        - Dense_Rank
        - ntile
        - cume_dist
        - lead
        - lag 

# DataSets

   - [What are Datasets](https://www.youtube.com/watch?v=jbclxiAaKFQ)
   - [When they are introduced](https://databricks.com/blog/2016/01/04/introducing-apache-spark-datasets.html)
   - [Difference Between Datsets vs Dataframes](https://databricks.com/blog/2016/07/14/a-tale-of-three-apache-spark-apis-rdds-dataframes-and-datasets.html)
   - [RDDs vs DataFrams vs DataSets (Spark Summit)](https://www.youtube.com/watch?v=Ofk7G3GD9jk)
   - [DataSet Operations]()
    - [Select ](https://spark.apache.org/docs/2.2.0/sql-programming-guide.html)
    - [filter](https://sparkbyexamples.com/spark/working-with-spark-dataframe-filter/)
    - [Distinct](https://sparkbyexamples.com/spark/spark-remove-duplicate-rows/)
    - [GroupBy](https://sparkbyexamples.com/spark/using-groupby-on-dataframe/#agg)
    - [WithColumn](https://sparkbyexamples.com/spark/spark-dataframe-withcolumn/)
    - [WithColumnRenamed](https://sparkbyexamples.com/spark/spark-dataframe-withcolumn/)
    - [OrderBy](https://sparkbyexamples.com/spark/spark-how-to-sort-dataframe-column-explained/)
    - [Distribute By](https://deepsense.ai/optimize-spark-with-distribute-by-and-cluster-by/)
    - [Join ](https://sparkbyexamples.com/spark/spark-sql-dataframe-join/)
        - Inner Join
        - Left Outer Join 
        - Right Outer Join 
        - Full Outer Join 
    - [Caching](https://spark.apache.org/docs/2.2.0/sql-programming-guide.html) 
        - Cache
        - Persist
    - [Repartition](https://sparkbyexamples.com/spark/spark-repartition-vs-coalesce/) 
        - repartiion
        - coalesce
   - [Convert Data Sets to RDD](https://medium.com/@InDataLabs/converting-spark-rdd-to-dataframe-and-dataset-expert-opinion-826db069eb5)
   - [Convert RDD to DataFrame](https://medium.com/@InDataLabs/converting-spark-rdd-to-dataframe-and-dataset-expert-opinion-826db069eb5)
   - [Convert DataFrame to Dataset](https://medium.com/@InDataLabs/converting-spark-rdd-to-dataframe-and-dataset-expert-opinion-826db069eb5)
   - [Convert RDD to Datasets](https://medium.com/@InDataLabs/converting-spark-rdd-to-dataframe-and-dataset-expert-opinion-826db069eb5)


# Other Important Topics 
   - [Why Parquet & why not orc ](https://www.youtube.com/watch?v=NZLrJmjoXw8)
   - [Parquet In Depth](https://www.youtube.com/watch?v=_0Wpwj_gvzg)
   - [Spark Configuration](https://spoddutur.github.io/spark-notes/distribution_of_executors_cores_and_memory_for_spark_application)
       - Num of Executors 
       - Executor Memory
       - Driver Memory
       - Driver cores
       - Executor Cores
       - Spark Overhead Memory
   - [Why Hive Queries runs faster on Spark](https://www.youtube.com/watch?v=AoVmgzontXo)
   - [Spark Deploy Modes](https://stackoverflow.com/questions/41124428/spark-yarn-cluster-vs-client-how-to-choose-which-one-to-use/41142747)
   - [Spark on EMR]()
       - [Best Practises]()
       - [Best Paramter Setting]()
       - [How to Enable and Disable Setting]()
       - [What instance to Use]()
       - [Orchestration using Step Function]()
       - [Orchestration using Airflow]()
       - [Draw Plots using Spark Notebook]()
    - [Accumlators and Broadcast variables](https://github.com/vaquarkhan/vaquarkhan/wiki/What-are-broadcast-variables-and-accumulators-in-Apache-Spark%3F-Answer-Request)
    - [SparkUDF](https://medium.com/@achilleus/spark-udfs-we-can-use-them-but-should-we-use-them-2c5a561fde6d)
    - [Sql at scale with apache spark sql](https://towardsdatascience.com/sql-at-scale-with-apache-spark-sql-and-dataframes-concepts-architecture-and-examples-c567853a702f)
    - [All Important Quesition Explaination](https://www.youtube.com/watch?v=jBArqO7isdg&list=PL9sbKmQTkW05mXqnq1vrrT8pCsEa53std)
    - [Spark Session vs Spark Context](https://www.youtube.com/watch?v=ngWCBq58CJs)
    - [Speculative Execution in Spark]()
    - [Adaptive Shuffling ](https://databricks.com/session/an-adaptive-execution-engine-for-apache-spark-sql)
    -[Iterative Broadcast Join](https://github.com/godatadriven/iterative-broadcast-join)
    - [Whole Code Generation](https://www.youtube.com/watch?v=RlbBPrWJEEM)

# Spark Performance Tuning

  - [How to Find Ideal Spark Config Parameter](https://spoddutur.github.io/spark-notes/distribution_of_executors_cores_and_memory_for_spark_application)
  - [Spark Join Optimization](https://www.youtube.com/watch?v=fp53QhSfQcI)
  - [Spark Disk Optimization]()
  - [Spark how to make sure, data is not skewed](https://www.youtube.com/watch?v=6zg7NTw-kTQ)
  - [Spark Memory Management](https://www.youtube.com/watch?v=dPHrykZL8Cg)
  - [Developer View of Spark Model](https://www.youtube.com/watch?v=-Aq1LMpzaKw)
  - [Cost Based Optimizer in Apache Spark 2 2](https://www.youtube.com/watch?v=qS_aS99TjCM)
  - [Spark's Performance: The Past, Present, and Future](https://www.youtube.com/watch?v=RlbBPrWJEEM)
  - [Apache Spark Performance Troubleshooting](https://www.youtube.com/watch?v=JoQ8m-kM_ZY)
  - [Deep Dive into Monitoring Spark Applications](https://www.youtube.com/watch?v=mVP9sZ6K__Y)
  - [Apache Spark Core : Deep Dive Proper Optimization](https://www.youtube.com/watch?v=daXEp4HmS-E)
  - [Understanding Query Plans and Spark UIs](https://www.youtube.com/watch?v=YgQgJceojJY)
  - [Structuring Apache Spark 2.0: SQL, DataFrames, Datasets And Streaming](https://www.youtube.com/watch?v=1a4pgYzeFwE)
  - [L1,L2 & L3 Cache]()

# Spark Streaming

   - [Read Data From S3 and write to table]()
   - [Read Data from Kafka and write to table]()
   - [Read Data from Kinesis and write it to table]()
   - [Read Data From Twitter]()
   - [DStreams in Spark ]()
   - [What is Structured Steaming](https://www.youtube.com/watch?v=rl8dIzTpxrI)
   - [Read Data From Database and write it into S3]()
    

# Spark ML

   - [Employee Attrition Project]()
   - [Movie Rating Project]()
   - [Telecom Churn Prediction]()

# Practicals 

   - [Read CSV and Store as Table]()
   - [Read TSV and Store as Table ]()
   - [Read JSON and Store as Table]()
   - [Read XML and Store as Table ]()
   - [Write Table in Parquet, CSV , TSV ]()
   - [Read Data from Database]()
   - [Bucketize column like 1-10,2-20 etc]()
   - [Create External Table]()
   - [Dyanamic Partion in Spark sql]()
   - [Example on ]()
        - [Sort Merge Join]()
        - [Broadcast Hash Join]()
        - [Shuffl hash Join]()
        - [Theta join]()
        - [Cartesign Join]()

  - [Read EMP,DEPT,Salgrade from Database]()
       - [Nth Highest Paid Employe]()
       - [Join Emp and Dept Table - Inner,Left,full]()
       - [Get Rank of Each Employee based on Sal]()
       - [Get Rank of Each Employe by job]() 
       - [Lead,Lag,Dense_rank on Emp Salary]()
       - [Employee with Manager Details]()
       - [Distinct Jobs]()
       - [Union, Union All and Intersect Example]()
       - [Get Salary Rank]()
       - [Total Salary of Employee sal+comm]()
       - [List of Employee with no commision]()
  - [Example on Braodcast variable and Accumulator]()

# PySpark

   - [Why Pyspark is slower than Scala]()
   - [Lambda Expression in Python]()
   - [How to Run spark submit in pyspark]()
   - [Examples of Spark core]()
        - [Transformation]()
        - [Actions]()
   - [Best Practises in Pyspark]()
   - [Pyspark on Jupiter Notebook]()
   - [Can we integrate pandas in Spark Code]()
   - [Data Frame Operations in Pyspark]()
   - [List in Python]()
   - [Create RDD from List in Python]()
   - [case class in Python]()
   - [Convert RDD to DataFrame in Python](https://stackoverflow.com/questions/39699107/spark-rdd-to-dataframe-python)
   - [Advantages of Pyspark over Scala]()
   - [Pyfiles]()
   - [Profilers in Pyspark]()