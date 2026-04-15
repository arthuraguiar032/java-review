# Java Review

Repositório de exercícios de revisão de Java e Orientação a Objetos, desenvolvidos durante a greve da faculdade como preparação para a playlist **Spring Boot Essentials 2** do [DevDojo](https://www.youtube.com/@DevDojoBrasil).

---

## Objetivo

Revisitar os fundamentos de Java que o Spring Boot usa intensamente — encapsulamento, herança, interfaces, generics, Streams e exceções — antes de entrar no framework.

---

## Estrutura

Este é um projeto **Maven multi-módulo**. Cada exercício é um módulo independente que herda configurações do `pom.xml` pai.

```
java-review/
├── pom.xml                      ← pai do projeto
├── J01-classes-objetos/
│   ├── pom.xml
│   └── src/main/java/
├── J02-heranca-polimorfismo/
│   ├── pom.xml
│   └── src/main/java/
├── J03-interfaces-di-manual/
│   ├── pom.xml
│   └── src/main/java/
├── J04-streams-lambdas/
│   ├── pom.xml
│   └── src/main/java/
├── J05-excecoes-customizadas/
│   ├── pom.xml
│   └── src/main/java/
└── J06-optional/
    ├── pom.xml
    └── src/main/java/
```

---

## Como rodar um exercício

### Pré-requisitos

- Java 17+
- Maven 3.8+

### Rodando um módulo específico

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/java-review.git
cd java-review

# Compilar todos os módulos
mvn compile

# Rodar o main de um módulo específico
cd J01-classes-objetos
mvn exec:java -Dexec.mainClass="com.seuusuario.j01.Main"
```

### Pelo IntelliJ IDEA

1. Abrir a pasta raiz `java-review/` como projeto.
2. O IntelliJ detecta automaticamente os módulos Maven.
3. Rodar o `main` de cada módulo diretamente pela IDE.

---

## Exercícios

| Módulo | Conceitos |
|--------|-----------|
| J01 — Classes e objetos | Instância, atributos, construtores, `toString`, `equals`, `hashCode` |
| J02 — Herança e polimorfismo | `extends`, classes abstratas, sobrescrita, `Comparable` |
| J03 — Interfaces e DI manual | `interface`, múltiplas implementações, inversão de dependência |
| J04 — Streams e Lambdas | `filter`, `map`, `collect`, `groupingBy`, `Comparator` |
| J05 — Exceções customizadas | Checked vs unchecked, `try-catch-finally`, exceções de domínio |
| J06 — Optional | `orElseThrow`, `map`, `filter`, `ifPresent` |

---

## Como criar um novo módulo

1. Criar a pasta com o nome do exercício.
2. Criar o `pom.xml` do módulo herdando do pai:

```xml
<project>
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>com.seuusuario</groupId>
    <artifactId>java-review</artifactId>
    <version>1.0-SNAPSHOT</version>
  </parent>
  <artifactId>J07-nome-do-exercicio</artifactId>
</project>
```

3. Declarar o módulo no `pom.xml` pai:

```xml
<modules>
  <module>J01-classes-objetos</module>
  <!-- ... -->
  <module>J07-nome-do-exercicio</module>
</modules>
```

4. Criar a estrutura de pastas:

```bash
mkdir -p J07-nome-do-exercicio/src/main/java/com/seuusuario/j07
```

---

## Convenção de commits

```
feat: J01 implementa classe Anime com equals e hashCode
feat: J03 adiciona AnimeRepositoryEmMemoria com HashMap
fix:  J04 corrige ordenação reversa no stream
docs: J05 documenta diferença entre checked e unchecked
```

---

## Contexto

Esses exercícios são a Parte 1 de um plano de estudos de Spring Boot. A Parte 2 está no repositório [springboot-essentials](https://github.com/aguiarthur032/springboot-essentials).