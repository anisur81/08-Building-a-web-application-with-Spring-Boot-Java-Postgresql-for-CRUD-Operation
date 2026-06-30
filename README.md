```markdown
# Spring Boot Java CRUD Web Application

## Complete Step-by-Step Documentation

---

## Project Overview

This project is a Spring Boot MVC web application that performs CRUD (Create, Read, Update, Delete) operations using:

- Java 21 (or your installed version)
- Spring Boot
- Spring MVC
- Spring Data JPA
- PostgreSQL
- Thymeleaf
- Spring Security
- Maven

---

## Existing Project Structure

```
portfolio/
│
├── pom.xml
├── src/
│
├── main/
│   ├── java/
│   │
│   └── com/
│       └── anis/
│           └── portfolio/
│
│               ├── PortfolioApplication.java
│
│               ├── config/
│               │      SecurityConfig.java
│               │
│               ├── controller/
│               │      HomeController.java
│               │
│               ├── entity/
│               │      ContactReq.java
│               │
│               ├── repository/
│               │      ContactReqRepository.java
│               │
│               └── service/
│                      ContactReqService.java
│
│                      impl/
│
└── resources/
       application.properties

       static/

       templates/

            add.html
            edit.html
            contact.html
            home.html
```

---

## Architecture

```
Browser
    │
    ▼
Thymeleaf HTML Page
    │
    ▼
Controller
    │
    ▼
Service
    │
    ▼
Repository (JPA)
    │
    ▼
PostgreSQL Database
```

---

## CRUD Workflow

```
User
  ↓
HTML Form
  ↓
Spring Controller
  ↓
Service Layer
  ↓
Repository
  ↓
PostgreSQL
```

---

## Step 1: Clone the source code as per the repository

 

## Request Flow

### Create

```
add.html
   ↓
POST /save
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
Database
   ↓
Redirect
   ↓
contact.html
```

### Read

```
Browser
   ↓
GET /contact
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
Database
   ↓
Model
   ↓
contact.html
```

### Update

```
contact.html
   ↓
Edit Button
   ↓
Controller
   ↓
edit.html
   ↓
POST /update
   ↓
Database
   ↓
Redirect
```

### Delete

```
Delete Button
   ↓
Controller
   ↓
Repository
   ↓
Database
   ↓
Redirect
```

---

## PostgreSQL Table

```sql
CREATE TABLE contact_requests (

id BIGSERIAL PRIMARY KEY,

fullname VARCHAR(100),

email VARCHAR(100),

subject VARCHAR(150),

message TEXT

);
```

---

## URL Mapping

| URL          | Method | Description            |
| ------------ | ------ | ---------------------- |
| `/add`       | GET    | Display Add Form       |
| `/save`      | POST   | Save New Record        |
| `/contact`   | GET    | View All Records       |
| `/edit/{id}` | GET    | Display Edit Form      |
| `/update`    | POST   | Update Existing Record |
| `/delete/{id}`| GET   | Delete Record          |

---

## Layer Responsibilities

| Layer      | Responsibility       |
| ---------- | -------------------- |
| HTML       | User Interface       |
| Controller | Handle HTTP Requests |
| Service    | Business Logic       |
| Repository | Database Access      |
| Entity     | Database Mapping     |
| PostgreSQL | Data Storage         |

---

## Complete CRUD Flow Diagram

```
                 USER
                  │
                  ▼
          Thymeleaf HTML
                  │
                  ▼
        Spring MVC Controller
                  │
                  ▼
          Service Interface
                  │
                  ▼
     Service Implementation
                  │
                  ▼
      Spring Data JPA Repository
                  │
                  ▼
            PostgreSQL Database
```

---

 
