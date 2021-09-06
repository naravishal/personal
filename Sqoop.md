
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
