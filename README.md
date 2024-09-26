# BookReviews

## Overview

BookReviews is a Spring Boot application designed to allow users to create, read, update, and delete book reviews. It leverages various Spring technologies, including Spring Data JPA, Spring Security, and Thymeleaf, to provide a seamless user experience and robust backend functionalities.

## Features

- User authentication and authorization using Spring Security
- Create, read, update, and delete book reviews
- RESTful API endpoints for interacting with book reviews
- In-memory H2 database for development and testing
- Thymeleaf-based frontend for dynamic content rendering

## Technologies Used

- **Java 17**
- **Spring Boot 3.2.4**
- **Spring Data JPA**
- **Spring Security**
- **Thymeleaf**
- **H2 Database**
- **Lombok**
- **Maven** for dependency management

## Getting Started

### Prerequisites

Make sure you have the following installed:

- [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/install.html)

### Clone the Repository

```bash
git clone https://github.com/alexbascevan/BookReviews.git
cd BookReviews
```

### Build the Project

To build the project and install dependencies, run:

```bash
mvn clean install
```

### Running the Application

You can run the application using the following command:

```bash
mvn spring-boot:run
```

The application will be available at `http://localhost:8080`.


### Accessing the Application

Once the application is running, you can access the web interface at:

- **Home Page**: `http://localhost:8080/`
- **Book Reviews**: Available on the home page after logging in.

### Database

The application uses an in-memory H2 database. You can access the H2 console by visiting:

`http://localhost:8080/h2-console`

**JDBC URL**: `jdbc:h2:mem:testdb`

**Username**: `sa`

**Password**: (leave blank)

## Testing

To run tests, use the following command:

```bash
mvn test
```


## Acknowledgments

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Thymeleaf](https://www.thymeleaf.org/)
- [H2 Database](https://www.h2database.com/)
