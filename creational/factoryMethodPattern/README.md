# Factory Method Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/FactoryMethodPattern.java)

The Factory Method Pattern is a creational design pattern used in software engineering to provide an interface for creating objects but allowing subclasses to alter the type of objects that will be created. It defines an abstract method for creating objects, which subclasses implement to produce objects that are suitable for their specific contexts.

The Factory Method Pattern is designed to promote loose coupling in your code by abstracting the object creation process from the client code that uses these objects. It allows for flexibility and extensibility, making it easier to add new types of objects or change the way objects are created without affecting the client code.

## Key components of the Factory Method Pattern

    Creator (Factory): The Creator is an abstract class or interface that declares the factory method, which provides an interface for creating objects. The Creator often includes other methods that use the factory method to create objects.

    Concrete Creator (Concrete Factory): Concrete Creator classes implement the factory method declared in the Creator. Each Concrete Creator is responsible for creating a specific type of object.

    Product: The Product is an abstract class or interface that defines the interface of the objects created by the factory method.

    Concrete Product: Concrete Product classes implement the Product interface and represent the actual objects that the factory method creates.

## When to use the Factory Method Pattern

The Factory Method Pattern is suitable in various scenarios, including:

    When you want to delegate the responsibility of object creation to subclasses, allowing them to determine the specific type of objects to instantiate.

    When you want to decouple the client code from the concrete classes it uses, making it easier to change or extend the types of objects created without modifying the client code.

    When you have multiple product variations, and you want to ensure that each variation is created consistently.

    When you need to encapsulate object creation and hide the details of how objects are instantiated.

## Example scenario

Imagine a graphical user interface (GUI) library that needs to create different types of UI elements, such as buttons, checkboxes, and text fields. You can use the Factory Method Pattern to create a UIElementFactory, which is an abstract class or interface defining a factory method, createUIElement(). Concrete subclasses, like ButtonFactory and CheckboxFactory, implement this method to create specific UI elements (e.g., Button and Checkbox). Client code can then use these factories to create UI elements without needing to know the details of the object creation process.

By employing the Factory Method Pattern, you ensure that the creation of UI elements is flexible, extensible, and isolated from the client code, making it easier to add new UI elements or change their implementations as needed.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

A simple exercise based on UML version of this pattern.

## VideoGame Character Factory

- [Folder Path](./src/main/java/it/gb/videoGameCharacterFactory)

The main goal of this exercise is to implement the Factory Method Pattern to create different types of characters in a video game. Focus on designing the Character classes, CharacterFactory interface, and concrete factory classes.
