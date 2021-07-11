# Basic

- How do you create Spark Context
- How to check number of partitions of Input Data
- How to check the size of the data frame.
- How to convert RDD into Data Frame
- How to Persist/Cache RDD and Data Frame
- How to create Temporary view
- Different types of Temporary view 
- How to Repartition the data and different options avaialble.
- How to create the case class and map it to RDD
- How to Create Dataset from RDD and DataFrame
- Case class alternative in PySpark
- How to get table location in Spark
- Create DataFrame with and Without specifying Schema.
- Different modes in Spark Read : PERMISSIVE,DROPMALFORMED,FAILFAST
- Estimate Size of DataFrame.
- How to Check the plan of the query.
- How to Find the Skewness in the Data
- Parse Log file using Regex and convert into DataFrame
- How to Save Data Frame into External Table
- Named Parameters to Spark Job
- How to read Image Data in Spark
- How to Call web Api from Spark
- Create a UDF to call REST API in Spark
- How to Create Dropdown parameter in DataBricks notebook.
- How to Read multiple files and folder from Spark and create a dataFrame in Spark
- How to Read Files recursively from Folder and create df 
- How to Optimize the conversion between PySpark and pandas Data Frame using Apache Arrow
- How to handle column names which contains space in Spark
- How to Write Parquet files partitioned by year,month,date
- How to get the counts of each partitions of Input Data before doing the repartition.
- How to Submit the Spark Job through Rest API
- How to Write the parquet files with custom file name instead of part-
- How to avoid _SUCCESS in writing data
- How to Append the Date to the file name so that each day new file gets created.
- How to run hadoop command from spark code like hadoop -rm 
- How to get unique numbers for column just like row_id in Oracle
- How to set the description of spark jobs/stages to view on spark UI
- How to check how much data is cached.
- How to pass in Hint in Spark SQL
- How to get list of files from which DataFrame is created.
- How to find the size of the table in Spark.
- How to find the size of the table in Spark sql way.
- Word Count Program in Spark 

# Transformation

- Example on each 
    - Map
    - FlatMap
    - filter
    - mapPartition
    - mapPartitionWithIndex
    - sample
    - union
    - repartition
    - coalesce
    - groupByKey
    - reduceBykey
    - aggregateByKey
    - sortBy
    - join
    - repartitionAndSortWithinPartitions
    - cogroup
    - cartesian



# Actions

- Example on Each one of the below
    - reduce
    - collect
    - count()
    - first()
    - take()
    - takeSample()
    - saveAsTextFile
    - countByKey
    - foreach


# Spark SQL

- How to get column Names as comma separated String
- How to rename all columns with some suffix
- How to encrypt the data of some particular column say _hash.
- How to drop the columns from DataFrame
- How to drop duplicates in Spark SQL
- Basic Spark SQL Functions
    - Select
    - filter
    - where
    - groupBy
    - SortBy
    - OrderBy ( Asc and Desc)
    - limit
- Window Functions in Spark
    - Rank
    - Dense_rank
    - ntile
    - row_number()
    - max
    - min
    - avg
    - lead
    - lag
- How to create a table in Spark SQL
- Operations on table
    - Add Column
    - Drop Column
    - Modify Data Type ( String to TimeStamp)
- Alias on Particular column
- WithRenamed Column Example
- Types of Join 
    - INNER JOIN
    - LEFT OUTER JOIN
    - RIGHT OUTER JOIN
    - FULL OUTER JOIN
    - CARTESIAN PRODUCT
    - LEFT SEMI
    - LEFT ANTI 
- How to Derive new column from existing column
- String Functions
- Data Functions
    - Current Date
    - Last day of the month
    - current time stamp
    - How to find difference of date. ( Execution time of job)
    - Months Between
    - Add Dates to current Date
    - Change Date Format to (dd-mm-yy, dd-mmm-yyyy)
- How to Check if fields exists in Dataframe
- Create new column based on condition using ( when and otherwise)
- Case Statement in Spark SQL
- Example on Like, RLIKE, LLIkE etc
- Rounding of values in Spark SQL
- How to flatten the collection. 
- How to Explode the collection.
- lit in Spark SQL
- Summary() Method in PySpark
- How to replace values in DF
- How to replace nulls in DF
- Create a test data to Create Data Frame
- How to Create millions of rows in Spark like level in Oracle. 
- Usecase for Broadcast variable and Accumulator
- Use of andThen in Spark
- How do you pivot the data
- How to unpivot the data.
- How to get difference of 2 dataset. 
- JSON Functions 
    - from_json() – Converts JSON string into Struct type or Map type.
    - to_json() – Converts MapType or Struct type to JSON string.
    - json_tuple() – Extract the Data from JSON and create them as a new columns.
    - get_json_object() – Extracts JSON element from a JSON string based on json path specified.
    -schema_of_json() – Create schema string from JSON string
- fillna() & fill() in PySpark
- Spark SQL to Find nth Highest paid Employee.
 

# File Formats

- How to Read Parquet files from HDFS
- How to read Parquet files from s3
- How to read text file and create a data frame out of it.
- How to Write Data into Parquet files into HDFS/S3 location with Partitions
- Spark Write Options ( overwrite and append)
- Read Data from XML File
- Read Data from Avro File Format
- Read Data from ORC


# JDBC Ingestion

- [Practice this Example](https://spark.apache.org/docs/latest/sql-data-sources-jdbc.html)
- How to Import data from Oracle into Hive Partition Table
- How to Export data from Hive to Oracle
- How to Parallelly import data from Oracle. 
- How to create table in Oracle if not exist before export
- create a generic package to run for all JDBC Ingestion.
- Session Parameter in Spark.


# CSV and TSV 

- How to read the csv in Spark
- How to infer schema from headers
- How to pass schema if its not available in headers (User Defined Schema)
- Read Data from CSV and Write into Parquet in one go
- Read Data from Parquet and Write it into CSV in one go


# Json

- How to read the Json in Spark
- How to read nested Json in Spark
- How to flatten the nested Json in Spark
- Read Data from JSON and Write into Parquet in one go
- Read Data from Parquet and Write it into JSON in one go

# Delta

- How to write the df into Delta Lake Format
- How to check the metadata of the Delta lake table
- How to query delta lake table with Time Travel option
- How to do upsert on Delta lake table.
- How to display the metadata of the table.
- Get History of Operations on Delta Table.
- Convert Parquet into Delta Table
- Merge Operation in Delta Lake
- Delete Operation in Delta Lake
- Vaccum Command in Delta Lake
- Optimize in Delta Lake
- Clone in Delta Lake Table
- How to convert Delta files back to Parquet
- Query on older snapshot of the table.
- Automatic Schema Updation in Spark.
- Update Table based on condition.
- Delete Table based on condition.
- Delta Live Tables
- How to get history of operations on Delta Table in DataBricks.
- Automatic Schema updation Delta Lake.
- How to convert regular tables in delta tables.



# Spark Streaming

- How to read Stream from Spark
- How to Read from file Stream
- How to read from Database table
- How to read from Kafka
- How to read from Kinesis
- How to write the stream continuosuly into table
- Demo of Windowing in Spark Streaming
- Demo on WaterMarking in Spark Streaming
- Complete POC
    - Read Database Changes and write it into Kafka using Kafka Streams
    - Read the Kafka changes using Spark Streaming and write it into Database Tables
- Read Streaming JSON data from HDFS/S3/BLOB storage using spark sql
- How to check if DataFrame is streaming data frame or not.
- How to Write Streaming Data into Snowflake
- Window Operations on Spark Streaming


# Performance Optimization

- Broadcast Hash Join.
- Theta Join.
- Demo on Salting Technique.
- Sort Merge Join

# Spark Connectivity with External System

- Read Data from Redshift
- Read Data from Snowflake
- Read Data from MongoDB
- Read Data from DynamoDB
- Read Data from Kinesis Stream
- Read and Write Data to Hudi


# Bigger POC

- Amazon EMR
    - Launch a cluster with Teraform
    - Submit the job on the cluster
    - Terminate the cluster after finishing the job.

- Step Functions :
    - Create the EMR Cluster
    - Submit the Spark Job
    - Terminate the cluster after finishing the job.

- Apache Airflow. 
    - Create Sequence of Spark Jobs
    - Kick of 3rd once 1st is finished
    - Kick of 4th and 5th Once 2nd is finished
    - Kick of 6th only if 3,4 and 5 are finished.

- How to Run Spark Job on Kubernetes Cluster.

- One Project on Spark MLlib (Movie Rating System)

# Miscellaneous

- Difference between df.count() and df.count