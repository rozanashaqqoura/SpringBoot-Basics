# Spring Boot Book API

A simple RESTful Book API built with Spring Boot.

This project is my first practical experience with Spring Boot.  
It focuses on understanding the basics of REST APIs, Controllers, Services, Models, Dependency Injection, and CRUD operations.

---

## Technologies

- Java
- Spring Boot
- Maven
- REST API
- Postman
- Git & GitHub

---

## Project Structure

```text
src/main/java/com/rozana/bookapi/

├── controller/
│   ├── BookController.java
│   └── RestMapping.java
│
├── model/
│   └── Book.java
│
└── service/
    └── BookService.java
```

---

## Features

This project implements the basic CRUD operations for books:

- Add a book
- Get all books
- Get a book by ID
- Update a book
- Delete a book
- Health check endpoint

---

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/books/health` | Check if the API is running |
| POST | `/api/books/addbook` | Add a new book |
| GET | `/api/books/getallbooks` | Get all books |
| GET | `/api/books/{id}` | Get a book by ID |
| PUT | `/api/books/{id}` | Update a book |
| DELETE | `/api/books/{id}` | Delete a book |

---

# Book Model

The `Book` model contains the following fields:

- `id`
- `title`
- `author`
- `price`
- `category`
- `language`
- `pages`
- `publicationYear`
- `description`
- `available`

### Example Book JSON

```json
{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "price": 30.0,
  "category": "Programming",
  "language": "English",
  "pages": 464,
  "publicationYear": 2008,
  "description": "A book about writing clean and maintainable code.",
  "available": true
}
```

---

# API Testing with Postman

All API endpoints were tested successfully using Postman.

---

## 1. Health Check

### Request

```http
GET /api/books/health
```

### Description

This endpoint is used to check whether the Spring Boot application is running.

### Response

```text
Running Service
```

### Screenshot


---

## 2. Add Book

### Request

```http
POST /api/books/addbook
```

### Request Body

```json
{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "price": 30.0,
  "category": "Programming",
  "language": "English",
  "pages": 464,
  "publicationYear": 2008,
  "description": "A book about writing clean and maintainable code.",
  "available": true
}
```

### Description

This endpoint receives the book data as JSON and adds the book to the list.

### Response

```text
Book Added Successfully
```

### Screenshot

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/9a2cd669-a242-4081-a0ea-ccc6ac293fcb" />

---

## 3. Get All Books

### Request

```http
GET /api/books/getallbooks
```

### Description

This endpoint returns all books currently stored in the application.

### Response

The API returns a `List<Book>` containing all available books.

### Screenshot

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/5e545e81-dc49-48d5-a17b-a16559c42bd7" />

---

## 4. Get Book By ID

### Request

```http
GET /api/books/1
```

### Description

This endpoint searches for a book using its ID and returns the matching book.

### Response

The API returns one `Book` object.

### Screenshot

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/1055c241-6cd3-4cab-8299-d34e19f6a40f" />

---

## 5. Update Book

### Request

```http
PUT /api/books/1
```

### Request Body

```json
{
  "id": 1,
  "title": "Clean Code - Updated",
  "author": "Robert C. Martin",
  "price": 45.0,
  "category": "Software Engineering",
  "language": "English",
  "pages": 500,
  "publicationYear": 2008,
  "description": "Updated book description.",
  "available": false
}
```

### Description

This endpoint searches for the book using its ID and updates its information using the new data received in the request body.

### Response

The API returns the updated `Book` object.

### Screenshot

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/0fc83eb7-8615-4eac-9004-79236c924022" />

---

## 6. Delete Book

### Request

```http
DELETE /api/books/1
```

### Description

This endpoint searches for the book using its ID and removes it from the list.

### Response

```text
Book Deleted Successfully
```

### Screenshot

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/1d79ad56-1be3-45f0-89a7-b2f2b712dd4a" />

---

## 7. Verify Deletion

After deleting the book, the Get All Books endpoint was tested again to verify that the book was removed successfully.

### Request

```http
GET /api/books/getallbooks
```

### Response

```json
[]
```

### Description

An empty list confirms that the book was successfully deleted.

### Screenshot

<!-- SCREENSHOT: After Delete Postman screenshot here -->

---

# Application Flow

The basic flow of the application is:

```text
Client / Postman
       |
       v
BookController
       |
       v
BookService
       |
       v
List<Book>
```

### Controller

The `BookController` receives HTTP requests from the client and sends the required data to the service.

### Service

The `BookService` contains the logic for adding, retrieving, updating, and deleting books.

### Model

The `Book` class represents the book data and contains its fields, constructor, getters, and setters.

---

# What I Learned

Through this project, I practiced:

- Creating a Spring Boot application
- Creating REST Controllers
- Creating Service classes
- Creating Model classes
- Constructor Injection
- Dependency Injection
- Using `@RequestBody`
- Using `@PathVariable`
- HTTP methods
- CRUD operations
- Working with Java Lists
- Constructors
- Getters and Setters
- Testing APIs using Postman
- Using Git and GitHub

---

# Project Goal

The goal of this project was to build my first simple Spring Boot CRUD API and understand how Controllers, Services, Models, HTTP requests, and Java objects work together.
