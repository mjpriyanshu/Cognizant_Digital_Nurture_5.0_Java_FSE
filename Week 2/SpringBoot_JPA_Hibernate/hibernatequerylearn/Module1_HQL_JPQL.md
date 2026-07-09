# Spring - Data - JPA - Hands on

## Module 1 - Introduction to HQL & JPQL

---

# What is HQL?

**Hibernate Query Language (HQL)** is an object-oriented query language provided by Hibernate.

- Works with **Entity Classes**, not database tables.
- Database independent.
- Similar to SQL syntax.
- Uses Java class names and object properties.

Example:

```java
FROM Employee
```

instead of

```sql
SELECT * FROM employee;
```

---

# What is JPQL?

**Java Persistence Query Language (JPQL)** is the standard query language defined by JPA.

Like HQL,

- works with Entity classes
- works with object properties
- database independent

Hibernate supports JPQL and also extends it with additional HQL features.

---

# HQL vs JPQL

| HQL | JPQL |
|-----|------|
| Hibernate Specific | JPA Standard |
| Supports Hibernate Features | Portable across JPA providers |
| Uses Entity Objects | Uses Entity Objects |
| Database Independent | Database Independent |

---

# SQL vs HQL

SQL

```sql
SELECT * FROM employee;
```

HQL

```java
FROM Employee
```

SQL uses

- Table Name
- Column Name

HQL uses

- Entity Class
- Java Variables

---

# @Query Annotation

Used to write custom HQL or JPQL queries inside a Repository.

Example

```java
@Query("FROM Employee")
List<Employee> getAllEmployees();
```

---

# HQL Fetch Keyword

Normally Hibernate loads related entities lazily.

Using **JOIN FETCH** loads them in a single query.

Example

```java
@Query("SELECT e FROM Employee e JOIN FETCH e.department")
```

Advantages

- Avoids LazyInitializationException
- Reduces multiple database queries

---

# Aggregate Functions in HQL

Common functions

- COUNT()
- SUM()
- AVG()
- MIN()
- MAX()

Example

```java
SELECT AVG(e.salary)
FROM Employee e
```

---

# Native Query

A Native Query executes actual SQL instead of HQL.

Example

```java
@Query(value = "SELECT * FROM employee",
       nativeQuery = true)
```

Advantages

- Full SQL support
- Uses database-specific features

Disadvantages

- Database dependent

---

# Criteria API

Criteria API creates queries dynamically using Java code instead of writing query strings.

Advantages

- Dynamic query building
- Type-safe
- Useful for complex search filters

---

# Summary

HQL

→ Object-Oriented Query Language

JPQL

→ Standard JPA Query Language

Native Query

→ Executes SQL directly

Criteria API

→ Builds queries programmatically