# Prototype Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/PrototypePattern.java)

The Prototype Pattern is a creational design pattern used in software engineering to create new objects by copying an existing object, known as the "prototype." Instead of creating objects from scratch, you clone an existing object (the prototype) and then customize it as needed. This pattern is particularly useful when the cost of creating a new object is more expensive or complex than copying an existing one.

## Key components of the Prototype Pattern

    Prototype: The Prototype is the interface or abstract class that defines the methods for cloning itself. This interface typically includes a method like clone().

    Concrete Prototype: Concrete Prototype classes implement the Prototype interface and provide specific implementations for cloning themselves. These classes represent the objects that can be cloned.

    Client: The Client is responsible for creating new objects by cloning existing prototypes. It requests the prototype to create a new instance and then customizes it, if necessary.

## When to use the Prototype Pattern

The Prototype Pattern is beneficial when:

    You need to create objects that are similar to existing objects but with slight variations in their properties.

    Creating new objects is more efficient by copying an existing one instead of starting from scratch.

    You want to avoid tightly coupling the client code to the specific classes of objects it needs to create.

    You want to reduce the complexity of creating complex objects with many dependencies.

## Example scenario

Consider a graphic design application that allows users to create various shapes like circles, squares, and triangles. Instead of creating new shape objects from scratch every time the user adds a shape to the canvas, the application can use the Prototype Pattern. Each shape class (e.g., Circle, Square) implements the Prototype interface and provides a clone() method. When a user wants to add a shape, the application clones the appropriate prototype and customizes it with the desired size, color, and position. This way, the application avoids the overhead of creating shapes from scratch and can easily introduce new shapes in the future by implementing new concrete prototypes.

The Prototype Pattern helps improve code reusability and performance by reusing existing objects as prototypes, resulting in a more efficient object creation process.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `generic`

A simple exercise based on UML version of this pattern.

## Cloning Shapes

- [Folder Path](./src/main/java/it/gb/cloningShapes)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `cloningShapes`

The primary goal of this exercise is to implement the Prototype Pattern to clone existing shapes efficiently. Focus on designing the Shape classes, ShapeManager, and the process of cloning shapes.
