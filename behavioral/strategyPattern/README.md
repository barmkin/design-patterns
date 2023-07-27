# Strategy Pattern
- ["Launcher" or "Main" class](./src/main/java/it/gb/StrategyPattern.java)

The Strategy Pattern is a behavioral design pattern used in software engineering to define a family of algorithms or behaviors, encapsulate each one, and make them interchangeable. It allows clients to use different strategies without altering their structure, promoting flexibility and runtime behavior modification.

The main purpose of the Strategy Pattern is to separate the algorithm or behavior implementation from the context in which it is used. This enables the client to choose and switch between different strategies at runtime, depending on the specific requirements or conditions.

## Key components of the Strategy Pattern:

    Context: The Context represents the object that uses a specific strategy. It holds a reference to a Strategy object and can switch between different strategies by setting or changing the Strategy object.

    Strategy: The Strategy is the interface or abstract class that defines the contract for all concrete strategy classes. It typically includes a method that represents the algorithm or behavior to be executed.

    Concrete Strategy: Concrete Strategy classes implement the Strategy interface. Each Concrete Strategy encapsulates a specific algorithm or behavior and provides its implementation for the method defined in the Strategy interface.

## When to use the Strategy Pattern:

The Strategy Pattern is beneficial when you need to provide a flexible way to choose and use different algorithms or behaviors at runtime without altering the client code. It is useful in scenarios where the same operation can be performed in multiple ways or when you want to decouple the implementation of an algorithm from the objects that use it.

## Example scenario:

Consider a sorting algorithm library. The library's client code may require different sorting strategies, such as QuickSort, MergeSort, or BubbleSort, depending on the size of the data or the type of data being sorted. By using the Strategy Pattern, the client code can be decoupled from the specific sorting algorithms and switch between different sorting strategies dynamically.

By encapsulating the sorting algorithms into separate Concrete Strategy classes and letting the client use a Context to switch between them, the Strategy Pattern ensures that the client code remains clean and focused on the main task, while the sorting algorithm implementation details are isolated in the Concrete Strategy classes.

Overall, the Strategy Pattern promotes code reusability, maintainability, and extensibility by allowing clients to choose and change algorithms at runtime, making it a powerful tool for managing different behaviors in a software system.


## Generic Example
- [Folder Path](./src/main/java/it/gb/generic)

A simple exercise based on UML version of this pattern.

## TODO
- [Folder Path](./src/main/java/it/gb/TODO/)

TODO