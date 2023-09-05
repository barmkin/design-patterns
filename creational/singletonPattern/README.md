# Singleton Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/SingletonPattern.java)

The Singleton Pattern is a creational design pattern used in software engineering to ensure that a class has only one instance and provides a global point of access to that instance. It restricts the instantiation of a class to a single object, ensuring that there is no way to create multiple instances of the same class within the application.

The Singleton Pattern is often used when you want to maintain a single instance of a class that controls access to a shared resource, configuration settings, or a unique system-wide object. It is commonly used to provide centralized control over resources that are expensive to create or need to be shared across various parts of the application.

## Key components of the Singleton Pattern

    Singleton Class: The Singleton Class is the class that implements the Singleton Pattern. It typically includes a private constructor to prevent external instantiation, a private static instance variable to store the single instance, and a public static method to provide global access to the instance.

## When to use the Singleton Pattern

The Singleton Pattern is suitable in scenarios where you need to ensure that a class has only one instance throughout the application's lifecycle. This is commonly used for managing resources such as database connections, thread pools, caching mechanisms, configuration managers, and more.

## Example scenario

Consider a Logger class that is responsible for logging messages across different parts of an application. Using the Singleton Pattern, you can ensure that there's only one instance of the Logger class, which maintains the log file and handles all logging requests from various components of the application.

By utilizing the Singleton Pattern, you guarantee that the logging operations are controlled and consistent, as all components access the same Logger instance. This pattern also helps avoid conflicts that might arise from multiple instances trying to manage the same log file.

However, it's important to use the Singleton Pattern judiciously, as it introduces global state and can lead to tight coupling between different parts of the application. Overusing singletons can make code harder to test and maintain.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

A simple exercise based on UML version of this pattern.

## Configuration Manager

- [Folder Path](./src/main/java/it/gb/configurationManager/)

A simple configuration manager used for storing String, Integer and Boolean values.
