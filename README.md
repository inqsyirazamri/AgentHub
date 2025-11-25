<h1 align="center">AgentHub – Java Application with MySQL & AWS Deployment</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white" />
</p>

<p align="center">
    <a href="https://youtu.be/jPQFAgUjRGI?si=Pvywq7YoaDKA2IN0&t=136" target="_blank">
        <img src="https://img.shields.io/badge/%F0%9F%9A%80%20Live%20App%20Test%20%E2%80%93%20Local%20Deployment-red?style=for-the-badge&logo=youtube" 
             alt="🚀 Live App Test – Phase 1: Local Deployment">
    </a>
    <a href="https://youtu.be/G4hJKZ2Aem8?t=654" target="_blank">
        <img src="https://img.shields.io/badge/%F0%9F%9A%80%20Live%20App%20Test%20%E2%80%93%20Cloud%20Deployment-red?style=for-the-badge&logo=youtube" 
             alt="🚀 Live App Test – Phase 2: Cloud Deployment">
    </a>
</p>

## **📌 Project Overview**

**Title:** AgentHub – Order Management System  
**Course:** CCS6344 – Database and Cloud Security  
**Group:** 3 Members  
**Completion Date:** 4 July 2024

**Objective:**  
AgentHub is a full-stack Java application integrated with MySQL and successfully deployed on AWS Cloud Academy.
The system facilitates seamless order management between agents and manufacturers, integrating **database security** and **cloud architecture enhancements**. This project focuses on **secure cloud migration**, improving scalability, security posture, and operational resilience.

### **💡 Why This Project Matters**

AgentHub demonstrates my capability to:

*   **Build enterprise-level Java applications from scratch**
*   **Design and manage relational databases**
*   **Deploy applications on cloud infrastructure**

This project highlights:

*   **Full-cycle development skills** – From coding to deployment
*   **Cloud readiness** – Ability to work with AWS infrastructure
*   **Database expertise** – Designing and managing RDBMS
*   **Problem-solving mindset** – Building scalable and secure applications

## **✨ Key Features**

*   **Order Management Automation** – Streamlines agent-manufacturer transactions through purchase tracking and inventory updates.
*   **Secure User Authentication** – Implements RBAC and MFA to restrict access based on user roles.
*   **Financial Management Support** – Enables order invoicing and revenue analysis with cloud-based storage.
*   **Database Backup & Recovery Plan** – Minimizes data loss risks.

## **🛠 Tech Stack**

*   **Language:** Java (JDK 8+)
*   **Database:** MySQL
*   **Cloud:** AWS Cloud Academy
*   **Libraries:** JDBC, DAO Pattern
*   **UI:** Java Swing

## **☁ Cloud Architecture**

The AgentHub system follows a **hybrid architecture**, combining traditional database security with **AWS cloud infrastructure** for scalability:

*   **Virtual Private Cloud (VPC)** – Ensures network isolation and controlled access to cloud services.
*   **AWS RDS** – Provides encrypted, highly available relational data storage.
*   **Multi-AZ Deployment** – Strengthens fault tolerance and disaster recovery capabilities.

## **🔐 Security Measures**

*   **Database Security:** ACLs, MD5 password hashing, regular backups.

<p align="center">
  <img width="363" height="199" alt="image" src="https://github.com/user-attachments/assets/94db641c-089d-4134-a7b0-92491e2144c8" />
  <img width="414" height="187" alt="image" src="https://github.com/user-attachments/assets/11122839-6320-492e-b18d-398ac84fd318" />
  <img width="609" height="397" alt="image" src="https://github.com/user-attachments/assets/55c02284-9f9e-4634-8ec8-2bfab9701458" />
</p>

*   **Cloud Security:** IAM RBAC, TLS & AES-256 encryption, AWS Shield for DDoS mitigation.
*   **Threat Modeling:** STRIDE and DREAD frameworks applied.

<p align="center">
  <img width="555" height="446" alt="image" src="https://github.com/user-attachments/assets/9d9bcd98-ca63-4e88-94b9-48da57ed56a9" />
</p>

## **🚀 Installation & Setup**

1.  Clone the repository:
    ```bash
    git clone https://github.com/inqsyirazamri/AgentHub.git
    cd agenthubmysql-aws-main/agenthubmysql-aws-main
    ```
2.  Import `agenthub.sql` into MySQL. 
3.  Update `DbConnection.java` with your credentials.
    ```bash
    URL      = "jdbc:mysql://<your-host>:<port>/<database-name>";
    USER     = "<your-username>";
    PASSWORD = "<your-password>";
    ```
   * If you're using **AWS RDS**, use the RDS endpoint for `<your-host>`.
   * Make sure the port (usually `3306`) is correct.
   * If you are following step 2, `database-name` is `agenthub`
     
5.  Compile & run
    ```bash
    javac -d out src/main/AgentHub.java
    java -cp out AgentHub
    ```
    
## **🔮 Future Improvements**

*   **Web-based Interface** using Spring Boot or React for better scalability.
*   **CI/CD Pipeline** for automated deployment.
*   **Enhanced Security** with OAuth 2.0 and advanced encryption.
*   **Dockerization** for containerized deployment.
*   **Monitoring & Logging** using AWS CloudWatch.
