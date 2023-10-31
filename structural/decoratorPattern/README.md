# Decorator Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/DecoratorPattern.java)

The Decorator Pattern is a structural design pattern used in software engineering to dynamically add responsibilities and behaviors to objects without altering their code. It provides a flexible alternative to subclassing for extending functionality. The pattern is typically used when you want to augment the behavior of an object in a way that can be applied and removed at runtime, or when you have a class hierarchy that would be excessively multiplied by creating subclasses for all possible combinations of behaviors.

The Decorator Pattern involves creating a set of decorator classes, each of which adds a particular behavior to the original object (the component) while implementing the same interface. These decorators can be stacked to create complex, composite objects with multiple behaviors.

## Key components of the Decorator Pattern

    Component: The Component is an interface or abstract class that defines the interface for the objects that can be decorated. It represents the base object to which additional behaviors can be added.

    Concrete Component: The Concrete Component is a class that implements the Component interface. It represents the base object to which decorators can be added.

    Decorator: The Decorator is an abstract class that also implements the Component interface. It maintains a reference to a Component object and adds additional behaviors by delegating operations to the Component. This is the key to the Decorator Pattern, as it allows decorators to be stacked.

    Concrete Decorator: Concrete Decorator classes extend the Decorator class and add specific behaviors to the component. Each Concrete Decorator class is responsible for a specific enhancement or behavior.

## When to use the Decorator Pattern

The Decorator Pattern is beneficial when:

    You need to add responsibilities or behaviors to objects dynamically at runtime without altering their code.

    You have a class hierarchy that can result in a combinatorial explosion of subclasses if you try to add all possible behaviors through inheritance.

    You want to keep classes open for extension but closed for modification, adhering to the Open-Closed Principle.

    You need to achieve fine-grained, flexible, and reusable extensions or combinations of behaviors.

## Example scenario

Consider a text processing application where you have a TextComponent class representing basic text elements. You want to enhance the functionality of text components by adding behaviors like font styling (bold, italics), color formatting, and alignment. Instead of creating a large number of subclasses to represent all possible combinations, you can use the Decorator Pattern. You create a TextDecorator abstract class that extends the TextComponent class, with specific Concrete Decorator classes for each enhancement (e.g., BoldDecorator, ColorDecorator). These decorators wrap around a TextComponent and add the desired functionality.

By using the Decorator Pattern, you can easily add, remove, or combine enhancements on text components at runtime without changing the structure of the TextComponent class. This promotes flexibility and reusability while maintaining a clean and extensible design.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

A simple exercise based on UML version of this pattern.

## TODO

- [Folder Path](./src/main/java/it/gb/TODO)

TODO.
