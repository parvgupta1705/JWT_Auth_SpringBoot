🔐 JWT Authentication using Spring Boot

A secure backend authentication system built using Spring Boot and JSON Web Tokens (JWT). This project demonstrates how to implement login, registration, and protected APIs using token-based authentication.

🚀 Features
🔑 User Registration & Login
🔐 JWT-based Authentication
🛡️ Secure REST APIs
📦 Stateless Session Management
🧪 Tested using Postman
⚙️ Spring Security Integration

JWT enables secure and stateless authentication by sending a signed token with each request instead of maintaining sessions .

🛠️ Tech Stack
Java
Spring Boot
Spring Security
Maven
JWT (JSON Web Token)
MySQL / H2 (based on your config)
📂 Project Structure
src/
 ├── controller     # REST APIs
 ├── service        # Business logic
 ├── repository     # Database layer
 ├── config         # Security configuration
 ├── model          # Entity classes
 └── util           # JWT utilities
⚙️ How JWT Works
User logs in with credentials
Server verifies and generates a JWT
Client stores the token
Token is sent in headers for every request
Server validates token and grants access

JWT consists of:

Header
Payload
Signature
🔧 Setup & Installation
1. Clone the Repository
git clone https://github.com/parvgupta1705/JWT_Auth_SpringBoot.git
cd JWT_Auth_SpringBoot
2. Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
3. Run the Application
mvn spring-boot:run

Server will start at:

http://localhost:8080
🔗 API Endpoints
🔐 Authentication
Method	Endpoint	Description
POST	/auth/register	Register user
POST	/auth/login	Login & get token
🔒 Protected APIs
Method	Endpoint	Description
GET	/user	User data (secured)

👉 Pass JWT in header:

Authorization: Bearer <your_token>
🧪 Testing with Postman
Register a user
Login to get JWT token
Use token in Authorization header
Access protected routes
📸 Sample Flow
Login → JWT Generated → Store Token → Send in Header → Access Protected API
📌 Prerequisites
Java 17+
Maven
MySQL / H2
Postman
🤝 Contributing

Feel free to fork the repo and contribute:

git checkout -b feature/your-feature
git commit -m "Added feature"
git push origin feature/your-feature
📄 License

This project is open-source and available under the MIT License.

💡 Author

Parv Gupta
GitHub: @parvgupta1705

⭐ Support

If you found this project helpful, consider giving it a ⭐ on GitHub!
