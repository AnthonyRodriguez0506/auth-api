# auth-api

A secure REST API for user authentication built with Spring Boot, implementing JWT-based stateless authentication and protected routes with Spring Security.

## Tech Stack

- Java 21
- Spring Boot 4.0.5
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

- [x] Project initialization with Spring Boot
- [x] User model (username, email, password)
- [x] UserRepository with findByEmail
- [x] SecurityConfig with BCrypt bean
- [x] JwtUtil (generateToken, extractEmail)
- [x] UserService (register + login)
- [x] AuthController (POST /register, POST /login)
- [X] SecurityConfig (private and public Routes)
- [X] JwtAuthenticationFilter
- [ ] GET protected profile endpoint
- [ ] Connect to a persistent database (PostgreSQL)
- [ ] Dockerize the application
- [ ] API documentation with Swagger
