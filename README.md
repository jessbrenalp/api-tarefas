
# API Tarefas

API REST para gerenciamento de tarefas, desenvolvida com Java e Spring Boot.

O projeto foi desenvolvido para praticar desenvolvimento de APIs REST, persistência de dados, conteinerização e integração com serviços AWS simulados utilizando LocalStack.

## 🚀 Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Docker
- LocalStack
- Amazon S3 (simulado)
- Git e GitHub
- GitHub Actions

## ⚙️ Funcionalidades

- Criar tarefas
- Listar tarefas
- Buscar tarefa por ID
- Atualizar tarefas
- Excluir tarefas
- Persistência de dados com MySQL
- Envio de arquivos para um bucket S3 simulado

## ☁️ Integração com AWS

O projeto utiliza o LocalStack para simular serviços da AWS localmente, sem a necessidade de utilizar uma conta AWS real.

### Serviço utilizado

- Amazon S3: armazenamento de arquivos
- LocalStack: simulação do serviço S3
- AWS SDK for Java: integração com o S3

## 🐳 Docker

A aplicação utiliza containers Docker para executar:

- API Spring Boot
- Banco de dados MySQL
- LocalStack

Os containers são conectados por meio de uma rede Docker.

## 🔄 Integração Contínua (CI)

O projeto possui um workflow do GitHub Actions responsável por:

1. Baixar o código do repositório.
2. Configurar o Java 21.
3. Compilar o projeto com Maven.

## 🏗️ Arquitetura

O projeto utiliza uma arquitetura organizada em camadas:

- Controller: recebe e processa as requisições HTTP.
- Service: concentra as regras e operações da aplicação.
- Repository: realiza o acesso aos dados.
- Entity: representa as entidades persistidas no banco de dados.
- Config: contém configurações, incluindo a integração com o S3.

## ▶️ Como executar

### Pré-requisitos

- Java 21
- Maven
- Docker Desktop
- IntelliJ IDEA (opcional)

### Execução

1. Clone o repositório:

```bash
git clone https://github.com/jessbrenalp/api-tarefas.git
```

2. Acesse a pasta do projeto:

```bash
cd api-tarefas
```

3. Configure os serviços Docker necessários.

4. Compile o projeto com Maven.

5. Execute a aplicação.

## 📌 Objetivo

Projeto desenvolvido para aprimorar conhecimentos em desenvolvimento backend com Java e Spring Boot, APIs REST, banco de dados, Docker, integração com serviços AWS simulados e integração contínua com GitHub Actions.

## 👩‍💻 Autora

Jéssica Paiva

GitHub: https://github.com/jessbrenalp