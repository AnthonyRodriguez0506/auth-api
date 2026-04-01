# auth-api

A secure and scalable REST API for user authentication, built with Spring Boot. Implements JWT-based authentication with protected routes, serving as a hands-on introduction to Spring Security in Java.

## Tech Stack

- Java 21
- Spring Boot 4.0.4
- Spring Web — RESTful endpoints
- Spring Security — Authentication and access control
- Spring Data JPA — Data persistence layer
- H2 Database — File-based persistent database for development
- Lombok — Boilerplate reduction
- JWT — Stateless token-based authentication
- Maven — Dependency management

## Running Locally

### Prerequisites

- Java 21 installed
- Maven installed (or use the included `mvnw` wrapper)

### Steps

```bash
# Clone the repository
git clone https://github.com/AnthonyRodriguez0506/auth-api.git

# Navigate into the project
cd auth-api

# Run the application
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`

## Endpoints

| Method | Endpoint            | Description              | Auth Required |
|--------|---------------------|--------------------------|---------------|
| POST   | `/auth/register`    | Register a new user      | ❌            |
| POST   | `/auth/login`       | Login and receive JWT    | ❌            |
| GET    | `/api/profile`      | Access protected route   | ✅            |

## Roadmap

- [X] Project initialization with Spring Boot
- [ ] User model (username, email, password)
- [ ] POST register a new user
- [ ] POST login with JWT response
- [ ] JWT filter for protected routes
- [ ] GET protected profile endpoint
- [ ] Password hashing with BCrypt
- [ ] Connect to PostgreSQL for production