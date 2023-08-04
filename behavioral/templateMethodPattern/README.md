# Template Method Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/TemplateMethodPattern.java)

The Template Method Pattern is a behavioral design pattern used in software engineering to define the structure of an algorithm or a sequence of steps, allowing subclasses to provide specific implementations for certain steps. It encapsulates the common algorithm structure in a base class and delegates the implementation of specific steps to subclasses.

The main goal of the Template Method Pattern is to provide a framework for creating algorithms while allowing customization of individual steps. This promotes code reuse and reduces duplication by centralizing common code in the base class and enabling subclasses to focus on the unique aspects of their implementations.

## Key components of the Template Method Pattern

    Abstract Class: The Abstract Class (or template class) defines the basic structure of the algorithm using template methods. These template methods declare the sequence of steps that the algorithm follows, but some of these steps are left abstract (to be implemented by subclasses).

    Concrete Class: Concrete Classes are subclasses that inherit from the Abstract Class. They provide concrete implementations for the abstract methods defined in the base class. These methods customize the algorithm's behavior by providing specific implementations for certain steps.

## When to use the Template Method Pattern

The Template Method Pattern is useful when you have an algorithm with a fixed structure but varying implementations for specific steps. It's also valuable when you want to avoid code duplication and enforce a consistent process across multiple subclasses.

## Example scenario

Consider a game development framework with different game types that share common game loop logic (e.g., initialization, updating game state, rendering). You can use the Template Method Pattern to create a Game class with a template method called runGame(). This method outlines the overall game loop structure and calls abstract methods like initialize(), updateState(), and render() for specific game types.

By using the Template Method Pattern, the Game class defines the general game loop structure while allowing subclasses (representing different game types) to provide their unique implementations for the abstract methods. This approach promotes code reuse and ensures that each game type follows a consistent pattern while focusing on its specific behavior.

In summary, the Template Method Pattern offers a way to create reusable algorithm structures with customizable steps. It helps maintain a consistent process while accommodating variations in behavior through subclass specialization.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

A simple exercise based on UML version of this pattern.

## Sorting Algorithms

- [Folder Path](./src/main/java/it/gb/TODO/)

TODO
