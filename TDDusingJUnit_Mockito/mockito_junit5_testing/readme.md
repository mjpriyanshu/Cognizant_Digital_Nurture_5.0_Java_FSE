# 📋 Project Overview

This project contains **2 Mockito exercises** demonstrating mocking and verification in unit tests:

- **Exercise 1**: Mocking an external API and stubbing its method to return a predefined value.
- **Exercise 2**: Verifying that a method was called with specific arguments (interaction testing).

All tests are written in **Java 17** using **JUnit 5 (Jupiter)** and **Mockito 5.6.0**, and are managed with **Maven**.

---

# 🛠️ Technology Stack

| Technology | Version |
| :--- | :--- |
| **Java** | 17 |
| **JUnit (Jupiter)** | 5.10.0 |
| **Mockito** | 5.6.0 |
| **Build Tool** | Maven (with `pom.xml`) |

---

# 📁 Project Structure

```
mockito-exercises/
├── pom.xml
└── src/
├── main/
│ └── java/
│ └── com/
│ └── cognizant/
│ ├── ExternalApi.java # Interface to be mocked
│ └── MyService.java # Class under test
└── test/
└── java/ # (Mark as Test Source Root)
└── MyServiceTest.java # Contains Exercise 1 & 2 tests
```

# 📦 Maven Dependencies (`pom.xml`)

You must include these dependencies:

```xml
<dependencies>
    <!-- JUnit 5 (Jupiter) -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Mockito Core -->
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>5.6.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Mockito JUnit 5 Extension (Optional but recommended) -->
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-junit-jupiter</artifactId>
        <version>5.6.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

# Key Concepts

Concept	                Code Snippet / Annotation	            Description	                                            Used In
Creating a Mock	        `Mockito.mock(ExternalApi.class)`	        Creates a dummy implementation of an interface/class.   Exercise 1 & 2

Stubbing	  `when(mock.getData()).thenReturn("Mock Data")`	Tells the mock what to return when a specific method is called.Exercise 1


Injecting M ocks	`new MyService(mockApi)`	    Passes the mock object into the real service (Constructor Injection).	Exercise 1 & 2


Verification	`verify(mockApi, times(1)).getData()`	    Checks if a specific method was called on the mock (and how many times)  Exercise 2


Times Verification	    `times(1)`	    Specifies the exact number of invocations expected.
Exercise 2