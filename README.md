# Notes App (Spring Boot)

A simple CRUD-based Notes application built with Spring Boot.

This project demonstrates:-
- Basic CRUD operations with Spring Data JPA
- REST APIs using Spring Web
- In-memory database (H2)

## Tech stack
- Java 21
- Spring Boot 3.5.5
- Spring web
- Spring Data JPA
- H2 Database
- Lombok

## Setup & Run (Local)
1. Clone the repository:
    ```bash
    https://github.com/vishi2161/01_Notes_App.git
    cd notes-app
    ```
2. Run the application:
    ```bash
   ./mvnw spring-boot:run
    ```
   or
    ```bash
   mvn clean install
   java -jar target/
   notes-app-0.0.1-SNAPSHOT.jar
    ```

3. Access the app:
   - API base URL: http:localhost:8080/notes
   - H2 Console: http:localhost:8080/h2-console
   - JDBC URL: jdbc:h2:mem:testdb

## Run with Docker
1. Build Docker image:
    ```bash
   docker build -t notes-app .
    ```
2. Run container:
    ```bash
   docker run -p 8080:8080 notes-app
   ```
   
3. App available at: http:localhost:8080/notes

## API endpoints
- GET/notes --> get all notes
- GET/notes/{id} --> get note by id
- POST/notes --> create note
    ```json
  {
      "title": "My note",
      "content": "This is the content"
  }
  ```
- PUT/notes/{id} --> update note
- DELETE/notes/{id} --> delete note

## Author
Virat