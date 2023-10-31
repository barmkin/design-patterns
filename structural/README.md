# Structural Design Patterns

Structural design patterns are a collection of software design strategies that focus on how objects and classes are structured and composed to form larger structures, ensuring adaptability and efficient interaction among components. These patterns aid in creating clear relationships between different parts of a software system while maintaining flexibility and reusability.

---

## [Adapter Pattern](./adapterPattern)

The Adapter Pattern is a structural design pattern used in software engineering to allow objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces, making them compatible without changing their source code. This is especially useful when you need to use a class that doesn't quite fit with your existing code but can't be modified to match. The adapter wraps the non-conforming class and provides a standard interface that your code can interact with. It essentially translates calls from one interface to the other, enabling the different components to collaborate seamlessly.

The Adapter Pattern consists of two key components: the adapter itself and the target interface that the client code expects. By implementing the adapter, you ensure that the client code can interact with the non-compatible class as if it were a compatible one. This pattern promotes code reusability, as it allows you to integrate existing classes into new systems without requiring extensive modifications. It's a valuable tool for maintaining and extending legacy code, integrating third-party libraries, and fostering better collaboration between different parts of a system with disparate interfaces.

---

## [Bridge Pattern](./bridgePattern)

The Bridge Pattern is a structural design pattern used in software engineering to separate an abstraction from its implementation, allowing them to vary independently. It addresses the problem of class proliferation by splitting a large class hierarchy into two separate hierarchies: one for the abstraction and another for the implementation. The abstraction contains high-level functionality, while the implementation contains low-level details. These two hierarchies are connected by a "bridge," which acts as a link between them. By doing this, you can make changes to the abstraction or the implementation without affecting the other, promoting flexibility and reducing the complexity of the codebase.

The Bridge Pattern is particularly valuable when you have multiple dimensions of variation in your software system. For example, you may have different types of shapes (abstraction) that can be drawn using various graphics systems (implementation). By employing the Bridge Pattern, you can create a cleaner, more maintainable design that allows you to extend and combine these variations without causing excessive class explosion. It's an essential tool for building flexible, easily maintainable systems and is especially helpful in scenarios where you want to support multiple platforms or create a system with multiple, interchangeable parts.

---

## [Composite Pattern](./compositePattern/)

The Composite Pattern is a structural design pattern used in software development to compose objects into tree-like structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly. In other words, whether you're working with a single object or a complex hierarchy of objects, the client code can interact with them using a consistent interface. The pattern consists of two key components: "leaf" components, which represent the individual objects, and "composite" components, which can contain other components, including other composites. This hierarchical structure is beneficial for building complex systems with nested structures, such as graphical user interfaces, organization charts, and file systems.

The Composite Pattern simplifies client code by abstracting the complexities of navigating through the hierarchy, making it easier to work with both individual objects and their compositions. It also promotes the open-closed principle, as you can add new types of components (leaf or composite) to the hierarchy without modifying existing code. This pattern enhances code reusability and maintainability, making it a valuable choice when dealing with tree-like structures or when you want to apply operations uniformly across elements of a hierarchy.

---

## [Decorator Pattern](./decoratorPattern/)

The Decorator Pattern is a structural design pattern used in software development to dynamically add behavior or responsibilities to objects without altering their class structure. It is a type of wrapper pattern that allows you to attach new features or functionality to objects at runtime, making it a flexible and scalable approach to extending the behavior of objects. This pattern is particularly useful when you have a base object that needs to be extended with various optional features or when you want to avoid creating a multitude of subclasses for each combination of features.

In the Decorator Pattern, you have a core component, often referred to as the "component" or "concrete component," which defines the basic behavior. Then, you have one or more "decorator" classes that wrap the core component and add new functionality to it. These decorator classes conform to the same interface as the core component, ensuring that clients can work with both the base and decorated objects in a transparent manner. This design promotes the open-closed principle, as you can easily add or remove decorators without modifying the existing code. The Decorator Pattern is commonly used in scenarios like adding borders, scrolling, or other dynamic features to graphical elements in user interfaces, and it encourages the principle of single responsibility by separating concerns in a modular way.

---

## [Facade Pattern](./facadePattern/)

The Facade Pattern is a structural design pattern used in software development to provide a simplified, unified interface to a set of interfaces in a subsystem. It acts as a high-level interface that makes it easier for clients to interact with a complex system or set of classes by providing a single entry point. The Facade Pattern is particularly valuable when dealing with systems that have numerous components with intricate relationships and interactions. It encapsulates the complexities of the underlying system, shielding the client code from its intricacies, and promoting loose coupling between the client and the subsystem.

In the Facade Pattern, a facade class is responsible for coordinating interactions with the various components of the subsystem. It hides the complexities of the system, simplifying the client's task and reducing dependencies on the subsystem's components. This pattern enhances code maintainability, as changes to the subsystem's components can be isolated from the client code. It's commonly used in various software systems, such as libraries, frameworks, or APIs, to provide a user-friendly interface for common tasks while still allowing advanced users to access the underlying components when necessary.

---

## [Flyweight Pattern](./flyweightPattern/)

The Flyweight Pattern is a structural design pattern used in software development to minimize memory usage and improve performance by sharing as much as possible among similar objects. It is particularly valuable when you need to manage a large number of objects with shared characteristics, and you want to reduce the memory footprint and overhead associated with creating and maintaining individual instances for each object. The key idea behind the Flyweight Pattern is to split the intrinsic (shared) and extrinsic (context-specific) state of objects. Intrinsic state is shared among multiple objects, while extrinsic state can vary from object to object. By storing the intrinsic state separately and sharing it among objects, you can significantly reduce memory consumption.

In the Flyweight Pattern, a factory creates and manages flyweight objects, ensuring that only one instance of each unique intrinsic state exists. When a client requests an object, the factory either returns an existing flyweight with the requested intrinsic state or creates a new one if it doesn't already exist. The extrinsic state, specific to each object, is managed by the client code, allowing it to customize the shared flyweight objects as needed. This pattern is commonly used in scenarios where you have a large number of similar objects that can share some common attributes, such as rendering characters in a word processing application or managing resources in a computer game to optimize memory usage and performance.

---

## [Proxy Pattern](./proxyPattern/)

The Proxy Pattern is a structural design pattern used in software development to provide a surrogate or placeholder for another object. It allows you to control access to the real object and add additional behavior or services when needed. The primary motivation behind the Proxy Pattern is to create a level of indirection that enables you to add functionality like lazy initialization, access control, logging, or monitoring to objects without altering their core implementation. This pattern is particularly useful in scenarios where you want to manage access to expensive or remote resources, control object creation, or maintain a separation of concerns between the client and the actual object.

In the Proxy Pattern, you have two main components: the real subject and the proxy. The real subject is the actual object with the core functionality that the client code wants to use, while the proxy is an intermediary that intercepts client requests and delegates them to the real subject. Depending on the type of proxy, it can perform various tasks like creating the real subject on-demand, caching results, performing access checks, or logging actions. The Proxy Pattern promotes flexibility, as you can switch between different types of proxies without changing the client code, allowing for easy implementation of features like lazy loading of objects, access control, and monitoring. It's commonly employed in various contexts, including virtual proxies, remote proxies, and protection proxies.
