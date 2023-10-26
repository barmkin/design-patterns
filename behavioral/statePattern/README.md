# State Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/StatePattern.java)

The State Pattern is a behavioral design pattern used in software engineering to allow an object to change its behavior when its internal state changes. It allows an object to appear as if it has changed its class, effectively altering its behavior based on its current state without modifying its structure.

The State Pattern is particularly useful when an object's behavior depends on multiple states, and transitions between these states are complex or frequent. By encapsulating each state into a separate class and allowing the object to switch between these states, the pattern promotes a more organized and maintainable codebase.

## Key components of the State Pattern

    Context: The Context represents the object whose behavior changes based on its internal state. It maintains a reference to the current state object and delegates behavior-related requests to that state.

    State: The State is the interface or abstract class that defines the contract for all concrete state classes. It typically includes methods representing the various actions or behaviors that the context can exhibit based on its state.

    ConcreteState: ConcreteState classes implement the State interface and represent individual states of the context. Each ConcreteState class encapsulates the behavior and logic associated with a specific state.

## When to use the State Pattern

The State Pattern is suitable when an object's behavior varies based on its internal state, and it needs to transition between multiple states dynamically. It is also beneficial when the conditional statements used to control an object's behavior become complex and difficult to maintain.

## Example scenario

Consider a vending machine that dispenses different products based on its current state, which could be "idle," "has coin," or "sold out." In this case, the vending machine can use the State Pattern to implement separate ConcreteState classes for each state (e.g., IdleState, HasCoinState, SoldOutState). When a customer interacts with the vending machine, it transitions between states depending on the customer's actions (e.g., inserting a coin, selecting a product).

By using the State Pattern, the vending machine effectively changes its behavior without extensive conditional logic, making the code cleaner, more organized, and easier to maintain. It also allows for the addition of new states or changes to existing states without affecting the other parts of the vending machine code.

In summary, the State Pattern facilitates dynamic behavior changes in objects by abstracting states into separate classes, promoting flexibility and maintainability in software systems with varying states and behaviors.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

A simple states transition exercise based on UML version of the pattern.

## Vending Machine

- [Folder Path](./src/main/java/it/gb/vendingMachine)

The goal of the exercise is to implement the Vending Machine using the State Pattern to manage its states effectively. Avoid providing the complete solution directly, but rather focus on designing the state classes and their interactions with the Vending Machine.
