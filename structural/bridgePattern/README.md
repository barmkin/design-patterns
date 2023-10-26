# Bridge Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/BridgePattern.java)

The Bridge Pattern is a structural design pattern used in software engineering to separate an object's abstraction from its implementation. It does this by creating a bridge, or an interface, that provides a way for the abstraction and the implementation to work independently of each other. This pattern is especially useful when you have a system that requires multiple variations of an object, or when you want to avoid a permanent binding between an abstraction and its implementation.

The main purpose of the Bridge Pattern is to enable changes in both the abstraction and the implementation to occur independently without affecting each other. This promotes flexibility and makes it easier to manage complex systems.

## Key components of the Bridge Pattern

    Abstraction: The Abstraction defines the high-level interface that clients interact with. It typically contains higher-level operations that delegate the implementation details to an Implementor.

    Refined Abstraction: The Refined Abstraction is an extension of the Abstraction that adds further details or functionality to the high-level interface.

    Implementor: The Implementor is an interface that defines the low-level operations that must be implemented by concrete classes. It is not exposed directly to clients.

    Concrete Implementor: Concrete Implementor classes implement the low-level operations defined by the Implementor interface. Each Concrete Implementor provides a specific implementation of the low-level functionality.

## When to use the Bridge Pattern

The Bridge Pattern is beneficial when:

    You want to avoid a permanent binding between an abstraction and its implementation, allowing for greater flexibility.

    You have a complex system with multiple variations of an object, and you want to avoid the exponential growth of classes that would be required to handle all possible combinations.

    You need to extend the hierarchy of both abstractions and implementations independently.

    You want to share an implementation among multiple objects without resorting to subclassing.

## Example scenario

Consider a drawing application that needs to draw shapes on different platforms, such as Windows and macOS. The Bridge Pattern can be used to create a bridge between the shapes (abstraction) and the drawing platforms (implementation). The Abstraction represents the shapes (e.g., circles, rectangles), while the Implementor defines the methods to draw these shapes on specific platforms. Concrete Implementor classes, such as WindowsDrawer and MacDrawer, provide platform-specific implementations. The Abstraction uses these Implementors to draw shapes on different platforms without having to modify the shape classes.

By using the Bridge Pattern, you can extend and maintain the drawing application more easily as new shapes or platforms are introduced. The pattern allows you to keep the abstraction and implementation separate, providing flexibility and scalability in your design.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

A simple exercise based on UML version of this pattern.

## Remote Controls

- [Folder Path](./src/main/java/it/gb/remoteControls)

The primary goal of this exercise is to implement the Bridge Pattern to separate the abstraction of remote control from the implementation of devices, allowing flexibility in combining different types of remote controls with different electronic devices.
