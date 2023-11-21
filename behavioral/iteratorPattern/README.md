# Iterator Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/IteratorPattern.java)

The Iterator Pattern is a behavioral design pattern used in software engineering to provide a standardized way to access elements of a collection (such as an array, list, or tree) without exposing the underlying representation of the collection. It allows sequential access to elements in the collection without needing to know its internal structure, making it easier to iterate over the elements and perform operations on them.

The Iterator Pattern promotes the principle of encapsulation by abstracting the iteration logic from the collection itself. This way, the collection can change its internal structure or representation without affecting the code that relies on iterating over its elements.

## Key components of the Iterator Pattern

    Iterator: This is an interface or an abstract class that defines the contract for accessing elements in the collection. It typically includes methods like hasNext() to check if there are more elements, and next() to retrieve the next element.

    Concrete Iterator: This is the implementation of the Iterator interface, specific to a particular collection. It keeps track of the current position in the collection and provides the necessary methods to access elements.

    Aggregate (or Collection): This is the interface or abstract class that defines the contract for creating an Iterator. It includes a method like createIterator() to instantiate a Concrete Iterator for the collection.

    Concrete Aggregate (or Concrete Collection): This is the implementation of the Aggregate interface, representing a specific type of collection (e.g., array, list). It creates a Concrete Iterator that can iterate over its elements.

## When to use the Iterator Pattern

The Iterator Pattern is useful when you have a collection of elements and want to provide a consistent way to traverse and access its elements without exposing the collection's internal representation. It is beneficial when you need to support different ways of iteration without modifying the collection's structure.

## Example scenario

Suppose you have a database query result containing a large number of records. Instead of exposing the internal data structure of the result, you can use the Iterator Pattern to create an iterator that allows clients to access the records one by one without knowing the details of the underlying storage.

By using the Iterator Pattern, you achieve a separation of concerns, making it easier to maintain and extend both the collection and the iteration logic independently. Additionally, it provides a clean and standardized way for clients to access elements in the collection, promoting code reusability and readability.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `generic`

A simple list iterator based on standard UML version of this pattern. This example does not use the java.util library.

## Music Library

- [Folder Path](./src/main/java/it/gb/musicLibrary)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `musicLibrary`

Iterates over a music playlist. Songs are ordered by iterator using artist name \[A-Z\].
