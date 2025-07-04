🔐 Spring Security Showcase – Comprehensive Authentication & Authorization
This project demonstrates multiple core implementations of Spring Security, covering modern and widely-used authentication and authorization strategies in enterprise applications.

✅ Implemented Features:
🔑 Basic Authentication

Traditional HTTP Basic authentication using in-memory or database-stored user credentials.

Ideal for simple internal services or initial testing.

🔐 JWT (JSON Web Token) Authentication

Stateless authentication using signed JWTs.

Includes login endpoints, token generation, token validation, and secured routes using token-based access.

🌐 OAuth2 Login (Social Login)

Third-party login integration (e.g., Google, GitHub) using Spring Security OAuth2 client.

Fetches user profile data after successful authentication.

🛡️ Keycloak Integration

Enterprise identity and access management with Keycloak as an external authorization server.

Handles authentication, role-based access control (RBAC), and user federation.

🔧 Spring Authorization Server

Implements a custom OAuth2 Authorization Server using the Spring Authorization Server project.

Supports OAuth2 flows like authorization code and client credentials.

Issues and manages JWTs for client applications.

This project is ideal for learning and comparing different security models in Spring Boot. It emphasizes modular design, follows best practices, and is easy to extend or integrate into real-world applications.
