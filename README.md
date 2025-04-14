# CollegeApi
 
API REST feita com **Spring Boot** para cadastrar e buscar pessoas de uma universidade. Usa banco de dados MySQL.
Feito por Fernanda Gabrielli e Clara Heloísa

> 🇬🇧 [English Version](#people-management---university)

---

## 🚀 Tecnologias

- Java 17  
- Spring Boot (Web, JPA, Lombok)  
- MySQL  
- Maven

---

## 📁 Estrutura

```
src/
├── controller/           // Endpoints
├── dto/                  // Transferência de dados
├── entity/               // Modelo de banco
├── repository/           // Interface do JPA
├── PessoasApiApplication.java
└── resources/
    └── application.properties
```

---

## 🛠️ Configuração

1. Crie o banco:
```sql
CREATE DATABASE universidade_db;
```

2. No `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/universidade_db
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
```

---

## ▶️ Rodar o projeto

```bash
git clone https://github.com/sua-conta/gerenciamento-pessoas.git
cd gerenciamento-pessoas
./mvnw spring-boot:run
```

Acesse: `http://localhost:8080`

---

## 📡 Endpoints

### POST `/api/pessoas`


---

### GET `/api/pessoas/{id}`

Busca pessoa por ID.

---

## 📄 Licença

MIT License

---

## 🇬🇧 People Management - University

Simple REST API with **Spring Boot** to register and retrieve university people using MySQL.

---

### 🚀 Tech Stack

- Java 17  
- Spring Boot (Web, JPA, Lombok)  
- MySQL  
- Maven

---

### 📁 Structure

```
src/
├── controller/           // Endpoints
├── dto/                  // Data Transfer
├── entity/               // Entity
├── repository/           // JPA Interface
├── GerenciamentoPessoasApplication.java
└── resources/
    └── application.properties
```

---

### 🛠️ Setup

1. Create DB:
```sql
CREATE DATABASE universidade_db;
```

2. Edit `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/universidade_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

### ▶️ Run

```bash
git clone https://github.com/your-account/gerenciamento-pessoas.git
cd gerenciamento-pessoas
./mvnw spring-boot:run
```

Go to: `http://localhost:8080`

---

### 📡 Endpoints

#### POST `/api/pessoas`


#### GET `/api/pessoas/{id}`

Get person by ID.

---

### 📄 License

MIT License
