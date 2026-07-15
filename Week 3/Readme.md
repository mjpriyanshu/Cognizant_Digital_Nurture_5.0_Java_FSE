# Spring REST using Spring Boot 3

---

# Table of Contents

- Project Overview
- Technologies Used
- Modules Covered
- Project Structure
- Folder Structure
- Layered Architecture
- Request Flow
- APIs Developed
- File Descriptions
- XML Configuration Files
- Spring Annotations
- Important Classes
- Maven (pom.xml)
- REST Concepts
- Important Interview Questions


---

# Project Overview

This project demonstrates the basics of **Spring Boot REST API Development** using **Spring Boot 3**.

Instead of connecting to a database, all data is stored inside **Spring XML Configuration files**, and the REST APIs fetch data from these XML files using the Spring IoC Container.

The project follows the standard layered architecture:

```
Client
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
DAO
   │
   ▼
XML Configuration
```

---

# Technologies Used

- Java
- Spring Boot 3
- Spring Web
- Spring Core
- Maven
- XML Configuration
- Jackson (JSON Conversion)
- Postman
- Eclipse

---

# Modules Covered

## Module 1

### Hands-on 1

- Create Spring Boot Project
- Maven Project
- Spring Web
- DevTools

### Hands-on 2

- Spring Core
- Load bean from XML
- SimpleDateFormat Bean
- ApplicationContext

---

## Module 2

### Hands-on 1

Hello World REST API

```
GET /hello
```

---

### Hands-on 2

Country REST API

```
GET /country
```

---

### Hands-on 3

Country by Code

```
GET /countries/{code}
```

---

## Module 3

### Hands-on 1

Static Employee Data

- Employee
- Department
- Skill
- employee.xml

---

### Hands-on 2

Employee REST API

```
GET /employees
```

---

### Hands-on 3

Department REST API

```
GET /departments
```

---

# Project Structure

```
spring-learn
│
├── src
│
├── main
│   │
│   ├── java
│   │
│   │   └── com.cognizant.springlearn
│   │
│   │       ├── SpringLearnApplication.java
│   │       │
│   │       ├── controller
│   │       │      ├── HelloController.java
│   │       │      ├── CountryController.java
│   │       │      ├── EmployeeController.java
│   │       │      └── DepartmentController.java
│   │       │
│   │       ├── service
│   │       │      ├── CountryService.java
│   │       │      ├── EmployeeService.java
│   │       │      └── DepartmentService.java
│   │       │
│   │       ├── dao
│   │       │      ├── EmployeeDao.java
│   │       │      └── DepartmentDao.java
│   │       │
│   │       └── model
│   │              ├── Country.java
│   │              ├── Employee.java
│   │              ├── Department.java
│   │              └── Skill.java
│   │
│   └── resources
│          ├── application.properties
│          ├── country.xml
│          ├── employee.xml
│          └── date-format.xml
│
└── pom.xml
```

---

# Folder Description

## src/main/java

Contains all Java source code.

---

## src/main/resources

Contains configuration files.

Examples

- application.properties
- XML files
- images
- static resources

---

## src/test/java

Contains test classes.

Usually JUnit tests.

---

# Layered Architecture

The project follows a layered architecture.

```
Presentation Layer
        │
        ▼
Controller
        │
        ▼
Service
        │
        ▼
DAO
        │
        ▼
Data Source (XML)
```

Each layer has a specific responsibility.


---

# APIs Developed

## Hello World

```
GET /hello
```

Returns

```
Hello World!!
```

Purpose

Checks whether REST API is working.

---

## Country

```
GET /country
```

Returns

```json
{
  "code":"IN",
  "name":"India"
}
```

Loads country bean from XML.

---

## Country By Code

```
GET /countries/{code}
```

Example

```
GET /countries/in
```

Returns

```json
{
  "code":"IN",
  "name":"India"
}
```

Uses

```
@PathVariable
equalsIgnoreCase()
```

---

## Employees

```
GET /employees
```

Returns

```
List<Employee>
```

---

## Departments

```
GET /departments
```

Returns

```
List<Department>
```

---

# File Description

## SpringLearnApplication.java

Entry point of the application.

Contains

```
main()
```

Starts Spring Boot.

---

## HelloController.java

Handles

```
GET /hello
```

Returns

```
Hello World!!
```

---

## CountryController.java

Handles

```
/country

/countries/{code}
```

Returns country information.

---

## EmployeeController.java

Handles

```
/employees
```

Returns employee list.

---

## DepartmentController.java

Handles

```
/departments
```

Returns department list.

---

## CountryService.java

Contains business logic related to Country.

---

## EmployeeService.java

Contains business logic related to Employee.

Calls DAO methods.

---

## DepartmentService.java

Contains business logic related to Department.

---

## EmployeeDao.java

Reads Employee data from XML.

Returns Employee List.

---

## DepartmentDao.java

Reads Department data from XML.

Returns Department List.

---

## Country.java

Model class representing a country.

Contains

```
code
name
```

---

## Employee.java

Represents an employee.

Contains

```
id
name
salary
permanent
department
skills
dateOfBirth
```

---

## Department.java

Represents department.

Contains

```
id
name
```

---

## Skill.java

Represents employee skill.

Contains

```
id
name
```

---

# XML Configuration Files

## date-format.xml

Contains

```
SimpleDateFormat Bean
```

Used to avoid creating multiple objects.

---

## country.xml

Contains

```
Country Bean
Country List
```

---

## employee.xml

Contains

- Departments
- Skills
- Employees
- Employee List
- Department List

Acts as a temporary database.

---

# Important Spring Annotations

## @SpringBootApplication

Combination of

```
@Configuration

@EnableAutoConfiguration

@ComponentScan
```

Marks the main Spring Boot class.

---

## @RestController

Marks a class as a REST Controller.

Returns JSON or text directly.

---

## @Controller

Returns Views (JSP/HTML).

Unlike RestController.

---

## @Service

Marks Service Layer.

Contains Business Logic.

---

## @Repository

Marks DAO Layer.

Responsible for Data Access.

---

## @Autowired

Automatically injects an object managed by Spring.

Example

```
EmployeeService

EmployeeDao
```

---

## @GetMapping

Maps HTTP GET request.

Example

```
@GetMapping("/employees")
```

---

## @RequestMapping

Maps URL to method/class.

Supports all HTTP methods.

---

## @PathVariable

Reads value from URL.

Example

```
/countries/in
```

```
String code
```

receives

```
in
```

---

## @Transactional

Marks a method as transactional.

Mainly used while working with databases.

---

# Important Classes

## ApplicationContext

Spring IoC Container.

Loads beans from XML.

Example

```java
ApplicationContext context =
new ClassPathXmlApplicationContext("employee.xml");
```

---

## ClassPathXmlApplicationContext

Loads XML configuration from

```
src/main/resources
```

---

## Bean

An object managed by Spring.

Example

```xml
<bean id="country"
class="Country">
```

---

## IoC (Inversion of Control)

Instead of creating objects ourselves using

```java
new Employee()
```

Spring creates and manages them.

---

## Dependency Injection

Spring automatically provides required objects.

Example

```java
@Autowired
EmployeeService employeeService;
```

---

## DAO (Data Access Object)

Responsible for reading/writing data.

Normally interacts with database.

In this project

```
DAO → XML File
```

Later

```
DAO → MySQL
```

---

## Service Layer

Contains business logic.

Acts between Controller and DAO.

---

## Controller

Receives HTTP Request.

Calls Service.

Returns Response.

---

## Model

Represents actual data.

Example

```
Employee

Country

Department
```

---

# Maven

Project Build Tool.

Uses

```
pom.xml
```

Responsibilities

- Dependency Management
- Build
- Packaging
- Plugins
- Version Management

Common Commands

```bash
mvn clean

mvn compile

mvn package

mvn install
```

---

# pom.xml

Contains

- Project Information
- Dependencies
- Plugins
- Java Version

Example Dependencies

- Spring Web
- DevTools
- Spring TX

---

# How JSON is Generated?

Controller returns Java Object

↓

Spring Boot

↓

Jackson Library

↓

JSON Response

No manual conversion required.

---

# HTTP Methods

GET

Retrieve Data

POST

Insert Data

PUT

Update Entire Record

PATCH

Partial Update

DELETE

Delete Record

---

# Browser vs Postman

Browser

- Easy Testing
- Mainly GET Requests

Postman

- GET
- POST
- PUT
- DELETE
- Headers
- Body
- Authentication

---

# Frequently Asked Interview Questions

### Why use Spring Boot?

Reduces configuration and makes Spring development faster.

---

### Why REST?

Allows communication between client and server using HTTP.

---

### Difference between @Controller and @RestController?

@Controller returns View.

@RestController returns JSON/Text.

---

### Why Service Layer?

Separates business logic from controller.

---

### Why DAO Layer?

Separates data access logic.

---

### Why use XML?

To configure Spring Beans.

---

### What is Bean?

Object managed by Spring Container.

---

### What is Dependency Injection?

Spring automatically provides required objects.

---

### Why @Autowired?

To inject dependencies automatically.

---

### What converts Java Object into JSON?

Jackson Library.

---

### What is ApplicationContext?

Spring Container that manages beans.

---

### Why Layered Architecture?

- Better readability
- Easier maintenance
- Reusable code
- Loose coupling

