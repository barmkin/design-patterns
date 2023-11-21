# Adapter Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/AdapterPattern.java)

The Adapter Pattern is a structural design pattern used in software engineering to enable the interface of one class to be compatible with another interface that the client expects. It allows classes with incompatible interfaces to work together by providing a wrapper, known as an adapter, that acts as an intermediary and translates requests from one interface into a format that another class can understand.

The main purpose of the Adapter Pattern is to make existing classes work with others without modifying their source code. It's especially useful when you have classes that you want to reuse or integrate into a system, but their interfaces are incompatible.

## Key components of the Adapter Pattern

    Target: The Target is the interface that the client code expects to work with. This is the interface the client code understands.

    Adaptee: The Adaptee is the class that has an incompatible interface, which needs to be adapted to work with the client code.

    Adapter: The Adapter is the class that acts as a bridge between the Target and the Adaptee. It implements the Target interface, and inside its methods, it translates the client's requests into a format that the Adaptee can understand and forwards those requests to the Adaptee.

## When to use the Adapter Pattern

The Adapter Pattern is beneficial when:

    You want to integrate existing classes with new code or libraries, but their interfaces don't match.

    You have a legacy system with classes that need to be used in a new system with a different interface.

    You want to reuse a class with a well-defined interface in a context where the client code expects a different interface.

    You want to create a consistent and unified interface to work with multiple classes or services that have varying interfaces.

## Example scenario

Imagine you have an application that reads data from different types of databases, such as MySQL and PostgreSQL. Each database provides its own set of methods and interfaces. To make your application compatible with both types of databases, you can create database-specific adapter classes, such as MySQLAdapter and PostgreSQLAdapter, that implement a common database interface or "Target." These adapters internally translate calls from the common interface into calls to the methods of the specific database, making it possible to switch between databases without modifying the rest of the application code.

By using the Adapter Pattern, you can maintain a consistent interface for database operations in your application, even when working with databases that have different native interfaces. This promotes code reusability and eases the integration of external components with varying interfaces.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `generic`

A simple exercise based on UML version of this pattern.

## Legacy Printer Integration

- [Folder Path](./src/main/java/it/gb/legacyPrinterIntegration)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `legacyPrinterIntegration`

The goal of this exercise is to implement the Adapter Pattern to integrate a legacy system (the OldPrinter) with a modern system (the ModernPrinter). Focus on designing the Printer interface, the ModernPrinter, the OldPrinter, and the PrinterAdapter.
