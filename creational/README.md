# Creational Design Patterns

Creational design patterns are a set of software design principles that provide solutions for object creation mechanisms, making it easier to instantiate and configure objects in a flexible and efficient manner. These patterns help manage the process of creating objects, balancing factors like flexibility, simplicity, and performance in various software scenarios.

---

## [Singleton Pattern](./singletonPattern/)

The Singleton Pattern is a creational design pattern used in software engineering to ensure that a class has only one instance and provides a global point of access to that instance. It restricts the instantiation of a class to a single object, ensuring that there is no way to create multiple instances of the same class within the application.

The Singleton Pattern is often used when you want to maintain a single instance of a class that controls access to a shared resource, configuration settings, or a unique system-wide object. It is commonly used to provide centralized control over resources that are expensive to create or need to be shared across various parts of the application.

---

## [Builder Pattern](./builderPattern/)

The Builder Pattern is a creational design pattern used in software engineering to construct a complex object step by step. It separates the construction of an object from its representation, allowing the same construction process to create different representations.

The primary goal of the Builder Pattern is to simplify the construction of complex objects by providing a clear and flexible way to set their properties and configure them, regardless of the specific variation or configuration required. It's especially useful when an object has a large number of optional properties or configurations.

---
