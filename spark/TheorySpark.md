- What is Spark Context
- Difference between Spark context vs Spark Sesssion
- Explain the Architecture of Apache Spark 
- Explain Driver and Executor Process in Spark
- Explain Below 
    - Job
    - Stage
    - Task
    - Partition
    - InputSplit
    - How number of partitions are calculated while reading data.
- Explain DAG in Spark.
- Explain how spark is fault tolerant
- Explain Why Spark is faster than Hadoop
- Explain In-memory Computation of Spark
- What is RDD and explain its properties
- Features of RDD
- What are DataFrame in Spark
- What are DataSets in Spark
- Difference between RDD vs DataFrame vs Dataset
- Explain Shuffling in Spark
- Explain Caching in Spark and Different levels of Caching
- What are Different Transformation in Spark
- What are Different Actions in Spark
- Transformation vs Actions. 
- Explain Lazy Evaluation Spark
- Explain Narrow Transformation vs Wide Transformation
- Explain Stage Boundry in Spark
- What are the Different Deploy modes in Spark
- Difference between Yarn Client and Yarn cluster mode
- Explain the Role of Catalyst Optimizer in Spark
- Explain the role of Tungsten in Spark
- Explain how query life cycle (Logical and physical plan)
- Explain Repartition and coalesce and Difference between them
- What is Delta Lake ? Properties and Usecases
- What is Data Lake ? Why it is most important and draw backs
- What is small File problem in Hadoop and how delta lake addressed that issue
- Explain Delta Lake Architecture
- What is Spark streaming and what are the different steam it can support
- What is Structured Streaming
- What are D-Streams
- Explain Checkpointing in Spark Streaming
- Explain Window Operations in Spark Streaming
- Why we have specially pass the schema to Spark steam, why it cannot infer schema on its own.
- How to Achieve End to End Fault Tolerance in Spark Streaming
- Read About Below Extensivly and how will you determine the best for your job 
    - Driver Memory
    - Executor Memory
    - Num of Executors
    - Shuffle Partitions
    - Overhead Memory 
- Different modes in Spark Read : PERMISSIVE,DROPMALFORMED,FAILFAST
- Explain Broadcast Hash Join
- Explain How Sort Merge Join work
- Difference between MEMORY_ONLY and MEMORY_AND_DISK checkpointing
- Why Repartition in Bad
- Why Coalesce in bad in some situation.
- How to determine the actual number of partitions before repartitions.
- Difference between Local Temporal view and Global Temporal view.
- Difference between Managed and External Table
- Different Spark Write Modes Overwrite and Append.
- Expaling Vaccum command in Delta Lake
- Optimize in Delta Lake
- What are the operations not possible in Streaming DataFrame
- What is Adaptive Query Execution and Dynamic Partition Pruning in Spark.
- Lambda Architecture of Spark
- How many Executor can worker node hold.
- What is different between Spark Default Partitions and Spark shuffle Partitions
- What are the different system that spark can connect.
- What are the different cluster modes in DataBricks.
- What is Compaction in Delta Lake.
- Different Hints available in Spark SQL
- How Adaptive Query Enabled coverts sort merge join into Broadcast join.
- What are the main features of AQE
- Spark 3 Changes.
- Explain Shallow clone and deep clone in Spark.
- What is paired RDD
- What is Lazy transformation, Lazy evaluation of spark.
- Different Transformation 
    a. Map
    b. FlatMap
    c. filter
    d. mapPartitionWithIndex
    e. mapPartition
    f. union
    g. simple
    h. join
    i. intersection
    j. repartition
    k. coalesce
    l. sortBy
    m. orderBy
- Actions 
    a. fold
    b. foldLeft and foldRight
    c. aggregateByKey
    d. reduce
    e. reduceByKey
    f. combineByKey
    g. andThen
    h. collect
    i. show

- Explain the Use of Broadcast variable & Accumulator
- What are the Different File formats available in Hadoop
- Why Parquet is widely used.
- [Different Technique in Spark for Optimization](https://spark.apache.org/docs/latest/sql-performance-tuning.html)
    - How to Optimize skew join.
    - Broadcast Join
    - Number of shuffule partition
    - AutoBroadcast join threshold
    - Minimum number of partition
    - Hints 

# ADVANCED

- Significance of Stage Skipped in Spark
- How to pass environmental variable to spark
- How to Cache dataset if there is a looping operation (say after every 100th processing cycle)
- What is YARN 
- Explain CAP Theorem and Which part of CAP theorem does HSBASE, HDFS & CASSANDRA Follows.
- How to limit no of retries with Spark Job
    - https://www.udemy.com/course/apache-spark-interview-question-and-answer-100-faq/
- What is Data locality
- What is Speculative Execution of Spark