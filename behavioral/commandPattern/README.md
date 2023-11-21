# Command Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/CommandPattern.java)

The Command Pattern is a behavioral design pattern used in software engineering to encapsulate a request as an object, thereby allowing parameterization of clients with different requests, queuing of requests, logging of the requests, and the ability to undo/redo operations. It helps decouple the sender (client) of a request from the receiver (invoker) of that request, promoting flexibility and extensibility in the system's architecture.

The main idea behind the Command Pattern is to represent a command as an object, which encapsulates all the necessary information required to perform a specific action. This includes the method to be called, the receiver object (which carries out the action), and any required parameters. The client (invoker) simply knows how to execute the command without needing to understand the details of its implementation or the receiver's internals.

## Key components of the Command Pattern

    Command: This is the interface or abstract class that declares the contract for executing a command. It typically includes a method like execute().

    Concrete Command: Concrete Command classes implement the Command interface. Each Concrete Command is associated with a specific operation and binds together a receiver object and the action to be performed on that receiver.

    Receiver: The Receiver is the object that knows how to perform the action when the execute() method of the command is called.

    Invoker: The Invoker is the client that holds the Command object and calls its execute() method when it needs to trigger the command.

    Client: The Client creates the Command objects, associates them with the appropriate receivers, and sets them in the Invoker.

## When to use the Command Pattern

The Command Pattern is particularly useful in scenarios where you need to decouple the sender of a request from the receiver, or when you want to implement features like undo/redo functionality, logging, or transaction management. It also facilitates the implementation of menu systems, multi-level undo, and macro recording and playback features.

## Example scenario

Consider an image editor application with various editing operations like rotate, resize, and apply filters. To enable undo/redo functionality, you can use the Command Pattern. Create Concrete Command classes like RotateCommand, ResizeCommand, and FilterCommand, each implementing the Command interface and encapsulating the specific editing operation. The Invoker will keep a history of executed commands, allowing the user to undo or redo operations sequentially.

By using the Command Pattern, you achieve a separation of concerns and maintain a clean and extensible codebase. The client code (Invoker) is unaware of the specifics of the editing operations or how they are carried out by the receivers. It only knows how to execute commands and manage their history, making it easy to add new editing operations in the future without affecting the client code.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `generic`

Based on standard UML version of the pattern, it contains a simple command, concrete command, invoker and a receiver.

## Simple Document Writer

- [Folder Path](./src/main/java/it/gb/simpleDocumentWriter)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `simpleDocumentWriter`

Using the command pattern, it creates a simple document writer with undoing capability (with max history length).
