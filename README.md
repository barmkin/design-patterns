# Design Patterns

## How to run
Tests, examples and playgrounds for studying Design Patterns. See each project for details. Each project can be built using the following command on the root of the project:

```sh
mvn clean package
```

and executed via

```sh
java -jar target/[PROJECT_NAME]-[PROJECT_VERSION].jar 
```

or simply run/debug via VSCode, see [launch.json](./.vscode/launch.json)

## Design Patterns

Design Patterns are reusable, proven solutions to common problems that arise during software design and development. They are well-established templates or blueprints that provide guidelines and best practices for structuring and organizing code to address recurring challenges in software engineering.

Design Patterns are not complete implementations or ready-to-use code snippets; rather, they are high-level concepts that can be applied to various situations. They help developers create software that is more robust, flexible, and maintainable by promoting key principles such as encapsulation, loose coupling, and separation of concerns.

Design Patterns are categorized into three main types:

- Creational Patterns: These patterns deal with the process of object creation, providing mechanisms to create objects in a manner suitable for the situation. Examples include Singleton, Factory Method, Abstract Factory, Builder, and Prototype patterns.

- Structural Patterns: Structural patterns focus on class and object composition to form larger structures or relationships between classes. Examples include Adapter, Decorator, Facade, Bridge, and Composite patterns.

- Behavioral Patterns: Behavioral patterns are concerned with the interaction and communication between objects. They help manage algorithms, relationships, and responsibilities among objects. Examples include Observer, Strategy, Template Method, Chain of Responsibility, and Command patterns.

Design Patterns are not language-specific but are applicable to various programming languages. They serve as a common vocabulary for software developers, enabling them to communicate and understand design decisions and solutions more effectively.

When using Design Patterns, it is essential to consider the context and requirements of the specific software project. Overusing patterns can lead to unnecessary complexity, while neglecting to apply patterns in appropriate situations can result in code that is harder to maintain and understand. The key is to apply the patterns judiciously and adapt them to the unique needs of the software being developed.

---

## [Behavioral](./behavioral)
Behavioral design patterns are concerned with the delegation of responsibilities and encapsulation of behaviors within objects, promoting loose coupling and reusability. They address common problems related to communication, coordination, and interaction between objects while ensuring that the system remains easy to understand, extend, and modify.


### [Chain of Responsibility](./behavioral/chainOfResponsibilityPattern/)

### [Command Pattern](./behavioral/commandPattern/)

### [Interpreter Pattern](./behavioral/interpreterPattern/)

### [Iterator Pattern](./behavioral/iteratorPattern/)

### [Mediator Pattern](./behavioral/mediatorPattern/)

### [Memento Pattern](./behavioral/mementoPattern/)

### [Observer Pattern](./behavioral/observerPattern/)

### [State Pattern](./behavioral/statePattern/)

---

## Java version used:
openjdk version "17.0.7" 2023-04-18