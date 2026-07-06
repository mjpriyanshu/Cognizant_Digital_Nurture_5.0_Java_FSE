# Spring Data JPA & Hibernate - Hands-on

A complete hands-on project demonstrating the implementation of **Spring Data JPA**, **Hibernate ORM**, **Query Methods**, **HQL**, **Native Query**, and **Entity Relationships** using **Spring Boot** and **MySQL**.

The project is divided into multiple learning modules. Each module focuses on one concept and builds upon the previous one.

---

# 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven

---

# 📚 Learning Flow

```
Spring Boot
      │
      ▼
Spring Data JPA
      │
      ▼
Entity Mapping
      │
      ▼
Repository Layer
      │
      ▼
Service Layer
      │
      ▼
CRUD Operations
      │
      ▼
Query Methods
      │
      ▼
Entity Relationships
      │
      ▼
HQL / JPQL
      │
      ▼
Native Query
      │
      ▼
Criteria API
```

---

# 📂 Project Structure

```
src
│
├── main
│   │
│   ├── java
│   │
│   └── com.cognizant
│       │
│       ├── model
│       │     Country.java
│       │     Stock.java
│       │     Employee.java
│       │     Department.java
│       │     Skill.java
│       │
│       ├── repository
│       │     CountryRepository.java
│       │     StockRepository.java
│       │     EmployeeRepository.java
│       │     DepartmentRepository.java
│       │     SkillRepository.java
│       │
│       ├── service
│       │     CountryService.java
│       │     EmployeeService.java
│       │     DepartmentService.java
│       │     SkillService.java
│       │
│       └── Application.java
│
└── resources
      │
      ├── application.properties
      │
      └── notes
            Module1_HQL_JPQL.md
            Module6_Criteria_API.md
```

---

# 🗄 Database Tables

```
country

stock

department

employee

skill

employee_skill
```

---

# 📦 Module 1 - Spring Boot & Spring Data JPA Basics

## Objective

Setup Spring Boot and configure Spring Data JPA with MySQL.

### Features

- Spring Boot Project Setup
- MySQL Configuration
- Entity Mapping
- Repository Creation
- Service Layer
- Dependency Injection

### Files

```
Country.java

CountryRepository.java

CountryService.java
```

---

# 📦 Module 2 - CRUD Operations

## Objective

Perform basic CRUD operations using Spring Data JPA.

### Features

- Get All Countries
- Find Country by Code
- Add Country

### JPA Methods Used

```
findAll()

findById()

save()
```

---

# 📦 Module 3 - Query Methods

## Objective

Learn automatic query generation using Spring Data JPA.

### Country Query Methods

```
Containing

StartingWith

OrderBy
```

### Stock Query Methods

```
Between

GreaterThan

Top

OrderBy
```

### Repository Methods

```java
findByNameContaining()

findByNameContainingOrderByNameAsc()

findByNameStartingWith()

findByCodeAndDateBetween()

findByCodeAndCloseGreaterThan()

findTop3ByOrderByVolumeDesc()

findTop3ByCodeOrderByCloseAsc()
```

---

# 📦 Module 4 - Hibernate ORM Mapping

## Objective

Implement relationships using Hibernate.

### Relationships

```
Employee
        │
        ├────────────► Department

Employee
        │
        └────────────► Skill
```

### Relationship Types

```
@ManyToOne

@OneToMany

@ManyToMany

@JoinColumn

@JoinTable

mappedBy

FetchType.LAZY

FetchType.EAGER
```

### Tables Used

```
department

employee

skill

employee_skill
```

---

# 📦 Module 5 - HQL & JPQL

## Objective

Learn Hibernate Query Language.

---

## Module 1

### Introduction to HQL & JPQL

Topics

- HQL
- JPQL
- @Query
- JOIN FETCH
- Native Query
- Criteria API

---

## Module 2

### Get All Permanent Employees using HQL

Repository

```java
@Query("FROM Employee e WHERE e.permanent = true")
```

---

## Module 3

### Fetch Quiz Details using HQL

Skipped

Reason

Requires another project with

- Quiz
- User
- Question
- Attempt
- Option

---

## Module 4

### Aggregate Functions

Implemented

```
AVG()
```

Other Aggregate Functions

### COUNT()

Returns total number of records.

```java
@Query("SELECT COUNT(e) FROM Employee e")
Long getEmployeeCount();
```

---

### SUM()

Returns total of all values.

```java
@Query("SELECT SUM(e.salary) FROM Employee e")
Double getTotalSalary();
```

---

### MAX()

Returns largest value.

```java
@Query("SELECT MAX(e.salary) FROM Employee e")
Double getMaximumSalary();
```

---

### MIN()

Returns smallest value.

```java
@Query("SELECT MIN(e.salary) FROM Employee e")
Double getMinimumSalary();
```

---

### AVG()

Returns average value.

```java
@Query("SELECT AVG(e.salary) FROM Employee e")
Double getAverageSalary();
```

---

## Aggregate Function Flow

```
Repository

      │

      ▼

@Query()

      │

      ▼

Hibernate

      │

      ▼

SQL Query

      │

      ▼

Database

      │

      ▼

Single Value

      │

      ▼

Service

      │

      ▼

Application

      │

      ▼

Console
```

---

## Module 5

### Native Query

Repository

```java
@Query(value = "SELECT * FROM employee",
       nativeQuery = true)
```

Difference

HQL

```
Uses Entity Class

Employee
```

Native Query

```
Uses Database Table

employee
```

---

## Module 6

### Criteria API

Theory Only

Topics

- Dynamic Query
- CriteriaBuilder
- CriteriaQuery
- Root
- Predicate

Used when queries are created dynamically at runtime.

---

# 🔄 Overall Flow

```
Spring Boot

        │

        ▼

Entity

        │

        ▼

Repository

        │

        ▼

Service

        │

        ▼

Application

        │

        ▼

Database
```

---

# 📖 Concepts Covered

## Spring Boot

- Auto Configuration
- Dependency Injection

---

## Spring Data JPA

- JpaRepository
- CRUD
- Query Methods
- @Transactional

---

## Hibernate ORM

- Entity Mapping
- Relationship Mapping
- Lazy Loading
- Eager Loading

---

## Query Language

- HQL
- JPQL
- Native Query
- Criteria API

---

## Relationships

- Many-To-One
- One-To-Many
- Many-To-Many
- Join Table
- Foreign Key Mapping

---

# ✅ Project Completion

| Module | Status |
|---------|--------|
| Spring Boot Setup | ✅ |
| CRUD Operations | ✅ |
| Query Methods | ✅ |
| Hibernate ORM Mapping | ✅ |
| HQL | ✅ |
| Aggregate Functions | ✅ |
| Native Query | ✅ |
| Criteria API | ✅ (Theory) |

---

# 🎯 Learning Outcome

After completing this project, I gained practical experience in:

- Building Spring Boot applications
- Integrating MySQL using Spring Data JPA
- Performing CRUD operations
- Writing Query Methods
- Using Hibernate ORM
- Mapping entity relationships
- Writing HQL & JPQL queries
- Executing Native SQL Queries
- Understanding Criteria API
- Working with Aggregate Functions in HQL