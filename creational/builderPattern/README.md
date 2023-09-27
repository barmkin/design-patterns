# Builder Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/BuilderPattern.java)

The Builder Pattern is a creational design pattern used in software engineering to construct a complex object step by step. It separates the construction of an object from its representation, allowing the same construction process to create different representations.

The primary goal of the Builder Pattern is to simplify the construction of complex objects by providing a clear and flexible way to set their properties and configure them, regardless of the specific variation or configuration required. It's especially useful when an object has a large number of optional properties or configurations.

## Key components of the Builder Pattern

    Builder Interface: This interface defines the methods for constructing the different parts of the complex object. It includes methods for setting properties, configuring options, and building the object.

    Concrete Builder: Concrete Builder classes implement the Builder interface and provide specific implementations for constructing the complex object. Each Concrete Builder corresponds to a particular representation or variation of the object.

    Director: The Director is an optional component that orchestrates the construction process. It uses a Builder object to construct the complex object by calling the builder's methods in a specific sequence.

    Product: The Product is the complex object being constructed. It represents the final result, and its structure may vary depending on the builder used to construct it.

## When to use the Builder Pattern

The Builder Pattern is beneficial when:

    An object has a complex construction process that involves multiple steps.
    The object has many optional properties or configurations, and you want to avoid using a long list of constructor parameters.
    You want to create different representations or variations of the same object, such as building a complex meal with different menu items.
    You want to improve code readability and maintainability by separating the construction process from the client code that uses the object.

## Example scenario

Consider building a complex document in a word processing application. The document may have various sections, headers, footers, fonts, styles, and other properties. Rather than having a single constructor with numerous parameters, you can use the Builder Pattern to create a DocumentBuilder with methods for setting each property. Clients can then use the builder to configure and construct different types of documents, such as reports, letters, or essays, with various styles and components.

By employing the Builder Pattern, you simplify the creation of complex documents, make the code more readable, and allow for the easy extension of the document-building process as new features are added.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

A simple exercise based on UML version of this pattern.

## Pizza Buider

- [Folder Path](./src/main/java/it/gb/pizzaBuilder)

Create a pizza using builder pattern.
