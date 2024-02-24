# Full-Stack Employee Management System project using Spring Boot and ReactJS

Build Full-Stack Employee Management System App using Java, Spring Boot 3, ReactJS and MySQL.

## Tools and technologies used in this course:

### Server-side:

Java 17+, Spring Boot 3+, Spring Data JPA (Hibernate), Maven, IntelliJ IDEA, MySQL database, Postman

### Client-side:

React JS 18+, React Hooks, React Router, Axios, Bootstrap CSS framework, Visual Studio Code IDE

## Requirements

- Java Development Kit (JDK) 17 or +
- Node.js ve npm 18+
- MySQL

## Installation
1- Clone the project:
   ```sh
   git clone https://github.com/haktanonur/employee-management-system.git
  ```
2- Create the database:

Configure to your database settings from application.properties file and Connect MySQL client and create a new database:

  ```sh
  CREATE DATABASE ems;
  ```
3- For the backend, navigate to the backend directory and start the Spring Boot application:
  ```sh
   cd ems-backend
   mvn spring-boot:run
  ```

4- For the frontend, navigate to the frontend directory, install the necessary dependencies, and start the React application:
   ```sh
   cd ems-frontend
   npm install
   npm run dev
   ```

5- Visit http://localhost:3000 in your browser to view the application.

## Usage
The application provides basic functionalities such as listing, adding, updating, and deleting employees and departments. The user interface is user-friendly and easy to navigate.

## Contributions
If you'd like to contribute by adding new features or fixing bugs, please open a pull request. Suggestions and feedback are also welcome.
