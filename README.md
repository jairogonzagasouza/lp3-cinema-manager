📽️ Cinema Manager — LP3 (2025.2)

Sistema acadêmico desenvolvido como Trabalho Prático da disciplina Linguagem de Programação III, IFMS — Campus Coxim.

🎯 Objetivo do Projeto

O Cinema Manager é um sistema para gerenciamento básico de um cinema, abrangendo cadastro e gerenciamento de:

🎬 Filmes

🏟️ Salas

🕒 Sessões

👤 Clientes

🎟️ Ingressos

💳 Cartão Fidelidade

O projeto utiliza arquitetura em camadas e aplica os padrões de projeto aprendidos na disciplina.

🏗️ Tecnologias Utilizadas
Linguagem / Frameworks

Java 17

Maven (gerenciamento de dependências)

JPA / Hibernate

MySQL (banco de dados)

Swing (camada de visualização)

DTO + Mappers (camada de aplicação)

DAO + GenericDAO (persistência)

Padrões de projeto:

Singleton

Factory

DAO

MVC

🧱 Arquitetura do Projeto

A estrutura segue uma arquitetura em camadas:

/cinema-manager
 ├── controller/         → Controladores da camada View
 ├── dao/                → DAOs com GenericDAO
 ├── dto/                → Objetos de transferência
 ├── mapper/             → Conversores: Entidade ⇆ DTO
 ├── model/              → Entidades JPA
 ├── util/               → JPAUtil (Singleton + Factory)
 ├── view/               → Telas Swing
 └── resources/
      └── META-INF/persistence.xml

🗄️ Banco de Dados

📌 Nome do Banco: cinema_db

Configuração em persistence.xml:

Driver: MySQL

Dialect: Hibernate MySQL

hibernate.hbm2ddl.auto=update

Usuário e senha configuráveis conforme ambiente

🧩 Padrões de Projeto Implementados
✔ Singleton

Usado em JPAUtil para garantir apenas uma fábrica de EntityManagers.

✔ Factory

Criação padronizada de EntityManager dentro do projeto.

✔ DAO + GenericDAO

Abstração dos métodos CRUD:
save, update, delete, findById, findAll.

✔ Mapper

Conversão entre entidades e DTOs.

✔ MVC / Camada View

Uso de telas Swing organizadas com controladores dedicados.

📦 Funcionalidades Implementadas
🎬 Filmes

Cadastro

Consulta

Atualização

Remoção

🏟️ Salas

Cadastro

Assentos

Capacidade

🕒 Sessões

Associação Filme + Sala + Horário

Listagem

👤 Clientes

Cadastro completo

Ligação com cartão fidelidade

🎟️ Ingressos

Compra e associação cliente/sessão

💳 Cartão Fidelidade

Pontuação automática

🚀 Como Executar o Projeto

Instale o MySQL e crie o banco:

CREATE DATABASE cinema_db;


Configure seu usuário/senha no arquivo:
src/main/resources/META-INF/persistence.xml

Execute o projeto pelo NetBeans ou via Maven:

mvn clean install


Inicie pela classe:

MainApp.java

🔄 Roadmap do Desenvolvimento

 Configuração inicial do Maven

 Criação das entidades

 Implementação do JPAUtil (Singleton + Factory)

 Implementação do GenericDAO

 Implementação de DAOs específicos

 CRUD de Filmes

 CRUD de Salas

 Sessões

 DTOs e Mappers

 Telas Swing base

 Publicação no GitHub (finalizado)

 Melhorias de UX

 Relatórios

 Validações mais avançadas

🤝 Autor

Jairo Gonzaga de Souza
Disciplina: Linguagem de Programação III
Professor: Renato 
Instituição: IFMS — Campus Coxim

📜 Licença

Uso acadêmico — IFMS 2025.
