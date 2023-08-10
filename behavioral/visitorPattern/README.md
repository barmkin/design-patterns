# Visitor Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/VisitorPattern.java)

The Visitor Pattern is a behavioral design pattern used in software engineering to separate the structure of an object hierarchy from the algorithms or operations performed on that hierarchy. It allows you to add new operations to an existing class hierarchy without modifying the classes themselves. The Visitor Pattern is particularly useful when you have a complex hierarchy of objects and multiple distinct operations that need to be performed on these objects.

The main idea behind the Visitor Pattern is to define a set of visitor classes, each of which encapsulates a specific operation to be performed on the elements of the object hierarchy. The elements in the hierarchy accept a visitor and delegate the operation to the visitor, allowing different operations to be applied without altering the classes.

## Key components of the Visitor Pattern

    Visitor: The Visitor interface declares methods for each element class in the object hierarchy. Each method corresponds to an operation that can be performed on the elements. These methods take the element objects as arguments and execute the specific operation.

    ConcreteVisitor: ConcreteVisitor classes implement the Visitor interface. Each ConcreteVisitor provides the actual implementation of the operations declared in the Visitor interface.

    Element: The Element interface declares a method accept() that takes a visitor as an argument. Each concrete element class implements the accept() method, which calls the appropriate visitor method corresponding to the element's type.

    ConcreteElement: ConcreteElement classes implement the Element interface. Each ConcreteElement class provides a specific implementation of the accept() method, delegating the operation to the visitor.

    Object Structure: The Object Structure represents the collection of elements on which the visitor operations will be performed. It may be a list, array, or any other data structure that holds the elements.

## When to use the Visitor Pattern

The Visitor Pattern is useful when you have a complex object hierarchy with a variety of operations to be performed on the elements of that hierarchy. It is also beneficial when you want to avoid modifying the existing element classes to add new operations, or when you want to separate the logic for different operations to maintain code organization and readability.

## Example scenario

Consider a document processing system with various types of elements, such as paragraphs, headings, and images. You may want to perform different operations, such as spell checking, word counting, and formatting, on these elements. By using the Visitor Pattern, you can define separate visitor classes for each operation, ensuring that new operations can be added without modifying the existing element classes.

Using the Visitor Pattern allows you to follow the Open-Closed Principle, where the existing classes are closed for modification but open for extension. You can add new visitor classes to perform new operations without altering the element classes, thus promoting a modular and maintainable design.

Overall, the Visitor Pattern provides a way to encapsulate operations on complex object hierarchies while maintaining separation between the elements and the operations performed on them.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

A simple exercise based on UML version of this pattern.

## TODO

- [Folder Path](./src/main/java/it/gb/TODO/)

TODO
