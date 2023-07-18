# Mediator Pattern
- ["Launcher" or "Main" class](./src/main/java/it/gb/MediatorPattern.java)

The Mediator Pattern is a behavioral design pattern used in software engineering to promote loose coupling between objects by providing a central mediator object that facilitates communication and coordination among various components within a system. It enables objects to interact with each other indirectly through the mediator, rather than directly referencing each other, reducing direct dependencies and simplifying the overall system architecture.

In essence, the Mediator Pattern promotes the "many-to-many" communication paradigm, where multiple objects can communicate with multiple other objects without needing to know their specific identities. Instead, they only need to be aware of the mediator, which acts as an intermediary for exchanging messages or coordinating actions between the participating objects.

## Key components of the Mediator Pattern:

    Mediator: This is an interface or an abstract class that defines the communication contract between the mediator and the participating objects. It declares methods through which objects can send and receive messages.

    Concrete Mediator: This is the actual implementation of the mediator interface. It manages the communication and coordination between the participating objects, enforcing the rules of interaction.

    Colleague: This refers to the participating objects that interact with each other through the mediator. They implement the Colleague interface or inherit from a common Colleague class.

## When to use the Mediator Pattern:

The Mediator Pattern is beneficial in scenarios where a system contains a large number of interconnected objects, and direct communication between them could lead to tight coupling and complexity. By introducing a mediator, the interactions are more organized and controlled, making it easier to maintain and extend the system over time.

## Example scenarios:

Some common examples of where the Mediator Pattern is applicable include:

- GUI applications, where different GUI components need to interact with each other without direct references.
- Multi-player games, where players and game elements need to communicate and cooperate.
- Air traffic control systems, where various aircraft and control towers need to communicate for safe and efficient operations.

By using the Mediator Pattern, developers can achieve a more flexible, maintainable, and scalable architecture, as it isolates the communication logic and reduces the interdependencies between objects.


## Generic Example
- [Folder Path](./src/main/java/it/gb/generic)

A simple list iterator based on standard UML version of this pattern. This example does not use the java.util library.

## Simple Chat
- [Folder Path](./src/main/java/it/gb/simpleChat)

An example of simple chat system with login/logout and message sharing. The chat system is the Mediator, Colleagues are represented by chat users.
