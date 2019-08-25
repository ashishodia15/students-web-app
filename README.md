# students-web-app
 Web application to :
- Display a list of students with the ability to search by last name and/or first name. 
- Edit Student Details
- View Student Information 
 
# What's Inside

This project is based on the Spring Boot project and uses these packages :

- Java 8
- Maven
- Spring Boot (Rest API Implementation)
- Spring Data (JPA & MySQL)
- Bootstrap
- Ajax & jQuery
- ThymeLeaf
- Sweet Alert

# Installation
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies

# Database Configuration

Create a MySQL database with the name springbootdb and add the credentials to /resources/application.properties.
The default ones are :

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update

# Usage

Run the project through the IDE and head out to http://localhost:8080 (based on the set port in application.properties with key "server.port")

or

run this command in the command line:

mvn spring-boot:run