# 🧩 CRUD API com Spring Boot

Minha **primeira API REST** desenvolvida com **Spring Boot**, implementando um CRUD completo usando **Spring Data JPA** e banco **H2**.

Projeto feito totalmente na prática, lidando com erros reais (404, 405, 400) e aprendendo como resolvê-los no dia a dia de um backend Java.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Postman

---

## 📁 Estrutura do Projeto

```
com.julio.crud
├── controller
│   └── PersonController.java
├── model
│   └── Person.java
├── repository
│   └── PersonRepository.java
├── service
│   └── PersonService.java
└── CrudApplication.java
```

---

## 📌 Endpoints da API

### ➕ Criar Pessoa
**POST** `/person/create`

```json
{
  "name": "Julio",
  "age": 22
}
```

---

### 📄 Listar Pessoas
**GET** `/person/read`

---

### ✏️ Atualizar Pessoa
**PUT** `/person/update/{id}`

```json
{
  "name": "Julio Cesar",
  "age": 23
}
```

---

### ❌ Deletar Pessoa
**DELETE** `/person/delete/{id}`

---

## 🗄️ Banco de Dados

- Banco em memória **H2**
- Tabelas criadas automaticamente via JPA
- Ideal para testes e aprendizado

---

## 🧪 Testes

- Testes realizados com **Postman**
- Envio de JSON no Body
- Validação de status HTTP
- Teste de todos os métodos (GET, POST, PUT, DELETE)

---

## 🎯 Objetivo do Projeto

- Aprender Spring Boot na prática
- Criar uma API REST funcional
- Entender Controller, Service e Repository
- Trabalhar com JPA e persistência
- Versionar projeto com Git e GitHub

---
