# Projeto Java — API CRUD com Spring Boot

## Descrição

Este projeto consiste em uma API REST desenvolvida em Java utilizando Spring Boot. A aplicação implementa operações CRUD completas e segue boas práticas de arquitetura, organização em camadas e padronização de código, com o objetivo de consolidar conhecimentos práticos em desenvolvimento backend.

---

## Tecnologias Utilizadas

- Java 17 ou superior
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven
- Postman

---

## Estrutura do Projeto

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

## Funcionalidades

A API disponibiliza endpoints para gerenciamento de pessoas, permitindo:

- Criação de registros
- Listagem de dados
- Atualização de informações
- Remoção de registros

---

## Endpoints

### Criar Pessoa

```
POST /person/create
```

Body JSON:

```
{
  "name": "Julio",
  "age": 22
}
```

---

### Listar Pessoas

```
GET /person/read
```

---

### Atualizar Pessoa

```
PUT /person/update/{id}
```

Body JSON:

```
{
  "name": "Julio Cesar",
  "age": 23
}
```

---

### Deletar Pessoa

```
DELETE /person/delete/{id}
```

---

## Banco de Dados

A aplicação utiliza PostgreSQL como sistema de gerenciamento de banco de dados relacional.

Características:

- Persistência real de dados
- Estrutura escalável para aplicações reais
- Integração com Spring Data JPA
- Criação automática de tabelas via Hibernate

Configuração exemplo:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/meubanco
spring.datasource.username=postgres
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## Como Executar o Projeto

### Pré-requisitos

- Java instalado
- Maven instalado
- PostgreSQL instalado e rodando

### Passos

Clone o repositório:

```
git clone https://github.com/seu-usuario/seu-repositorio.git
```

Acesse a pasta:

```
cd seu-repositorio
```

Execute:

```
mvn spring-boot:run
```

A aplicação ficará disponível em:

```
http://localhost:8080
```

---

## Testes

Os testes foram realizados utilizando Postman, validando:

- Métodos HTTP
- Respostas JSON
- Status codes
- Tratamento de erros (400, 404, 405)

Para executar testes automatizados:

```
mvn test
```

---

## Segurança e Qualidade

Boas práticas aplicadas no projeto:

- Atualização de dependências vulneráveis
- Tratamento de exceções
- Separação em camadas
- Código limpo e legível
- Logging configurado
- Validação de entradas

---

## Objetivos do Projeto

- Aprender Spring Boot na prática
- Entender arquitetura REST
- Trabalhar com persistência usando JPA
- Estruturar aplicações backend
- Versionar código com Git e GitHub

---
