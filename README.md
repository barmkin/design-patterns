# Design Patterns
Tests, examples and playgrounds for studying Design Patterns

---
---

## Behavioral
Behavioral design patterns are concerned with the delegation of responsibilities and encapsulation of behaviors within objects, promoting loose coupling and reusability. They address common problems related to communication, coordination, and interaction between objects while ensuring that the system remains easy to understand, extend, and modify.

---
---

### Chain of Responsibility
The chain of responsibility pattern creates a chain of objects, where each object in the chain has a chance to handle a request. If one object cannot handle the request, it passes it to the next object in the chain until the request is handled or reaches the end of the chain.

- "Client" or "Main" class: `behavioral/chainOfResponsibilityPattern/src/main/java/it/gb/ChainOfResponsibility.java`

In this project:

#### Generic Example
- Path: `behavioral/chainOfResponsibilityPattern/src/main/java/it/gb/generic`

Based on standard UML version of the pattern, it contains a simple task handled by handlers.

#### ATM Dispenser Machine
- Path: `behavioral/chainOfResponsibilityPattern/src/main/java/it/gb/atmDispenserMachine`

Given an amount, it models an ATM bills dispenser using the chain of responsibility pattern. Every dispenser also has a maximum number of bills. 

---

### Command Pattern
The command pattern encapsulates a request as an object, thereby allowing users to parameterize clients with different requests, queue or log requests, and support undoable operations.

"Client" or "Main" class: `behavioral/commandPattern/src/main/java/it/gb/CommandPattern.java`

#### Generic Example
- Path: `behavioral/commandPattern/src/main/java/it/gb/generic`

Based on standard UML version of the pattern, it contains a simple command, concrete command, invoker and a receiver.

#### Simple Document Writer
- Path: `behavioral/commandPattern/src/main/java/it/gb/simpleDocumentWriter`

Using the command pattern, it creates a simple document writer with undoing capability (with max history length).

---

### Interpreter Pattern
The Interpreter Pattern is a behavioral design pattern that defines a way to evaluate sentences or expressions in a language by interpreting them. It provides a framework for interpreting and executing a domain-specific language or grammar.

- "Client" or "Main" class: `behavioral/interpreterPattern/src/main/java/it/gb/InterpreterPattern.java`

#### Generic Example
- Path: `behavioral/commandPattern/src/main/java/it/gb/generic`

Generic Interpreter pattern with "OR" logic based on simple text strings. It contains a context, a non-terminal expression and a terminal expression.

#### Basic Math Functions
- Path: `behavioral/interpreterPattern/src/main/java/it/gb/basicMathFunctions`

Evaluate a string expression and return, if the statement is correct, the result of the basic mathematical functions (sum, subtraction, multiplication and division).

---

### Iterator Pattern
The iterator pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. It separates the traversal of the elements from the underlying collection, providing a uniform interface for iteration.

- "Client" or "Main" class: `behavioral/iteratorPattern/src/main/java/it/gb/IteratorPattern.java`

#### Generic Example
- Path: `behavioral/iteratorPattern/src/main/java/it/gb/generic`

A simple list iterator based on standard UML version of this pattern. This example does not use the java.util library.

#### Music Library
- Path: `behavioral/iteratorPattern/src/main/java/it/gb/musicLibrary`

Iterates over a music playlist. Songs are ordered by artist

---
