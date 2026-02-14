# Projeto Java — API CRUD com Spring Boot

## Descrição

Este projeto consiste em uma API REST desenvolvida em Java utilizando Spring Boot. A aplicação implementa operações CRUD completas e segue boas práticas de arquitetura, organização de camadas e padronização de código, com o objetivo de consolidar conhecimentos práticos em desenvolvimento backend.

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

A aplicação utiliza banco H2 em memória:

- Inicialização automática
- Criação automática de tabelas via JPA
- Ideal para testes e desenvolvimento

Configuração exemplo:

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

---

## Como Executar o Projeto

### Pré-requisitos

- Java instalado
- Maven instalado

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
