
# CollegeApi

API REST feita com **Spring Boot** para cadastrar, buscar, atualizar e deletar pessoas de uma universidade. Usa banco de dados MySQL.  
Feito por Fernanda Gabrielli e Clara Heloísa

---

## 🚀 Tecnologias

- Java 17  
- Spring Boot (Web, JPA, Lombok)  
- MySQL  
- Maven  
- SLF4J (Logs)

---

## 📁 Estrutura

```
src/
├── controller/           // Endpoints REST
├── dto/                  // Transferência de dados (PessoaDto)
├── entity/               // Entidade Pessoa
├── repository/           // Interface do JPA
├── service/              // Camada de serviço com casos de uso
├── exception/            // Exceções customizadas
├── PessoasApiApplication.java
└── resources/
    └── application.properties
```

---

## 🛠️ Configuração

Edite `src/main/resources/application.properties` com as credenciais do seu banco MySQL. Exemplo:

```
spring.datasource.url=jdbc:mysql://localhost:3306/db_uni_pessoas
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

---

## ▶️ Rodar o projeto

```bash
git clone https://github.com/fernandagabrielli/collegeapi.git
cd pessoas-api
./mvnw spring-boot:run
```

Acesse: `http://localhost:8080`

---

## 📡 Endpoints

### POST `/api/pessoas`

Cadastra uma nova pessoa.  
Requer um JSON com os campos: `name`, `cpf`, `year`.

---

### GET `/api/pessoas/{id}`

Busca uma pessoa por ID.

---

### PUT `/api/pessoas/{id}`

Atualiza os dados de uma pessoa pelo ID.  
Corpo: JSON com os novos valores de `name`, `cpf`, `year`.

---

### DELETE `/api/pessoas/{id}`

Deleta uma pessoa com base no ID.

---

### GET `/api/pessoas/filtrar?nome=Rafael&idade=18`

Retorna pessoas cujo **primeiro nome** é "Rafael" e cuja **idade** é maior que 18.  
Parâmetros:
- `nome`: primeiro nome
- `idade`: idade mínima

---

## ⚠️ Exceções

A aplicação lança exceções customizadas da camada de serviço, como por exemplo:  
`PessoaNaoEncontradaException` — tratada com `@ControllerAdvice`.

---

## 🪵 Logs

Todas as operações são registradas utilizando SLF4J (`LoggerFactory`) na camada de serviço e controlador.

---

## 📄 Licença

MIT License

---

<details id="english-version">
<summary>🇬🇧 [English Version]</summary>

## 🇬🇧 People Management - University

Simple REST API with **Spring Boot** to register, update and delete university people using MySQL.  
Made by Fernanda Gabrielli and Clara Heloísa

---

### 🚀 Tech Stack

- Java 17  
- Spring Boot (Web, JPA, Lombok)  
- MySQL  
- Maven  
- SLF4J (Logs)

---

### 📁 Structure

```
src/
├── controller/           // REST Endpoints
├── dto/                  // Data Transfer (PessoaDto)
├── entity/               // Entity (PessoaEntity)
├── repository/           // JPA Interface
├── service/              // Business logic
├── exception/            // Custom exceptions
├── PessoasApiApplication.java
└── resources/
    └── application.properties
```

---

### 🛠️ Setup

Edit `application.properties` with your MySQL credentials.

---

### ▶️ Run

```bash
git clone https://github.com/fernandagabrielli/collegeapi.git
cd pessoas-api
./mvnw spring-boot:run
```

Go to: `http://localhost:8080`

---

### 📡 Endpoints

#### POST `/api/pessoas`

Create a person.

#### GET `/api/pessoas/{id}`

Get person by ID.

#### PUT `/api/pessoas/{id}`

Update person by ID.

#### DELETE `/api/pessoas/{id}`

Delete person by ID.

#### GET `/api/pessoas/filtrar?nome=Rafael&idade=18`

Find people where the first name is Rafael and age is greater than 18.

---

### ⚠️ Exceptions

Custom exceptions are thrown and handled via `@ControllerAdvice`.

---

### 🪵 Logs

All major operations are logged using SLF4J.

---

### 📄 License

MIT License

</details>
