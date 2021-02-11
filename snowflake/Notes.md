# Snowflake


Primary Features

```
- Build for Cloud
- Software as Service
- Pay only used for Storage and compute
- Scalalable
```

Create Dadatbase

```sql
create database database_name;
```

Staging Aread

    - Can be Internal
    - Can be in Cloud like ( s3, Blob Storage , GCP)

```sql
create or replace state my_stage url='s3://'
```

Loading Data

```sql
copy into table from s3://bucket/file_name file format =(type=csv)';
```

#### Pricing

4 ways Snowflake can be charged

- Storage
- Compute
    - loading
    - processing
    - only for actual usage
    - virtual warehouse
    - by Credits
- Data Transfer 
    - No Cost for Data in
    - Cost for Data Out
- Metadata : No Cost


#### Tools

- Command line
- Snow-sql 
- snowflake jdbc

#### Architecture

There are basic 2 types of DW architecture

- Shared Disk
    - One common disc is shared by multiple CPU
    - Advantage scalable in compute
    - Disadvantage Huge I/O cost so performance degradation.

- Shared Nothing
    - Each Machine has his own disk
    - Advantage No I/O cost
    - Disadvantage : If there is increase in Storage and compute has to be increased.

- Hybrid : 
    Snow flake follow Hybrid Architecture 
    [Image Here]

- Snowflake Architecture generally consists of three main components
    - Cloud Services
    - Data warehouses
    - Data Storage.


#### Data Loads

Data loads in Snowflake can be of 2 types

- Batch
    - This is most frequently used.
    - Done using copy command or Insert Statement.
    - Steps :

        1. Prepare your File
        2. Stage the Data 
        3. Execute Copy Command
        4. Manage Regular Loads

- Real Time
    - Real time Data loads can be done using snow-pipe
    - Kafka,Firehouse,Flink can also be used to pump data into snowflake using snowpipe.

- Data loads from Spark we can consider as batch load

```scala
TODO: Past Code Snippet Here


```

- Copy Options 
    - Validate Mode
    - Load Selected Files
    - ON_ERROR
    - Enforce_length
    - Force
    - Purge ( Clear Stage Files)
    - Load History View

#### Snowflake Performance :

    1. Columnar Data
    2. Micro Partition
    3. Clustering
    4. It doenst uses Indexes
    5. It doenst uses Partition

Optimizer Considerations

- Use Dedicated virutal warehouses for each task like take bigger warehouse for loads , other for analys and other for Data Scientist.
- Scale up if needed.
- Scale out.
- Design for Maximize cache usage.
- Use clustering Key.

#### Time Travel

    - 1 day for standard
    - 90 day for enterprise
    - Time Traveled Data can be cloned to another table
    - You can also undrop the table
    - You can also undrop the schema and database.
    - select * from table before (Time)

#### FailSafe

    - FailSafe is part of continous data protection provided by snowflake.
    - FailSafe provides 7 day Period during which historical data is recovered by snowflake.
    - It can only be recovered by snowflake with ticket.
    - Both time travel and fail safe will be charged by snowflake as storage cost

#### Snowflake Table Types

    - Permanent Table.
        a. Time Travel - 90 Days
        b. Fail Safe - 7 days
    - Temporary Table : Not visible to other session.
        a. Time Travel : 1 day or no
        b. No Time Travel
    - Transient Table : visible to other session.
        a. Time Travel : 1 day or no
        b. No Time Travel

#### Snowflake provides views for account. 

    - Snowflake.Account_usage.StorageUsage
    - Table_Storage_Metric

#### Zero copy Clone

    - Used to create copy of database,schema & table
    - A Snapshot of the original Data is made available to cloned object.
    - East to Clone prod data to dev.
    - Very useful in Debugging. 

#### Snowflake Data Sharing

2 Important Entities

    - Producer
    - Consumer

- If Consumer has a snowflake account, compute cost is payed by consumer.

- If consumer doenst have snowflake accout producer pays the compute cost

- Update made by producer is immediately available for consumer.

- You can share table, Schema , Even the database.


#### Snowflake Access Management : 

- Account Admin 
    - Most Powerful user
    - view Billing
- Security Admin
    - Create User, Role and manages them
    - grant Revoke any privleges
- Sysadmin
    - Manages warehouse
    - Manages Object.



#### Certification 

    175$ for Snowpro Certification