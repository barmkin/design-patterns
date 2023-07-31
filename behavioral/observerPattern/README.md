# Observer Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/ObserverPattern.java)

The Observer Pattern is a behavioral design pattern used in software engineering to establish a one-to-many dependency between objects. In this pattern, when one object (the subject or observable) undergoes a change in state, all its dependent objects (observers) are automatically notified and updated.

The Observer Pattern promotes loose coupling between the subject and its observers, as observers are not directly aware of the subject's existence and vice versa. Instead, they rely on a common interface or contract that allows them to receive updates from the subject.

## Key components of the Observer Pattern

    Subject (Observable): This is the object that maintains a list of its dependents (observers) and provides methods to subscribe or unsubscribe observers. It also includes a method to notify all registered observers when its state changes.

    Observer: This is the interface or abstract class that defines the contract for objects that need to be notified of changes in the subject's state. It typically includes a method like update().

    Concrete Subject (Concrete Observable): The Concrete Subject is the actual implementation of the Subject interface. It holds the state and manages the list of registered observers. When its state changes, it notifies all registered observers by calling their update() method.

    Concrete Observer: Concrete Observer classes implement the Observer interface. They register themselves with the subject to receive updates and define the actions to be taken when notified of a state change.

## When to use the Observer Pattern

The Observer Pattern is useful in scenarios where you have one-to-many relationships between objects, and you want to ensure that changes in the state of one object are automatically propagated to its dependent objects. It is particularly beneficial when you need to maintain consistency between related objects without tightly coupling them together.

## Example scenario

Consider a weather monitoring system where multiple displays need to show real-time weather updates. The weather station acts as the subject (observable), and the displays act as observers. When the weather changes, the weather station notifies all registered displays, allowing them to update their content accordingly.

By using the Observer Pattern, you achieve a flexible and extensible design, as new displays can be easily added without modifying the weather station code. Similarly, the weather station can be modified or replaced with a different implementation without affecting the existing displays.

Overall, the Observer Pattern promotes the principle of "separate what varies" by decoupling the subject and observers, leading to more maintainable and scalable software systems.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

A generic Concrete Observer listening on changes of the Concrete Subject.

## Weather Station

- [Folder Path](./src/main/java/it/gb/weatherStation/)

A simple weather station with temperature and humidity and 2 type of observers.
