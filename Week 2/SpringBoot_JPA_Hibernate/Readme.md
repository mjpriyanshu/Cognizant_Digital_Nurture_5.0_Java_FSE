# Spring Data JPA & Hibernate - ORM Learn

A simple Spring Boot project demonstrating the fundamentals of **Spring Boot**, **Spring Data JPA**, and **Hibernate ORM** by connecting a Java application with a MySQL database.

This project is developed as a series of hands-on exercises where each exercise builds upon the previous one, gradually implementing CRUD operations, Query Methods, and Object Relational Mapping (ORM).

---

# 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

# 📂 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.cognizant.ormlearn
│   │       ├── model
│   │       │   ├── Country.java
│   │       │   └── Stock.java
│   │       │
│   │       ├── repository
│   │       │   ├── CountryRepository.java
│   │       │   └── StockRepository.java
│   │       │
│   │       ├── service
│   │       │   └── CountryService.java
│   │       │
│   │       └── OrmLearnApplication.java
│   │
│   └── resources
│       └── application.properties
```

---

# 📋 Database

Database Name

```
ormlearn
```

Current Tables

- country
- stock

---

# 📌 Hands-on 1 : Spring Data JPA Quick Example

## Objective

- Create a Spring Boot project using Spring Initializr.
- Configure MySQL database connectivity.
- Map a database table to a Java Entity using JPA.
- Create a Repository using Spring Data JPA.
- Implement a Service layer.
- Retrieve all records from the database.

### Features Implemented

- Spring Boot project setup
- MySQL configuration
- JPA Entity Mapping
- Repository using `JpaRepository`
- Service Layer
- Fetch all countries using `findAll()`
- Display records in console

### Sample Output

```
Application Started

Fetching Countries...

IN - India
US - United States

Completed Successfully.
```

---

# 📌 Hands-on 2

### Hibernate XML Configuration (Theory)

Topics Covered

- SessionFactory
- Session
- Transaction
- beginTransaction()
- commit()
- rollback()
- session.save()
- session.get()
- session.delete()
- session.createQuery()

---

# 📌 Hands-on 3

### Hibernate Annotation Configuration (Theory)

Topics Covered

- @Entity
- @Table
- @Id
- @GeneratedValue
- @Column
- Hibernate Configuration
- Annotation-Based Mapping

---

# 📌 Hands-on 4

### JPA vs Hibernate vs Spring Data JPA (Theory)

| JPA | Hibernate | Spring Data JPA |
|-----|-----------|-----------------|
| Specification | ORM Framework | Abstraction over Hibernate |
| Defines Rules | Implements JPA | Reduces Boilerplate Code |

---

# 📌 Hands-on 5 : Country Data Configuration

## Objective

Prepare the database for implementing CRUD operations.

### Tasks Completed

- Configured Hibernate Validation (`ddl-auto=validate`)
- Created and populated the Country table
- Verified retrieval using Spring Data JPA

---

# 📌 Hands-on 6 : Find Country by Code

## Objective

Retrieve a country using its country code.

### Features Implemented

- Custom Exception (`CountryNotFoundException`)
- `findCountryByCode()`
- `JpaRepository.findById()`
- Optional Handling
- Transaction Management

### Concepts Covered

- `findById()`
- `Optional`
- Exception Handling
- `@Transactional`

---

# 📌 Hands-on 7 : Add Country

## Objective

Insert a new country into the database.

### Features Implemented

- `addCountry()`
- `JpaRepository.save()`
- Verify insertion using `findById()`

### Concepts Covered

- Entity Persistence
- CRUD Operations
- Service Layer
- Transaction Management

### Sample Output

```
Adding New Country...

Country Added Successfully

NP - Nepal
```

---

# 📌 Module 2 : Spring Data JPA Query Methods

## Objective

Demonstrate the implementation of **Spring Data JPA Query Methods** without writing SQL queries.

---

## Hands-on 1 : Country Query Methods

### Features Implemented

- Search countries containing specific text.
- Search countries containing text and sort them alphabetically.
- Search countries whose names start with a specific letter.

### Repository Methods

```java
findByNameContaining()

findByNameContainingOrderByNameAsc()

findByNameStartingWith()
```

### Query Methods Covered

- `Containing`
- `StartingWith`
- `OrderBy`

---

## Hands-on 2 : Stock Query Methods

### Features Implemented

- Created Stock Entity
- Created Stock Repository
- Added sample Stock database
- Search stock records between two dates.
- Filter stocks with closing price greater than a given value.
- Retrieve Top 3 records by highest volume.
- Retrieve Top 3 lowest closing prices for a stock.

### Repository Methods

```java
findByCodeAndDateBetween()

findByCodeAndCloseGreaterThan()

findTop3ByOrderByVolumeDesc()

findTop3ByCodeOrderByCloseAsc()
```

### Query Methods Covered

- `Between`
- `GreaterThan`
- `Top`
- `OrderBy`
- Multiple Conditions

---

# 📖 Concepts Covered

### Spring Boot

- Auto Configuration
- Dependency Injection
- Application Configuration

### Spring Data JPA

- JpaRepository
- CRUD Operations
- Query Method Creation
- Transactions

### Hibernate

- ORM
- Entity Mapping
- Schema Validation
- SQL Generation

### Query Methods

- `Containing`
- `StartingWith`
- `Between`
- `GreaterThan`
- `Top`
- `OrderBy`

---

# 🚀 Current Progress

| Module | Status |
|---------|--------|
| Spring Boot Setup | ✅ Completed |
| Country CRUD Operations | ✅ Completed |
| Country Query Methods | ✅ Completed |
| Stock Query Methods | ✅ Completed |
| ORM Mapping | ⏳ Next Module |
| Many-to-One Mapping | ⏳ Pending |
| One-to-Many Mapping | ⏳ Pending |
| Many-to-Many Mapping | ⏳ Pending |

---

> This README will continue to be updated as additional Spring Boot, Spring Data JPA, and Hibernate hands-on exercises are completed.