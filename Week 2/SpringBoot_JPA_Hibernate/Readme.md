# Spring Boot • Spring Data JPA • Hibernate ORM

A hands-on project demonstrating the fundamentals of **Spring Boot**, **Spring Data JPA**, and **Hibernate ORM** using **MySQL**. The project is developed module by module, where each module builds upon the previous one and introduces new concepts such as CRUD operations, Query Methods, and Object-Relational Mapping (ORM).

---

# 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven

---

# 📂 Project Structure

```
orm-learn
│
├── src/main/java
│   └── com.cognizant.ormlearn
│       │
│       ├── model
│       │   ├── Country.java
│       │   ├── Stock.java
│       │   ├── Employee.java
│       │   ├── Department.java
│       │   └── Skill.java
│       │
│       ├── repository
│       │   ├── CountryRepository.java
│       │   ├── StockRepository.java
│       │   ├── EmployeeRepository.java
│       │   ├── DepartmentRepository.java
│       │   └── SkillRepository.java
│       │
│       ├── service
│       │   ├── CountryService.java
│       │   ├── EmployeeService.java
│       │   ├── DepartmentService.java
│       │   └── SkillService.java
│       │
│       └── OrmLearnApplication.java
│
└── src/main/resources
    └── application.properties
```

---

# 📋 Database

Database Name

```
ormlearn
```

Tables Used

- country
- stock
- department
- employee
- skill
- employee_skill

---

# 📚 Learning Flow

```
Spring Boot Setup
        │
        ▼
Country CRUD Operations
        │
        ▼
Spring Data JPA Query Methods
        │
        ▼
Hibernate ORM Mapping
        │
        ▼
Many-To-One
        │
        ▼
One-To-Many
        │
        ▼
Many-To-Many
```

---

# 📦 Module 1 : Spring Boot + Spring Data JPA Basics

## Objective

Set up a Spring Boot project and perform basic CRUD operations using Spring Data JPA.

### Hands-ons Covered

- Spring Boot Project Setup
- MySQL Configuration
- Entity Mapping
- Repository Creation
- Service Layer
- Find Country by Code
- Add Country

### Files Used

```
Country.java

CountryRepository.java

CountryService.java

OrmLearnApplication.java
```

### Features Implemented

- Configure Spring Boot with MySQL
- Entity Mapping using JPA
- Repository using JpaRepository
- Retrieve all Countries
- Find Country by ID
- Add Country
- Transaction Management

### Concepts Covered

- Spring Boot
- Spring Data JPA
- Hibernate
- @Entity
- @Table
- @Id
- @Column
- JpaRepository
- @Transactional
- Optional
- CRUD Operations

---

# 📦 Module 2 : Spring Data JPA Query Methods

## Objective

Learn how Spring Data JPA automatically generates SQL queries from repository method names.

### Hands-ons Covered

### Country Query Methods

- Search by Containing Text
- Search by Starting Text
- Sort using OrderBy

### Stock Query Methods

- Search Between Dates
- Greater Than
- Top Records
- Sorting

### Files Used

```
CountryRepository.java

CountryService.java

Stock.java

StockRepository.java

OrmLearnApplication.java
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

### Concepts Covered

- Query Methods
- Automatic SQL Generation
- Filtering
- Sorting
- Between
- GreaterThan
- Top
- OrderBy

---

# 📦 Module 3 : Hibernate Object-Relational Mapping (ORM)

## Objective

Implement relationships between entities using Hibernate ORM.

### Hands-ons Covered

### Many-To-One

Employee ➜ Department

### One-To-Many

Department ➜ Employees

### Many-To-Many

Employee ⇄ Skill

### Files Used

```
Employee.java

Department.java

Skill.java

EmployeeRepository.java

DepartmentRepository.java

SkillRepository.java

EmployeeService.java

DepartmentService.java

SkillService.java

OrmLearnApplication.java
```

### Relationship Mapping

```java
@ManyToOne

@JoinColumn

@OneToMany

mappedBy

FetchType.LAZY

FetchType.EAGER

@ManyToMany

@JoinTable
```

### Features Implemented

- Get Employee with Department
- Add Employee
- Update Employee Department
- Get Department with Employees
- Get Employee with Skills
- Add Skill to Employee

### Concepts Covered

- Object Relational Mapping
- Entity Relationships
- Lazy Loading
- Eager Loading
- Join Tables
- Foreign Keys
- Cascade Understanding
- Hibernate Relationship Mapping

---

# 🗄 Database Relationship

```
                    Department
                    ----------
                    dp_id
                    dp_name
                        ▲
                        │
                  Many-To-One
                        │
                        │
Employee ----------------┘
--------
em_id
em_name
em_salary
em_date_of_birth

        │
        │
      Many-To-Many
        │
        ▼

Skill
-----
sk_id
sk_name


Bridge Table

employee_skill
-------------------
es_em_id
es_sk_id
```

---

# 📖 Key Concepts Learned

### Spring Boot

- Spring Initializr
- Auto Configuration
- Dependency Injection

### Spring Data JPA

- JpaRepository
- CRUD Operations
- Query Methods
- Transactions

### Hibernate ORM

- Entity Mapping
- Relationship Mapping
- Schema Validation
- SQL Generation

### JPA Relationships

- @ManyToOne
- @OneToMany
- @ManyToMany
- @JoinColumn
- @JoinTable
- mappedBy
- FetchType.LAZY
- FetchType.EAGER

---

# ✅ Project Completion Status

| Module | Status |
|----------|--------|
| Spring Boot Setup | ✅ Completed |
| Spring Data JPA CRUD | ✅ Completed |
| Country Query Methods | ✅ Completed |
| Stock Query Methods | ✅ Completed |
| Many-To-One Mapping | ✅ Completed |
| One-To-Many Mapping | ✅ Completed |
| Many-To-Many Mapping | ✅ Completed |

---

# 🎯 Learning Outcome

By completing this project, I gained hands-on experience with:

- Building Spring Boot applications
- Integrating MySQL with Spring Data JPA
- Implementing CRUD operations
- Creating custom Query Methods
- Working with Hibernate ORM
- Mapping entity relationships
- Understanding Lazy vs Eager Fetching
- Managing transactions using Spring

---

