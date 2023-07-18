# Memento Pattern
- ["Launcher" or "Main" class](./src/main/java/it/gb/MementoPattern.java)

The Memento Pattern is a behavioral design pattern used in software engineering to capture and externalize the internal state of an object without violating its encapsulation. This allows the object to be restored to a previous state later on, effectively providing the ability to undo/redo actions or revert to specific snapshots in time.

The primary purpose of the Memento Pattern is to separate the state-saving mechanism from the object itself, ensuring that the object remains unaware of how its state is being stored or retrieved. It promotes the principle of encapsulation, as the object's internal details are not exposed to external components responsible for managing the state history.

## Key components of the Memento Pattern:

    Originator: This is the object whose state needs to be saved and restored. It creates a memento object containing a snapshot of its current internal state.

    Memento: This is the object that represents the saved state of the Originator. It typically contains a copy of the Originator's state. The Memento object is responsible for providing access to its state only to the Originator.

    Caretaker: The Caretaker is responsible for keeping track of the Memento objects and managing their lifecycle. It can store multiple mementos in a stack or list, enabling undo/redo functionality or the ability to navigate to different points in time.

## When to use the Memento Pattern:

The Memento Pattern is useful in situations where you need to implement undo/redo functionality, maintain a history of changes, or enable time-travel-like capabilities in a system. It is also valuable when you want to decouple the state management logic from the object itself, keeping the object's interface focused on its primary responsibilities.

## Example scenario:

Suppose you are building a text editor application. As users type and modify the text, they may want to undo or redo their actions. In this case, you can use the Memento Pattern to create a Memento object that stores the state of the text editor at specific points in time. The Caretaker would manage these mementos and provide the necessary methods for undoing or redoing user actions, while the Originator would be the text editor itself.

By employing the Memento Pattern, you can offer users the ability to revert to previous versions of their text, undo individual changes, or redo previously undone actions, providing a more flexible and user-friendly application.


## Generic Example
- [Folder Path](./src/main/java/it/gb/generic)

A simple list iterator based on standard UML version of this pattern. This example does not use the java.util library.

## Simple File Manager
- [Folder Path](./src/main/java/it/gb/musicLibrary)

Store and revert state of a class modelled by a POJO called "File" using file manager as the Caretaker. This example has a maximum history size on the Caretaker.