
# SQOOP


    - What is Sqoop
    - Default Number of Mappers in Sqoop : 4
    - Which paratmeter deterimes no of files ~ Number of Mappers
    - If Target Directory already exists then what should we do to avoid failures
        - delete-target-dir
        - append
    - Can we use -delete-target-dir and -append in same : No
    - What are important parameter for incremental import
        - incremental-append or increment-lastmodified with --append or --merge-key
        - check-column
        - last-value
    - Can we give Stirng or charactor column in check-column : NO
    - What are the best column type available for merge : INT Or Date
    - What happens if we dont give last-value : It will import all data
    - How to automatically tract and feek -last value : Use Sqoop Job
        - It will be stored in some sqoop location
    - Does sqoop reduces by default : Its only map only operation
    - Any scenario sqoop uses reducers : yes when we use --merge-key 
    - On what bases sqoop distributes into multiple mappers : primary column or split-by-key
    - To import data using query. use --query
    - Split by key is mandory for table with no primary key : Else use 1 mapper
    - How to validate data : use --validate
    - What is default format of Sqoop : Text file 
    - You can modidfy : sequence file,avro and Parquet
    - Default delimeter in sqoop : for files "," and line "\n"
    - How to handle null values in import --null-string,--null-non-string
    - import-all for all the tables 
    - Where does the sqoop last value is stored
        from a saved job: Sqoop uses it's private metastore (in /.sqoop/) or a shared metastore(as specified in sqoop-site.xml) to save job details.
    - Exclude few tables from database
        --exclude tables
    - How to Import CLOB or BLOB using sqoop :
         Apache Sqoop import command does not support direct import of BLOB and CLOB large objects. To import large objects, I Sqoop, JDBC based imports have to be used without the direct argument to the import utility.
    - Free Form Query :
        --query 
    - Why need of $CONDITIONS 
        Sqoop performs highly efficient data transfers by inheriting Hadoop's parallelism. To help Sqoop split your query into multiple chunks that can be transferred in parallel, you need to include the $CONDITIONS placeholder in the where clause of your query
    - Sqoop vs Distcp
        Sqoop for copying data from RDBMS to Haddop
        Distcp for copying data from hadoo to haddop
    - Sqoop Metastore :
        Save jobs and also saves incrmental value. 
        sqoop_site.xml
    - split-by 
        To achieve parallelism spark
    - Boundary-condition :
        Sqoop by default uses min and max , we can provide this manually.
    - When To Use Target-dir And When To Use Warehouse-dir While Importing Data :
        To specify a particular directory in HDFS use --target-dir but to specify the parent directory of all the sqoop jobs use warehouse-dir. In this case under the parent directory sqoop will cerate a directory with the same name as th e table.
    - How can you control the mapping between SQL data types and Java types?
        we can configure the mapping between by using the –map-column-java property.
        For example:
        $ sqoop import … –map-column-java id = String, value = Integer
    - Sqoop Avaialble commands :
        Available commands:
        codegen            Generate code to interact with database records
        create-hive-table  Import a table definition into Hive
        eval               Evaluate a SQL statement and display the results
        export             Export an HDFS directory to a database table
        help               List available commands
        import             Import a table from a database to HDFS
        import-all-tables  Import tables from a database to HDFS
        import-mainframe   Import mainframe datasets to HDFS
        list-databases     List available databases on a server
        list-tables        List available tables in a database
        version            Display version information
- Sqoop Options 
    
| Argument                          | Description                                                                                                                                   |
| --------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `--append`                        | Append data to an existing dataset in HDFS                                                                                                    |
| `--as-avrodatafile`               | Imports data to Avro Data Files                                                                                                               |
| `--as-sequencefile`               | Imports data to SequenceFiles                                                                                                                 |
| `--as-textfile`                   | Imports data as plain text (default)                                                                                                          |
| `--as-parquetfile`                | Imports data to Parquet Files                                                                                                                 |
| `--boundary-query <statement>`    | Boundary query to use for creating splits                                                                                                     |
| `--columns <col,col,col…>`        | Columns to import from table                                                                                                                  |
| `--delete-target-dir`             | Delete the import target directory if it exists                                                                                               |
| `--direct`                        | Use direct connector if exists for the database                                                                                               |
| `--fetch-size <n>`                | Number of entries to read from database at once.                                                                                              |
| `--inline-lob-limit <n>`          | Set the maximum size for an inline LOB                                                                                                        |
| `-m,--num-mappers <n>`            | Use _n_ map tasks to import in parallel                                                                                                       |
| `-e,--query <statement>`          | Import the results of _`statement`_.                                                                                                          |
| `--split-by <column-name>`        | Column of the table used to split work units. Cannot be used with `--autoreset-to-one-mapper` option.                                         |
| `--split-limit <n>`               | Upper Limit for each split size. This only applies to Integer and Date columns. For date or timestamp fields it is calculated in seconds.     |
| `--autoreset-to-one-mapper`       | Import should use one mapper if a table has no primary key and no split-by column is provided. Cannot be used with `--split-by <col>` option. |
| `--table <table-name>`            | Table to read                                                                                                                                 |
| `--target-dir <dir>`              | HDFS destination dir                                                                                                                          |
| `--temporary-rootdir <dir>`       | HDFS directory for temporary files created during import (overrides default "\_sqoop")                                                        |
| `--warehouse-dir <dir>`           | HDFS parent for table destination                                                                                                             |
| `--where <where clause>`          | WHERE clause to use during import                                                                                                             |
| `-z,--compress`                   | Enable compression                                                                                                                            |
| `--compression-codec <c>`         | Use Hadoop codec (default gzip)                                                                                                               |
| `--null-string <null-string>`     | The string to be written for a null value for string columns                                                                                  |
| `--null-non-string <null-string>` | The string to be written for a null value for non-string columns        

- sqopp Incrmental Options 

| Argument               | Description                                                                                                                                                         |
| ---------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `--check-column (col)` | Specifies the column to be examined when determining which rows to import. (the column should not be of type CHAR/NCHAR/VARCHAR/VARNCHAR/ LONGVARCHAR/LONGNVARCHAR) |
| `--incremental (mode)` | Specifies how Sqoop determines which rows are new. Legal values for `mode` include `append` and `lastmodified`.                                                     |
| `--last-value (value)` | Specifies the maximum value of the check column from the previous import.                                                                                           |

- Sqoop Hive Options 

| Argument                     | Description                                                                                                                                                                                                   |
| ---------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `--hive-home <dir>`          | Override `$HIVE_HOME`                                                                                                                                                                                         |
| `--hive-import`              | Import tables into Hive (Uses Hive’s default delimiters if none are set.)                                                                                                                                     |
| `--hive-overwrite`           | Overwrite existing data in the Hive table.                                                                                                                                                                    |
| `--create-hive-table`        | If set, then the job will fail if the target hive                                                                                                                                                             |
|                              | table exists. By default this property is false.                                                                                                                                                              |
| `--hive-table <table-name>`  | Sets the table name to use when importing to Hive.                                                                                                                                                            |
| `--hive-drop-import-delims`  | Drops _\\n_, _\\r_, and _\\01_ from string fields when importing to Hive.                                                                                                                                     |
| `--hive-delims-replacement`  | Replace _\\n_, _\\r_, and _\\01_ from string fields with user defined string when importing to Hive.                                                                                                          |
| `--hive-partition-key`       | Name of a hive field to partition are sharded on                                                                                                                                                              |
| `--hive-partition-value <v>` | String-value that serves as partition key for this imported into hive in this job.                                                                                                                            |
| `--map-column-hive <map>`    | Override default mapping from SQL type to Hive type for configured columns. If specify commas in this argument, use URL encoded keys and values, for example, use DECIMAL(1%2C%201) instead of DECIMAL(1, 1). |

- Sqoop Eval Options 

    sqoop eval --connect jdbc:mysql://db.example.com/corp --query "SELECT * FROM employees LIMIT 10"