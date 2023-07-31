# Chain of Responsibility

- ["Launcher" or "Main" class](./src/main/java/it/gb/ChainOfResponsibility.java)

The Chain of Responsibility Pattern is a behavioral design pattern used in software engineering to create a chain of processing objects, where each object in the chain has the ability to handle a specific request or task. When a request is made, it is passed along the chain until one of the objects in the chain processes the request successfully.

The primary idea behind the Chain of Responsibility Pattern is to achieve loose coupling between the sender (client) of a request and the receiver (handler) of that request. Instead of the client directly contacting a specific handler, it forwards the request to the first handler in the chain. Each handler then decides whether it can process the request or should pass it to the next handler in the chain.

## Key components of the Chain of Responsibility Pattern

    Handler: This is the interface or abstract class that defines the contract for handling requests. It typically includes a method like handleRequest().

    ConcreteHandler: ConcreteHandler classes implement the Handler interface. Each ConcreteHandler represents a specific handler in the chain and holds a reference to the next handler in the chain.

    Client: The Client initiates the request and passes it to the first handler in the chain.

## When to use the Chain of Responsibility Pattern

The Chain of Responsibility Pattern is useful when you want to allow multiple objects to handle a request, but the specific handler is determined dynamically at runtime. It is beneficial when you need to decouple the sender of a request from the receiver and when the handling logic can vary or change over time.

## Example scenario

Consider an expense approval system in a company. When an employee submits an expense report, it needs to be approved by multiple levels of management, such as the team lead, department head, and finance manager. Each level has different approval limits. You can use the Chain of Responsibility Pattern to create a chain of approval handlers, where each handler checks if it can approve the expense. If it can, it approves the expense; otherwise, it forwards the request to the next handler in the chain.

By using the Chain of Responsibility Pattern, you achieve flexibility and extensibility in the approval process. New approval levels can be added or removed without affecting the client code (employee submitting the expense report), promoting a more maintainable and scalable solution.

It's important to note that the chain should be designed carefully to ensure that a request is eventually handled in the chain. Otherwise, it may lead to requests not being processed at all.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

Based on standard UML version of the pattern, it contains a simple task handled by handlers.

## ATM Dispenser Machine

- [Folder Path](./src/main/java/it/gb/atmDispenserMachine)

Given an amount, it models an ATM bills dispenser using the chain of responsibility pattern. Every dispenser also has a maximum number of bills.
