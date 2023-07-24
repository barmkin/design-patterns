# Behavioral Design Patterns

Behavioral design patterns are concerned with the delegation of responsibilities and encapsulation of behaviors within objects, promoting loose coupling and reusability. They address common problems related to communication, coordination, and interaction between objects while ensuring that the system remains easy to understand, extend, and modify.

---

### [Chain of Responsibility](./chainOfResponsibilityPattern/)

The Chain of Responsibility Pattern is a behavioral design pattern used in software engineering to create a chain of processing objects, where each object in the chain has the ability to handle a specific request or task. When a request is made, it is passed along the chain until one of the objects in the chain processes the request successfully.

The primary idea behind the Chain of Responsibility Pattern is to achieve loose coupling between the sender (client) of a request and the receiver (handler) of that request. Instead of the client directly contacting a specific handler, it forwards the request to the first handler in the chain. Each handler then decides whether it can process the request or should pass it to the next handler in the chain.

---

### [Command Pattern](./commandPattern/)
The Command Pattern is a behavioral design pattern used in software engineering to encapsulate a request as an object, thereby allowing parameterization of clients with different requests, queuing of requests, logging of the requests, and the ability to undo/redo operations. It helps decouple the sender (client) of a request from the receiver (invoker) of that request, promoting flexibility and extensibility in the system's architecture.

The main idea behind the Command Pattern is to represent a command as an object, which encapsulates all the necessary information required to perform a specific action. This includes the method to be called, the receiver object (which carries out the action), and any required parameters. The client (invoker) simply knows how to execute the command without needing to understand the details of its implementation or the receiver's internals.

---

### [Interpreter Pattern](./interpreterPattern/)
The Interpreter Pattern is a behavioral design pattern used in software engineering to define a language or grammar for interpreting and executing specific expressions or sentences in that language. It allows you to implement a language interpreter, which processes sentences and performs operations based on their structure and meaning.

The Interpreter Pattern is typically used to solve problems related to parsing, interpreting, or evaluating domain-specific languages or complex grammatical expressions. It involves defining a set of classes that represent the elements of the grammar and their relationships.

---

### [Iterator Pattern](./iteratorPattern/)
The Iterator Pattern is a behavioral design pattern used in software engineering to provide a standardized way to access elements of a collection (such as an array, list, or tree) without exposing the underlying representation of the collection. It allows sequential access to elements in the collection without needing to know its internal structure, making it easier to iterate over the elements and perform operations on them.

The Iterator Pattern promotes the principle of encapsulation by abstracting the iteration logic from the collection itself. This way, the collection can change its internal structure or representation without affecting the code that relies on iterating over its elements.

---

### [Mediator Pattern](./mediatorPattern/)
The Mediator Pattern is a behavioral design pattern used in software engineering to promote loose coupling between objects by providing a central mediator object that facilitates communication and coordination among various components within a system. It enables objects to interact with each other indirectly through the mediator, rather than directly referencing each other, reducing direct dependencies and simplifying the overall system architecture.

In essence, the Mediator Pattern promotes the "many-to-many" communication paradigm, where multiple objects can communicate with multiple other objects without needing to know their specific identities. Instead, they only need to be aware of the mediator, which acts as an intermediary for exchanging messages or coordinating actions between the participating objects.

---

### [Memento Pattern](./mementoPattern/)
The Memento Pattern is a behavioral design pattern used in software engineering to capture and externalize the internal state of an object without violating its encapsulation. This allows the object to be restored to a previous state later on, effectively providing the ability to undo/redo actions or revert to specific snapshots in time.

The primary purpose of the Memento Pattern is to separate the state-saving mechanism from the object itself, ensuring that the object remains unaware of how its state is being stored or retrieved. It promotes the principle of encapsulation, as the object's internal details are not exposed to external components responsible for managing the state history.

---

### [Observer Pattern](./observerPattern/)
The Observer Pattern is a behavioral design pattern used in software engineering to establish a one-to-many dependency between objects. In this pattern, when one object (the subject or observable) undergoes a change in state, all its dependent objects (observers) are automatically notified and updated.

The Observer Pattern promotes loose coupling between the subject and its observers, as observers are not directly aware of the subject's existence and vice versa. Instead, they rely on a common interface or contract that allows them to receive updates from the subject.

---

