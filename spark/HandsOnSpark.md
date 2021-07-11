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

# Transformation
# Actions
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




# File Formats

- How to Read Parquet files from HDFS
- How to read Parquet files from s3
- How to read text file and create a data frame out of it.


# JDBC Ingestion

# CSV and TSV 

- How to read the csv in Spark
- How to infer schema from headers
- How to pass schema if its not available in headers (User Defined Schema)
- 


# Json

- How to read the Json in Spark
- How to read nested Json in Spark
- How to flatten the nested Json in Spark

# Delta

- How to write the df into Delta Lake Format
- How to check the metadata of the Delta lake table
- How to query delta lake table with Time Travel option
- How to do upsert on Delta lake table.
- How to display the metadata of the table.


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


# Performance Optimization

- Broadcast Hash Join.
- Theta Join.
- Demo on Salting Technique.
- Sort Merge Join


