# Structural Design Patterns

Structural design patterns are a collection of software design strategies that focus on how objects and classes are structured and composed to form larger structures, ensuring adaptability and efficient interaction among components. These patterns aid in creating clear relationships between different parts of a software system while maintaining flexibility and reusability.

---

## [Adapter Pattern](./adapterPattern/)

The Adapter Pattern is a structural design pattern used in software engineering to allow objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces, making them compatible without changing their source code. This is especially useful when you need to use a class that doesn't quite fit with your existing code but can't be modified to match. The adapter wraps the non-conforming class and provides a standard interface that your code can interact with. It essentially translates calls from one interface to the other, enabling the different components to collaborate seamlessly.

The Adapter Pattern consists of two key components: the adapter itself and the target interface that the client code expects. By implementing the adapter, you ensure that the client code can interact with the non-compatible class as if it were a compatible one. This pattern promotes code reusability, as it allows you to integrate existing classes into new systems without requiring extensive modifications. It's a valuable tool for maintaining and extending legacy code, integrating third-party libraries, and fostering better collaboration between different parts of a system with disparate interfaces.

---

## [Bridge Pattern](./bridgePattern/)

The Bridge Pattern is a structural design pattern used in software engineering to separate an abstraction from its implementation, allowing them to vary independently. It addresses the problem of class proliferation by splitting a large class hierarchy into two separate hierarchies: one for the abstraction and another for the implementation. The abstraction contains high-level functionality, while the implementation contains low-level details. These two hierarchies are connected by a "bridge," which acts as a link between them. By doing this, you can make changes to the abstraction or the implementation without affecting the other, promoting flexibility and reducing the complexity of the codebase.

The Bridge Pattern is particularly valuable when you have multiple dimensions of variation in your software system. For example, you may have different types of shapes (abstraction) that can be drawn using various graphics systems (implementation). By employing the Bridge Pattern, you can create a cleaner, more maintainable design that allows you to extend and combine these variations without causing excessive class explosion. It's an essential tool for building flexible, easily maintainable systems and is especially helpful in scenarios where you want to support multiple platforms or create a system with multiple, interchangeable parts.

---
