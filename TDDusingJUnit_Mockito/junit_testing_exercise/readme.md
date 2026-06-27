# 📋 Project Overview
This project contains 3 JUnit4 exercises demonstrating unit testing fundamentals:

Exercise 1: Setting up JUnit and writing a basic test.

Exercise 3: Using various JUnit assertions (assertEquals, assertTrue, assertFalse, assertNull, assertNotNull).

Exercise 4: Implementing the AAA (Arrange-Act-Assert) pattern with Setup (@Before) and Teardown (@After) methods.

All tests are written in Java 17 using JUnit 4.13.2 and are managed with Maven.

# 🛠️ Technology Stack
```
Technology	    Version
Java	        17
JUnit	        4.13.2
Build Tool	    Maven (with pom.xml)
```

# Project Structure
```
junit_testing_exercise/
├── pom.xml
└── src/
    ├── main/
    │   └── java/                         (Empty - No main code needed)
    └── test/
        └── java/     (Mark as Test Source Root)
            ├── Exercise1_SetupTest.java
            ├── Exercise3_AssertionsTest.java
            └── Exercise4_AAATest.java
```

# Maven Dependency (pom.xml)

you must include this dependency

```xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```


# Key Concepts
```
Concept	     ||       Description	              ||       Used In
@Test	     ||   Marks a method as a test case.  ||	   All Exercises

assertEquals ||   Checks if two values are equal. ||	Exercise 3
(expected, actual)	

assertTrue   ||  Checks if a condition is true.   ||	Exercise 3
(condition)


assertFalse  ||	 Checks if a condition is false.  ||	Exercise 3
(condition) 

assertNull   || Checks if an object is null.      || Exercise 3
(object)

assertNotNull|| Checks if an object is not null.  ||  Exercise 3
(object) 

@Before || Runs before every test method (Setup). ||  Exercise 4


@After || Runs after every test method (Teardown).  || Exercise 4


AAA Pattern || Arrange → Act → Assert. || Exercise 4


```