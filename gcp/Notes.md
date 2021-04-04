# GCP - Google Cloud Platform 

## <b><u> OVERVIEW </b></u>

- GCP is Google cloud platform provided by Google.
- It has over 200 Services.
- GCP Associate Cloud Engineer Certification expects to know 45 Services.
- GCP is "cleanest cloud"  : Net Carbon neutral cloud electricity used match 100% with renewable Energy
- Best Path
    - Compute
    - App Engine
    - Cloud Functions
    - Cloud Run
    - Kebernetes Engine
    - Cloud SQL
    - DataStore

-------------------------------------------------------

## <b><u> Regions and Zones </b></u>

<span style="color:blue"> Regions : </span>

- Google Provide 20+ Regions around the world, expanding every year
- Rigion : Specific Geographical Location to host resources
- Advantages : 
    - High Availability
    - Low Latency
    - Global Footprint
    - Adhere to government regulations.

<span style="color:blue"> Zones : </span>

- Within Each Region there are multiple zone, atleast 3 zone
- Increased availability and Fault Tolerance within same region
- Each zone has one or more discrete cluster
- Zones in each region is connected via low latency network.

| Region      | Logical Name | Zone |
| ----------- | ----------- |-------|
| us-west1    |Dallas , Oregon, North America| us-west1-a <br /> us-west1-b <br /> us-west1-c

-------------------------------------------------------

## <b><u> Compute Engine </b></u>

- <span style="color:green"> AWS Equivalent : EC2 </span>
- Virtual Machines are virtual servers in GCP
- Google Compute Engine : Provision and Manages virutal Machines.
- Features : 
    - create and manage lifecycle of VM
    - Load Balancing and auto-scalaing for multiple vm instances
    - Attached Storage to VM
    - Manage network connectivity and configuration in you vm instance.

- Machine Configuration :
    - General Purpose - ( E2,N2,N2D,N1)
    - Compute Optimized - (c2)
    - Memory Optimized - (M2,M1)
    - GPU

- Internal and External IP Address 
    - External (public) IP address are Internet addressable
    - Internal (private) IP address are internal to corporate network
    - You cannot have two resources with same public IP address
    - However two different corporate networks can have resources with same Internal IP address
    - All VM instances are atleast assigned one Internal IP Address.

- Staic IP Address
    - You can create static IP Address and attach to virtual instance
    - you can switch to one vm instnace to the new vm instane
    - Static IP remains attached to vm evne if you stop using it
    - You are billed for static address even if you are not using it. 

- Virtual Machine Other Features.
    - You can have start script for a VM just like EC2
    - You can create Image with all the installation and use that org wide
    - You can create VM with templates.
    - You can attach persistant disk to vm. 
    - You can create custom machine types with required cpu/disk
    - You can create sole tenant nodes if you dont want to share infra with other org. 
    - You can reduce the boot time by using hardned images.
    - If you have 100's of VM you can use VM Manager for OS patching etc.  

- Optimized cost. 
    - Sustained used account ( more that 25% of the month)
    - Commited discount use ( you ask vm for 3 year contract, you will get 60% discount)
    - Preemtible VM ( these are like spot instances ), can be used for only 24 hours and gcp can pull out anytime with 30 seconds notice. use this for non-critical workloads.

-------------------------------------------------------

## <b><u> Glocd CLI : gcloud </b></u>

- <span style="color:green"> AWS Equivalent : aws-cli </span>
- Command Line Interface with Google cloud Resource. 
- Most GCP Services can be managed from cli using glcoud.
    - Compute Engine Virtual Machine
    - Managed Instance groups
    - Database and many more.
- Other CLI
    - Cloud Storage : gsutil
    - Cloud Big Query - bq
    - Cloud Big Table - cbt
    - Kebernetes - kubectl

-------------------------------------------------------

## <b><u> Instance Group</b></u>

- <span style="color:green"> AWS Equivalent : Autoscaling </span>

- Group of VM isntances managed as single group
- Manage group of similar VMs having similar life cycle
- Two types of Instance groups
    - Managed : Identical VMs created using template, You will get Auto Scaling and Auto Healing capability
    - UnManaged : Different types of VM's with Side. Does not offer Auto Scaling and Auto Healing

- MID ( Managed Instance Group)
    - Maintain Certain number of instance
    - Self Healing, it can launch new instance in case of failure
    - Auto Scaling
    - Load Balancer
    - Releas update without downtime
    - Canary Deployment ( test new version with group of instnace before releasing across all formats)
    - Instance Template is mandatory
    - Configure Auto Scaling
        - Max Instances
        - Min Instances
        - cool down period
        - scale in control.
    - Cool Down Period : Specify how long it takes for your apps to initialize from boot time is ready to serve.

- Cloud Load Balancer : 
    - Distributes user traffic across instance of an application in single region or multiple region
    - Features 
        - Health Check
        - Auto Scaling
        - Global load balancing with single anycast IP
    - It gives 
        - High availability 
        - Auto Scaling
        - Resiliency
        - we can create loosly coupled Architecture.
    - Types of Load Balancers
        - HTTP(s) load Balancer
        - TCP Load Balanncer
        - UDP Load Balancer ( user defined)

-------------------------------------------------------

## <b><u> APP Engine </b></u>
- <span style="color:green"> AWS Equivalent : AWS Elastice Beanstalk </span>

- Simplest way to deploy and scale your application in GCP.
- Supports 
    - java ,python, go etc.
    - Use custome runtime and write code in any language
    - connect to variety of goodle cloud storage products
    - No usage charges - Pay for resource provisioned. 

- Features : 
    - Automatic Load Balancing
    - Platform updates
    - Application Versioning.

- App Engine Environment : 
    - Standard : 
        Application run in language specific sandboax
    - Flexible : 
        Application instance run within docker container. Supports any runtime.

- App Engine - Scaling Instance : 
    - Automatic : Automatic scale instances based on the load
    - Basic : Instance are created as and when request are received
        - Instances are shutdown if zero request
        - NOT SUPPORTED by App Engine Flexible Environment
    - Manual : Configure Specific number of instance to run.

- App Engine is Regional Service (Services deployed across zones)
- You cannot change an application region
- Good option for simple microservices
    - use standard v2 when you are using supported language
    - use flexible if you are building container appse.
- Be aware - ATLEAST one container is always flexible
- Go for standard if you want to be able to scale down the number of instance to zero.
- Use a combinatoin of resident and dynamic instance.
    - Resident Instances.
    - Dynamic Instances.

-------------------------------------------------------

## <b><u> Cloud Functions </b></u>

- <span style="color:green"> AWS Equivalent : Lambda </span>

- Execute some code when an event happens
- Run code in response to events
    - Write business logic in python, Node.js, Java, .NET, Ruby
    - Dont worry about servers or scaling or availability
- Pay only for what you use.
    - Number of invocations
    - Compute time.
    - Amount of memory and cpu provision
- Time bound : Default 1 min and max 9 minutes.

-------------------------------------------------------

## <b><u> Cloud KMS </b></u>

- <span style="color:green"> AWS Equivalent : AWS KMS </span>
- Createe and Manage cryptographic keys in GCP ( Symmetric and Asymmetric)
- Control their use in your application and GCP Services
- Provides an API to encrypt,decrypt or sign data
- Use Existing cryptographic keys created on premises.
- Integrate with almost all services that need to encrypt data
- Types 
    - Google Managed Key - No Config req.
    - Customer Managed Key - Use Keys from KMS
    - Customer Supplied Key - Provide own key

-------------------------------------------------------

## <b><u> Google Kubernetes Engine </b></u>

- <span style="color:green"> AWS Equivalent : EKS </span>

- Most Popular open source container Orchestration.
- Provides cluster Management
    - Each cluster can have different types of virtual machines
- Provides all important container Orchestration features
    - Auto Scaling
    - Service Discovery
    - Load Balancer
    - Self Healing
    - Zero down time deployment
- GKE is managed kubernetes Service
- Provides POD and Cluster Auto Scaling
- Enable Cloud Logging and Cloud monitoring. 
- Uses Container Optimized OS
- Provides Support to persistant Disk and load disk
- Cluster : Group of compute enginer instances
    - Master Node :   
        - api-server handles all the communication for a k8s cluster
        - scheduler decides placment of pods
        - control manage - Manage deployments and replica sets
        - etcd - Distributed databases storing the cluster node.
    - Worker Node.
        - Runs your pods
        - kubelet-manages communication with master node.

- Cluster Types : 
    - Zonal Cluster :
        - Single Zone
        - Multi zonal
    - Regional Cluster : Replicas of the control plane runs in multiple zones of a given region. Nodes also run in same zone where control plane runs.
    - Private Cluster : VPC-native cluster, Nodes onlyhave internal IP Address.
    - Alpha cluster : Clusters with alpha API's early featue API's used to test new k8s features.

- POTS 
    - Smallest deployable unit in kubernetes
    - A pod contains one or more containers
    - Each pod is assigned an ephemeral IP address
    - All container in a pod share
        - Network
        - storage
        - IP-address
        - port and 
        - vollumes.

- Container Registry : 
    - You created docker images for your microservices ? Container Registry is where you store them.
    - container Registry fully managed container registry provided by GCP ( Alternative to Docker Hub)

- Cloud Run : 
    - Container to production in seconds. 
        - Built on top of an open standart 
        - Fully Managed serverless platform for containerized application
            - zero infrastructure management
            - pay for use.
        - Fully Integrate end to end developer experience
            - No Limitation in languages,binaries and dependencies
            - It integrates very well with cloud-code, cloud-build, cloud-monitoring and cloud logging integrations.

- Anthos : Run Kubernetes cluster anywhere ( cloud, multi-cloud and on-premise)

-------------------------------------------------------

## <b><u> Google Cloud Storage </b></u>

- <span style="color:green"> AWS Equivalent : EBS </span> 

- Google Cloud Storage has 2 broad category
    - Block Storage : 
        - Persistant Disk : Network Block store, It can be Zonal and Regional.
        - Local SSDS : Local Block Storage, Attached to VMs
    - File Storage : 
        - File Store : High Performance File Storage

- Persistant Disk : 
    - As anetwork drive
    - Separate from VM instances
    - Lower latency, I/O is slow
    - Snapshot Supported
    - Usecase : Perminant Storage
    - Types :
        - Balanced
        - Standard
        - SSD

- Local Disk (SSDs) : 
    - Physical Attached to VMs
    - Life cycle : Tied with VM
    - Improved I/O 10-100x Persistant Disk
    - Snapshot not supported
    - Use Case : Ephemeral Storage

- Cloud FileStorage : 
    - Shared Cloud File Storage 
        - Supports NFSV3 Protocol
        - Provisioned capacity
    
    - Suitable for high performance workloads, supports upto 320 TB with throughput of 16GB/s and 480 IOPS
    - Supports both HDD and SSD. 

-------------------------------------------------------

## <b><u> Google Object Store </b></u>

- <span style="color:green"> AWS Equivalent : S3 </span> 

- Name should be globally unique
- Region 
    - Single Region
    - Dual Region
    - Multi Region
- Storage Classes
    - Standard
    - Nearline
    - Coldline
    - Archieve
- Control access can be 
    - Fine Grained
    - Uniform

- Most Popular very flexible and in-expensive storage device
- It is serverless : Autoscaling and infinite scale.
- Storage large object using key-value approach. It treats entire object as unit.
- It provides cli and REST-API and client libraries. cli is gsutil
- can store any type of file
- We can have versioning in google cloud storage
- Max size of an object is 5TB. 
- Object key is unique.
- There is nome limit on number of buckts but its not hard limit. 
- We can create object life cycle management
    - setStorageClass ( 1 --> 2 --> 3 --> 4)
    - Deletion action ( delete 40 days)

- Encryption : 
    - Cloud Storage always encrypts data on the server side
    - Configure Service storage
        - Google Managed Encryption
        - Customer Managed Encryption
        - Optionally we can do client side encryption before putting into cloud. 

- CLI
    - gsutil mb bucket
    - gsutil ls bucket://
    - gsutil cp . . 
    - gsutil mv . 
    - gsutil rewrite -s STORAGE_CLASS ( Change Storage class for object)

-------------------------------------------------------

## <b><u> Cloud Identity and Access Managment</b></u>

- <span style="color:green"> AWS Equivalent : IAM </span> 

- Authentication : is it the right user
- Authorization : do they have right access
- Identities can be 
    - GCP User ( Google account or externally authenticated users )
    - Group of GCP Users
    - An Application running in GCP
    - An Application running in your data center
    - Unauthorized users.
- Provides very granular control 
    - Limited to single user
        - to perform single action.
        - on a specific cloud resource.
        - from a specifig ID address.

- Roles : A set of permission ( to perform specific action on specific resources ) , roles do not know about members its all about permission

- Policy : you assign permission to a member, you assign a role to a member

- You create a role first and then bind a member to that role with policy

- A role can be assigned to more than on member.

-------------------------------------------------------

## <b><u> Database Fundamentals </b></u>

Choosing Right database depends upon 

- Availability :
    - Will i be able to access data now and when i need it.
    - percentage of time an application provides the operations expected of it.
    - Availabitlity of 99.9999 is considered good.

- Durability :
    - Will my data be available after 10 or 100 or 1000 years
    - Durability of 99. 11(9s) is considered good. 

- Consistancy :
    - How do you ensure that data in multiple database instance is updated simoultaneosly. This is called consistancy.
    - Types : 
        a. Storng Consistency : Synchronous replication.
        b. Eventual Consistency : Asynchronous replication.
        c. Read-after-write Consistancy : 
            - Inserts are immediate
            - Updates are not available immediately.

- RTO : Recovery Time Objective , Maximum acceptable downtime
- RPO : Recovery point Objective, Maximum acceptable period of data loss

-------------------------------------------------------

## <b><u> Database Offerings from GCP </b></u>

- <span style="color:green"> AWS Equivalent : RDS, Redshift & Dynamo DB </span> 

- Categories of the database : 
    - Relational Database :
        - OLTP : 
            Cloud SQL is managed services provided by google which supports PostgresSQL,MySQL and SQL Server for RDBMS Database ( Few TBs)

            Cloud Spammer : Unlimited Scale ( Multiple PBs) and 99.9999% availability for global application with horizontal scaling. 
        - OLAP : 
            Big Query is recommended managed service.

    - NoSQL Database : 
        - Not only SQL
        - Flexible Schema
        - Horizontal Scale
        - Strong Consistancy and SQL Features to achieve "Scalable and High performers"
        - Google Managed Service :
            a. Cloud Firstore 
                - ACID Support
                - Strong Consistancy
                - Mobile and we client libraries
                - Recommended for small to medium database.
            b. Cloud BigTable
                - Not a serverless
                - Recommended for data size > 10 Terabyte data
                - No Transaction load.
    - In Memory Database.
        - Recommended GCP Managed Service for in-memory database is memstore
        - Its has 2 different types.
            a. Redis 
            b. Mem-cached.

-------------------------------------------------------

## <b><u> </b></u>

- <span style="color:green"> AWS Equivalent : EC2 </span> 

-------------------------------------------------------