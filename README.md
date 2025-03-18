# Student-Management-System

## 📌 Overview
The **Student Management System** is a web-based application designed to manage student records efficiently. It allows users to add, update, delete, and view student details, making administrative tasks easier.

## 🚀 Features
- Add new students with details like name, age, class, and contact information.
- Update student records.
- Delete student entries.
- View a list of all students.


## 🛠 Technologies Used
- **Java** (Core functionality)
- **Spring Boot** (Backend framework)
- **Spring MVC** (Model-View-Controller architecture)
- **Spring Data JPA** (Database operations)
- **Oracle** (Database)
- **Thymeleaf / HTML, CSS, JavaScript** (Frontend)


## 📂 Project Structure
```
Student_Management_System/
│── src/main/java/com/example/studentmanagement
│   ├── controller/  # Handles HTTP requests
│   ├── model/       # Defines entity classes
│   ├── repository/  # Database interaction
│   ├── service/     # Business logic
│── src/main/resources/templates  # HTML Views (if using Thymeleaf)
│── application.properties  # Configuration file
│── pom.xml  # Maven dependencies
```

## 🚀 Installation & Setup
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/shivamKumar8541/Student-Management-System.git
cd Student-Management-System
```

### 2️⃣ Configure Database
- Open **application.properties** and update database credentials:
```properties
spring.application.name=Student_Management_System
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:ORCLV
spring.datasource.username=system
spring.datasource.password=shivam12
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

### 3️⃣ Build and Run the Project
```sh
mvn clean install
mvn spring-boot:run
```

### 4️⃣ Access the Application
- Open your browser and go to: **`http://localhost:8080`**

## 📌 API Endpoints
| Method | Endpoint | Description |
|--------|------------|----------------|
| GET | `/students` | Get all students |
| POST | `/students` | Add a new student |
| PUT | `/students/{id}` | Update student details |
| DELETE | `/students/{id}` | Delete a student |

## 📜 License
This project is open-source and available under the **MIT License**.

---
### 💡 Contributing
If you'd like to contribute, feel free to fork the repository and submit a pull request!

🚀 Happy Coding! 😊
