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

## <b><u> </b></u>
- <span style="color:green"> AWS Equivalent : EC2 </span>

-------------------------------------------------------

## <b><u> </b></u>

- <span style="color:green"> AWS Equivalent : EC2 </span>

-------------------------------------------------------

## <b><u> </b></u>

- <span style="color:green"> AWS Equivalent : EC2 </span>

-------------------------------------------------------

## <b><u> </b></u>

- <span style="color:green"> AWS Equivalent : EC2 </span>

-------------------------------------------------------

## <b><u> </b></u>

-------------------------------------------------------
