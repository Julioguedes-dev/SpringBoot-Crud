```markdown
# API CRUD com Spring Boot

## Visão Geral

Este projeto é uma API REST desenvolvida com Spring Boot que realiza operações completas de CRUD para gerenciamento de pessoas. A aplicação segue princípios de arquitetura em camadas e boas práticas utilizadas no desenvolvimento backend profissional.

---

## Tecnologias Utilizadas

- Java 17+
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

A API disponibiliza endpoints para:

- Criar registros
- Listar dados
- Atualizar informações
- Deletar registros

---

## Endpoints da API

### Criar Pessoa

```
POST /person/create
```

Body:

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

Body:

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
- Estrutura escalável
- Integração com Spring Data JPA
- Criação automática de tabelas via Hibernate

Configuração de exemplo:

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
- PostgreSQL rodando

### Passos

Clone o repositório:

```
git clone https://github.com/Julioguedes-dev/SpringBoot-Crud.git
```

Entre na pasta:

```
cd SpringBoot-Crud
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

Os testes foram realizados utilizando Postman para validar:

- Métodos HTTP
- Respostas JSON
- Status HTTP
- Tratamento de erros (400, 404, 405)

Para rodar testes automatizados:

```
mvn test
```

---

## Boas Práticas Aplicadas

- Arquitetura em camadas
- Separação de responsabilidades
- Injeção de dependência
- Código limpo e organizado
- Tratamento de exceções
- Logs estruturados
- Dependências atualizadas

---

## Objetivos do Projeto

- Praticar desenvolvimento com Spring Boot
- Entender arquitetura REST
- Trabalhar com persistência usando JPA
- Estruturar aplicações backend
- Versionar código com Git e GitHub

---

## Autor

```
Julio Cesar
```

---

## Licença

Este projeto está licenciado sob a licença MIT.
```
