# ProductService

A RESTful product microservice built with Spring Boot.

## Run

mvn spring-boot:run

## Endpoints

| Method | Path           | Description            |
|--------|----------------|------------------------|
| GET    | /products      | List all products      |
| GET    | /products/{id} | Get product by ID      |
| POST   | /products      | Create a new product   |
| GET    | /health        | Service health check   |