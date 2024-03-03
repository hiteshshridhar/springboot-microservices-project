# Springboot-microservices-project
This is a project to showcase the use of RestAPI with Microservices using following Design Implementation.

 `Microservices` -> Employee and Department,

 `DB` -> MySQL

 `Service Registry` -> using Netflix Eureka Server

 `API Gateway`  -> for client interaction

 `Circuit Breaker` -> For breaking the consecutive calling from one Microservice to another

We will also use the `SOLID` design principles and Mostly try to keep up with `DRY` and `KISS` design principles as well.

#### I will share 2 links for SOLID design principles in JAVA:

1. [x] [SOLID](https://www.baeldung.com/solid-principles) -> from Bealdung> I find it quite interesting and my goto reference.
2. [x] [SOLID](https://www.educative.io/answers/what-are-the-solid-principles-in-java) -> Easy understanding with detailed implementation. 


## Steps for creating the project.

Create two separate projects: 
-   DeptartmentServices  
-   EmployeeServices 
as SpringInitialzr with the following dependencies:

### Steps: ###


- _**Step 1:**_  

      - Spring web
      - Spring data JPA
      - MySQL driver
      - Lombok
      - Spring devtools


- _**Step 2: Add the appropriate packages for both _EmployeeServices and DepartmentServices_**_ 
   
      - Controller
      - Services
      - Repository
      - DTO
      - DAO
      - Entity


- _**Step 3: In your departmentServices -> application.properties file add the mapping for the DB.**_
  
      - spring.datasource.url = jdbc:mysql://localhost:3306/"your db name"
      - spring.datasource.username="your database username (generally root)"
      - spring.datasource.password="password for your db"
      - spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect 
      - spring.jpa.hibernate.ddl-auto=update
  
    
- **_Step 4: Add implementation in the entity package_** for _`DepartmentServices`_
   
      - Inside the entity package create a class named departmentEntity 
      - Annotate the departmentEntity with @Entity: -> This will map the entities in the database. 
      - create the following fields in your class:
        - Id: Long
        - deptName: String
        - deptDescription: String
        - deptCode: String
 
- Now we will Annotate the class with _**@Table**_ annotation. -> This will create the entities in DB. 
  - Add **@Table(name = "departments")** for the table name that you need to add in your DBSchema.


- Add the primary field for the database.
  - Add @Id
  - Add @GeneratedValue(strategy=GenerationType.IDENTITY)


- Now we will annotate each field with a **_@Column_** annotation so that we can map each field to the field in your table. 
  - Add @Column(name="dept_name") for the deptName field.
  - Add @Column(name="dept_description") for the deptDescription field.
  - Add @Column(name="dept_code") for the deptCode field.

