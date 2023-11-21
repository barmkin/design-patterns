# Abstract Factory Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/AbstractFactoryPattern.java)

The Abstract Factory Pattern is a creational design pattern used in software engineering to provide an interface for creating families of related or dependent objects without specifying their concrete classes. It's a higher-level pattern than the Factory Method Pattern, as it deals with multiple Factory Methods organized into families to create sets of related objects.

The main goal of the Abstract Factory Pattern is to ensure that objects created by a factory are compatible and belong to a cohesive set, whether it's for a particular operating system, user interface theme, or any other group of related objects.

## Key components of the Abstract Factory Pattern

    Abstract Factory: The Abstract Factory is an interface or abstract class that declares a set of abstract methods, each responsible for creating a family of related objects. There's typically a different factory method for each type of object in the family.

    Concrete Factory: Concrete Factory classes implement the Abstract Factory interface or extend the Abstract Factory abstract class. Each Concrete Factory is responsible for creating a family of objects that are compatible with each other.

    Abstract Product: The Abstract Product is an interface or abstract class that declares the interface of the objects created by the Abstract Factory. Each Abstract Product corresponds to a type of object in the family.

    Concrete Product: Concrete Product classes implement the Abstract Product interface or extend the Abstract Product abstract class. Each Concrete Product represents a specific object that is part of the family created by the Concrete Factory.

## When to use the Abstract Factory Pattern

The Abstract Factory Pattern is useful when:

    Your system needs to be able to produce families of related or dependent objects, and you want to ensure that the created objects are compatible with each other.

    You want to avoid exposing the concrete classes of objects to the client code, ensuring that the client code remains independent of the specific implementations.

    You need to provide a consistent interface for creating objects across multiple related classes or subsystems.

    You want to support multiple themes, platforms, or configurations in your application by switching between different sets of objects.

## Example scenario

Consider a user interface framework that needs to create various user interface elements like buttons, text fields, and checkboxes, with each element having different styles and appearances. You can use the Abstract Factory Pattern to create a set of abstract factories: ButtonFactory, TextFieldFactory, and CheckboxFactory. Each factory defines methods to create different types of buttons, text fields, and checkboxes, each with a specific style. Concrete factories like WindowsFactory and MacFactory implement these interfaces to produce UI elements tailored for their respective platforms. This ensures that all UI elements within a family (e.g., buttons) are consistent in style and appearance.

By employing the Abstract Factory Pattern, you achieve the goal of creating families of related objects while keeping client code independent of the concrete classes and allowing easy switching between different sets of objects.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `generic`

A simple exercise based on UML version of this pattern.

## Cross Platform User Interface

- [Folder Path](./src/main/java/it/gb/crossPlatformUI)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `crossPlatformUI`

The primary goal of this exercise is to implement the Abstract Factory Pattern to create UI components compatible with different platforms. Focus on designing the Button and Window classes, the UIComponentFactory interface, and the concrete factory classes.
