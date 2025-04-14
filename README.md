# CollegeApi
 
API REST feita com **Spring Boot** para cadastrar e buscar pessoas de uma universidade. Usa banco de dados MySQL.
Feito por Fernanda Gabrielli e Clara Heloísa
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

<details id="english-version">
<summary>🇬🇧 [English Version]</summary>

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
├── PessoasApiApplication.java
└── resources/
    └── application.properties
```

---

### 🛠️ Setup


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
</details>
