# Flyweight Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/FlyweightPattern.java)

The Flyweight Pattern is a structural design pattern used in software engineering to minimize memory usage or computational expenses by sharing as much as possible with similar objects. It is particularly useful when you have a large number of objects that have some shared intrinsic state (state that doesn't change between objects) and some unique extrinsic state (state that varies between objects).

The main purpose of the Flyweight Pattern is to reduce memory usage and improve performance by reusing shared components. It's based on the principle that objects with shared intrinsic state can be shared, while extrinsic state can be passed as a parameter, thus saving memory and improving efficiency.

## Key components of the Flyweight Pattern

    Flyweight: The Flyweight is an interface or abstract class that defines the methods for accessing and manipulating intrinsic and extrinsic states. It's the shared component that multiple objects can use.

    Concrete Flyweight: Concrete Flyweight classes implement the Flyweight interface and represent the shared components. These classes store intrinsic state that can be shared among multiple objects.

    Flyweight Factory: The Flyweight Factory is responsible for managing and creating Flyweight objects. It ensures that Flyweights are shared and reused effectively.

    Client: The Client represents the objects that use Flyweight objects. Clients maintain the extrinsic state of the objects, while the intrinsic state is managed by Flyweights.

## When to use the Flyweight Pattern

The Flyweight Pattern is beneficial when:

    You have a large number of objects with shared intrinsic state, and you want to reduce memory usage by reusing that state.

    Your application's performance is a concern, and you want to reduce computational overhead by sharing common components.

    You want to separate the intrinsic and extrinsic state of objects to simplify their management and save memory.

    You need to work with a system where many objects are similar, but not identical, and you want to share commonalities to improve efficiency.

## Example scenario

Imagine a word processing application that deals with a large number of text characters. Instead of representing each character as a separate object, the application can use the Flyweight Pattern. In this pattern, a single character object, like 'A' or 'B', can be reused for all occurrences of that character within the text. The character's appearance and intrinsic properties (e.g., font) are shared among multiple text characters (the extrinsic properties, like position, may vary). By doing this, the application reduces memory usage and enhances performance when working with large documents.

The Flyweight Pattern is a valuable tool for optimizing applications with a large number of similar objects, making it more memory-efficient and, in many cases, faster.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `generic`

A simple exercise based on UML version of this pattern.

## Text Formatting Engine

- [Folder Path](./src/main/java/it/gb/textFormattingEngine/)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `textFormattingEngine`

The primary goal of this exercise is to implement the Flyweight Pattern to efficiently manage and display a large number of characters in a text editor.
