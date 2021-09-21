# Basics

- [Features of Hive and Limitations](https://data-flair.training/blogs/apache-hive-architecture/)
- [Hive Architecture](https://data-flair.training/blogs/apache-hive-metastore/)
- [Hive MetaStore](https://data-flair.training/blogs/apache-hive-metastore/)
- [Hive Data Type](https://cwiki.apache.org/confluence/display/hive/languagemanual+types)
- [Hive Complex Data types](https://data-flair.training/blogs/hive-data-types/)
- [Hive String Functions](https://www.educba.com/hive-string-function/)
- [Hive Date Functions](https://www.educba.com/date-functions-in-hive/?source=leftnav)
    - current_date
    - day
    - year
    - to_date
    - unix_timestamp
    - Covert String into Date Format
- [Hive Supported File Formats](https://dwgeek.com/hive-different-file-formats-text-sequence-rc-avro-orc-parquet-file.html/)
- [Hive Set Commands](http://hadooptutorial.info/hive-interactive-shell-commands/#:~:text=But%20Hive%20SET%20command%20provides,be%20overridden%20by%20Set%20Command.)
- [NVL in Hive](https://stackoverflow.com/questions/52404789/replace-empty-string-in-hive-nvl-and-coalesce-tried)
- [Managed Tables vs External Table](https://data-flair.training/blogs/hive-internal-tables-vs-external-tables/)



----

# Joins

 - [Hive Join Types](https://data-flair.training/blogs/hive-join/)
    - Inner Join
    - Left Outer Join
    - Right Outer Join
    - Cartesign
 - [Hive Map Join](https://data-flair.training/blogs/map-join-in-hive/)
 - [Hive Sort Merge Bucket Join](https://data-flair.training/blogs/hive-sort-merge-bucket-join/)
 - [Hive Bucket Map Join](https://data-flair.training/blogs/bucket-map-join/)
 - [Hive Skew Join](https://data-flair.training/blogs/hive-sort-merge-bucket-join/)

------

# Partitions and Bucketing

- [Types of Partition](https://data-flair.training/blogs/apache-hive-partitions/)
  - Static Partition
  - Dynamic Partition
- [Explain Hive Bucketing](https://data-flair.training/blogs/bucketing-in-hive/)
- [Paramters of Dynamic Partition](https://stackoverflow.com/questions/24238583/hive-dynamic-partitioning)

---------------

# Performance Tuning

 - [Vectorization](https://cwiki.apache.org/confluence/display/hive/vectorized+query+execution)
 - [Types of Indexing in Hive](https://cwiki.apache.org/confluence/display/Hive/LanguageManual+Indexing)
    - Compact 
    - BitMap Index
 - [Cost Based Optimization](https://data-flair.training/blogs/hive-optimization-techniques/)
 - [How to Avoid Skewness in Hive](https://data-flair.training/blogs/skew-join-in-hive/)
 - [Tez Execution Engine](https://stackoverflow.com/questions/41630987/tez-execution-engine-vs-mapreduce-execution-engine-in-hive)



# Other Topics

 - [Managed Table vs External Table](https://cwiki.apache.org/confluence/display/Hive/Managed+vs.+External+Tables)
 - [Difference Between ORDER BY vs SORT BY vs Cluster BY](https://cwiki.apache.org/confluence/display/Hive/LanguageManual+SortBy)
 - [Difference Between Partition and Bucketing](https://stackoverflow.com/questions/19128940/what-is-the-difference-between-partitioning-and-bucketing-a-table-in-hive) 
 - [Hive UDFs](https://data-flair.training/blogs/hive-udf/)
 - [Hive Script variable](https://stackoverflow.com/questions/12464636/how-to-set-variables-in-hive-scripts)
 - [Difference between Beeline and Hive](https://docs.cloudera.com/HDPDocuments/HDP2/HDP-2.3.2/bk_dataintegration/content/beeline-vs-hive-cli.html)
 - [Difference between impala and Hive](https://data-flair.training/blogs/impala-vs-hive/)

------------------

# Practicals

 - [Load XML Data into Hive](https://stackoverflow.com/questions/15894110/how-to-load-xml-data-file-into-hive-table)
 - [Create Hive Partition Table](https://www.edupristine.com/blog/hive-partitions-example)
 - [Create Hive Bucketing Table](https://www.javatpoint.com/bucketing-in-hive)
 - [Load CSVs in Hive](https://sparkbyexamples.com/apache-hive/hive-load-csv-file-into-table/)
 - [Load JSONs in Hive](https://stackoverflow.com/questions/41453646/loading-json-file-in-hive-table)
 - [Flatten(explode) Query in Hive](https://www.projectpro.io/recipes/explain-use-of-explode-and-lateral-view-hive)
 - [Access Complex data structure in Hive](https://www.edureka.co/community/51200/hive-complex-data-types)
 - [Execute File with hive](https://community.cloudera.com/t5/Support-Questions/How-to-run-all-of-hive-queries-in-a-file-in-one-go/td-p/121367)


# Other Important Questions :

      - What is the default location of Hive Tables
      - Default Metastore
      - Temporary Table in Hive
      - Different types of table
      - Default Terminator in Hive 
         - line terminator
         - Field Terminator
      - How to Get Schema of the table
      - How to Describe Data
      - How do you convert Multiple rows into Single Object : Collect or CollectSet
      - How to Covert Array into Individual Rows 
         - Explode
         - Lateral view explode
         - posexplode
      - Different types of Index : Compact and BitMap
      - Types of Partitions
      - Where NULL and empty values goes in case of partitions
      - Can we use Dynamic Partion for Load Data Command
      - Can we update and delete in Hive : 
         - If table is transaction and file format is ORC
         - With some limitations though
      - MSCK Command
      - Does Hive Support Truncate and Delete
      - How many reducer will be called while loading data into bucket : no_of_buckets = no_of_reducers
      - How bucketing works
      - Why Bucket join is faster
      - How to export hive data into Hive location 
         - Insert local directory ''
      - How to execute file from Hive terminal : hive -f x.hql
      - How to execute query from terminal : hive -e "select * from emp"
      - File Formats supported by Hive
      - Hive Serde
      - What are the complex types in Hive : Array, May and Struct
      - Vectorization in Hive 
      - Advantage of Bucketing
      - Use of hive.exec.parallel=true
      - Does Hive suitable for OLTP
      - How to Check Partitions in Hive
      - Can we add partition column after creating table : No
      - How to create table structure from another table : ctas like 'tableName'