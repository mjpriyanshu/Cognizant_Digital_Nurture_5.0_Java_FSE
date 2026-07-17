# Spring Security JWT Authentication (Spring Boot 4)

## Project Structure

```
spring-security-jwt
│
├── src
│
├── main
│   │
│   ├── java
│   │
│   │   └── com.cognizant.springsecurityjwt
│   │
│   │       ├── SpringSecurityJwtApplication.java
│   │       │
│   │       ├── controller
│   │       │      AuthenticationController.java
│   │       │
│   │       ├── security
│   │       │      SecurityConfig.java
│   │       │
│   │       ├── util
│   │       │      JwtUtil.java
│   │       │
│   │       └── model
│   │              AuthenticationResponse.java
│   │
│   └── resources
│          application.properties
│
└── pom.xml
```

---

# File Definitions

## SpringSecurityJwtApplication.java

Main class of the application.

- Starts the Spring Boot application.
- Entry point containing the `main()` method.

---

## SecurityConfig.java

Spring Security configuration class.

Responsibilities:

- Configure authentication.
- Configure authorization.
- Create in-memory users.
- Configure HTTP Basic Authentication.
- Define which URLs require authentication.

---

## AuthenticationController.java

REST Controller.

Responsibilities:

- Read Authorization Header.
- Decode Base64 credentials.
- Extract Username.
- Generate JWT.
- Return JWT Token.

---

## JwtUtil.java

Utility class.

Responsibilities:

- Generate JWT.
- Configure Secret Key.
- Set Subject.
- Set Issue Time.
- Set Expiry Time.
- Sign the Token.

---

## AuthenticationResponse.java

Response Model.

Represents

```json
{
    "token":"..."
}
```

Returned to the client after successful authentication.

---

# Important Spring Security Classes

## SecurityFilterChain

Modern Spring Security configuration class.

Purpose

- Configures authentication.
- Configures authorization.
- Protects REST endpoints.

Replaces

```
WebSecurityConfigurerAdapter
```

---

## UserDetailsService

Provides user information to Spring Security.

Can load users from

- Memory
- Database
- LDAP
- OAuth Provider

Current project

```
InMemoryUserDetailsManager
```

---

## PasswordEncoder

Encrypts passwords.

Current implementation

```
DelegatingPasswordEncoder
```

Production applications generally use BCrypt.

---

## InMemoryUserDetailsManager

Stores users in application memory.

Useful for

- Learning
- Testing
- Small demos

Not recommended for production.

---

# Spring Annotations

## @Configuration

Marks a configuration class.

Spring loads this class during application startup.

Example

```
SecurityConfig
```

---

## @Bean

Registers an object as a Spring Bean.

Spring manages its lifecycle.

Examples

```
SecurityFilterChain

UserDetailsService
```

---

## @RestController

Marks a REST Controller.

Returns JSON directly instead of HTML pages.

---

## @GetMapping

Maps HTTP GET requests.

Example

```
/authenticate
```

---

## @Component

Marks a helper class managed by Spring.

Example

```
JwtUtil
```

---

# JWT Concepts

## JWT (JSON Web Token)

An authentication token used to identify users without storing session data.

A JWT contains three parts:

```
Header

Payload

Signature
```

Example

```
xxxxx.yyyyy.zzzzz
```

---

## Header

Contains

- Token Type
- Signing Algorithm

---

## Payload

Contains application-specific information.

Current Project

```
username
```

Can also contain

- userId
- roles
- permissions

---

## Signature

Created using a Secret Key.

Purpose

- Prevent token tampering.
- Verify authenticity.

---

## Secret Key

Used to digitally sign the JWT.

Only the server should know this key.

Never expose it publicly.

---

## Token Expiry

Limits token lifetime.

Current Project

```
20 Minutes
```

Purpose

- Better Security
- Prevent misuse of old tokens

---

# HTTP Basic Authentication

Authentication method where client sends

```
username:password
```

encoded using Base64.

Example

```
user:pwd
```

↓

```
dXNlcjpwd2Q=
```

↓

```
Authorization

Basic dXNlcjpwd2Q=
```

**Important**

Base64 is **Encoding**, **NOT Encryption**.

Anyone can decode it.

---

# Why JWT?

Without JWT

Every request sends

```
username

password
```

With JWT

After login

Only

```
JWT Token
```

is sent.

Advantages

- Stateless
- Faster
- More Secure
- Scalable

---

# What Cognizant Asked Us To Use

The Cognizant material was written using:

```
Spring Boot 2.x

Spring Security 5
```

It specifically uses

- WebSecurityConfigurerAdapter
- AuthenticationManagerBuilder
- antMatchers()
- configure(HttpSecurity)
- JJWT 0.9.x

These were the standard APIs at that time.

---

# Why We Didn't Use Them

Our project uses

```
Spring Boot 4.1.x

Java 21

Spring Security 7
```

The old APIs have been **deprecated and removed**.

Trying to use them results in compilation errors.

Example

```
WebSecurityConfigurerAdapter
```

No longer exists.

Similarly

```
antMatchers()
```

has been removed.

Therefore we used the modern equivalents.

---

# Spring Boot 2 vs Spring Boot 4 Comparison

| Spring Boot 2 | Spring Boot 4 |
|---------------|---------------|
| WebSecurityConfigurerAdapter | SecurityFilterChain |
| configure(HttpSecurity) | SecurityFilterChain Bean |
| AuthenticationManagerBuilder | UserDetailsService Bean |
| antMatchers() | requestMatchers() |
| authorizeRequests() | authorizeHttpRequests() |
| JJWT 0.9.x | JJWT 0.12.x |
| setSubject() | subject() |
| setIssuedAt() | issuedAt() |
| setExpiration() | expiration() |
| signWith(SignatureAlgorithm, String) | signWith(SecretKey) |

---

# Old vs New JWT Library

## Old (JJWT 0.9.x)

```java
builder.setSubject(user);

builder.setIssuedAt(new Date());

builder.setExpiration(...);

builder.signWith(SignatureAlgorithm.HS256, "secretkey");
```

---

## New (JJWT 0.12.x)

```java
Jwts.builder()

.subject(user)

.issuedAt(...)

.expiration(...)

.signWith(secretKey)

.compact();
```

More fluent and type-safe.

---

# Old Security Configuration

```java
public class SecurityConfig
extends WebSecurityConfigurerAdapter
```

Configure methods

```java
configure(HttpSecurity)

configure(AuthenticationManagerBuilder)
```

---

# New Security Configuration

Uses

```java
@Bean

SecurityFilterChain
```

and

```java
@Bean

UserDetailsService
```

No inheritance required.

Configuration is completely Bean-based.

---

# Summary

This project demonstrates

- Spring Security
- HTTP Basic Authentication
- JWT Token Generation
- Base64 Decoding
- In-Memory Authentication
- Spring Security Configuration
- Modern Spring Boot 4 Security APIs

Although the Cognizant training material was written for **Spring Boot 2.x**, the same functionality has been implemented using the latest **Spring Boot 4** APIs. The concepts remain exactly the same; only the framework configuration style has evolved.