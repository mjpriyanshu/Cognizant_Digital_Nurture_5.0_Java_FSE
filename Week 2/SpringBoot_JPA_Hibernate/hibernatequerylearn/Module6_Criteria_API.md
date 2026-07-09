# Spring - Data - JPA - Hands on

## Module 6 - Criteria Query

---

# What is Criteria API?

Criteria API is a feature provided by JPA to create database queries programmatically using Java objects instead of writing query strings.

Instead of writing:

```java
@Query("FROM Employee e WHERE e.salary > 50000")
```

we build the query using Java classes.

---

# Why use Criteria API?

Criteria API is useful when queries are created dynamically at runtime.

Example:

- Search Employee by Name
- Search by Salary
- Search by Department

If the user selects different filters, Criteria API can generate the required query dynamically.

---

# Advantages

- Type Safe
- Dynamic Query Building
- No String Concatenation
- Reduces Query Errors
- Good for Complex Search Screens

---

# Disadvantages

- More verbose than HQL
- Harder to read
- Not suitable for simple queries

---

# HQL vs Criteria API

| HQL | Criteria API |
|-----|--------------|
| String Based | Java Object Based |
| Easy to Read | More Verbose |
| Static Query | Dynamic Query |
| Faster to Write | Better for Dynamic Search |

---

# Example

### HQL

```java
@Query("FROM Employee e WHERE e.permanent = true")
```

---

### Criteria API

```java
CriteriaBuilder builder = entityManager.getCriteriaBuilder();

CriteriaQuery<Employee> query = builder.createQuery(Employee.class);

Root<Employee> employee = query.from(Employee.class);

query.select(employee);
```

---

# When should we use Criteria API?

Use HQL when:

- Query is fixed.
- Query is simple.

Use Criteria API when:

- Query depends on user input.
- Filters are optional.
- Dynamic search is required.

---

# Summary

HQL

- String based
- Easy
- Static

Criteria API

- Java based
- Dynamic
- Type Safe