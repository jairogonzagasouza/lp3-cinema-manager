
# cinema-manager

Sistema de Gestão de Cinema — implementação do Trabalho Prático LP3 (2025.2)

## Descrição do Projeto
Aplicação desktop em Java que gerencia Filmes, Salas, Sessões, Clientes e Ingressos.
Implementa arquitetura MVC, JPA (EclipseLink), e padrões de projeto (Singleton, Object Factory, DAO genérico, Adapter).
Objetivo: demonstrar persistência JPA, separação de camadas, DTOs e testes básicos.

## Arquitetura e Tecnologias Utilizadas
- MVC (Model, View, Controller)
- JPA com EclipseLink (provider)
- MySQL (banco de dados) — banco: **cinema_db**
- Maven (gerenciamento de dependências)
- NetBeans (IDE recomendada)
- Git & GitHub para versionamento

## Padrões de Projeto Aplicados
- **Singleton**: `JPAUtil` gerencia a instância única de `EntityManagerFactory`.
- **Object Factory**: `JPAUtil.createEntityManager()` atua como fábrica de `EntityManager`.
- **DAO Genérico**: `GenericDAO` e `AbstractDAO` padronizam CRUD.
- **DTOs**: Objetos de transferência para comunicação entre Controller e View.
- **Mappers (Adapter)**: Convertes entre entidades e DTOs (ex.: `FilmeMapper`).

## Modelagem e Relacionamentos JPA
Entidades implementadas: `Filme`, `Sala`, `Sessao`, `Cliente`, `Ingresso`, `Assento`, `CartaoFidelidade`.
Relacionamentos importantes:
- `Filme` 1:N `Sessao` (@OneToMany / @ManyToOne)
- `Sessao` 1:N `Ingresso` (@OneToMany / @ManyToOne)
- `Cliente` 1:1 `CartaoFidelidade` (@OneToOne)

## Organização do Repositório
Estrutura padrão Maven:
```
cinema-manager/
  ├─ src/main/java/br/edu/ifms/cinema/...
  ├─ src/main/resources/META-INF/persistence.xml
  ├─ pom.xml
  └─ README.md
```
Faça commits regulares com mensagens claras:
- feat: add entidade Filme
- feat: add DAO generico
- chore: configurar persistence.xml

## Interface Gráfica
A aplicação está preparada para integrar Swing. A camada Controller é o intermediário entre View e Model.
Classe principal `MainApp` contém testes básicos de persistência.

## Aprendizados e Desafios
- Aprendi a mapear relacionamentos JPA e a implementar DAO genérico.
- Desafio: configurar corretamente o `persistence.xml` e o provider EclipseLink. Solução: usar `create-or-extend-tables` para facilitar testes locais.

---
