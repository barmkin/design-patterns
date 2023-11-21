# Proxy Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/ProxyPattern.java)

The Proxy Pattern is a structural design pattern used in software engineering to provide a surrogate or placeholder for another object to control access to it. This pattern allows you to add an extra layer of control and functionality to the object being accessed, without changing its interface. The proxy serves as an intermediary, intercepting requests and managing interactions with the real object.

The main purposes of the Proxy Pattern include controlling access to the real object, delaying the creation of expensive objects until they are actually needed, adding security checks, monitoring and logging access, and providing a way to perform additional actions when the object is accessed.

## Key components of the Proxy Pattern

    Subject: The Subject is an interface or abstract class that defines the common interface for both the Real Subject and the Proxy. This ensures that the proxy and real subject share the same interface.

    Real Subject: The Real Subject is the class that represents the actual object that the client code wants to access and interact with. It provides the real functionality.

    Proxy: The Proxy is a class that implements the Subject interface. It maintains a reference to the Real Subject and controls access to it. The proxy can add extra behavior or checks before forwarding requests to the real subject.

## When to use the Proxy Pattern

The Proxy Pattern is useful when:

    You want to control access to an object and impose additional checks or security measures.

    You need to create a lightweight or lazy-loading version of an expensive object. The real object is only created or initialized when it's first accessed.

    You want to log or monitor access to the real object, collecting information about when and how it's used.

    You need to provide a placeholder for a resource that may not be available yet or may be in a remote location (remote proxy).

    You want to add functionality such as reference counting or caching to the real object without changing its interface.

## Example scenario

Consider a multimedia application that needs to display high-resolution images, which can be resource-intensive and slow to load. Using the Proxy Pattern, you can create an ImageProxy class that implements the same interface as the Real Image class. The ImageProxy acts as a placeholder for the actual image, and it only loads the real image when it's requested for display. Until then, it provides a lower-resolution or placeholder image for quick viewing.

By using the ImageProxy, you improve the user experience by deferring the loading of the full-resolution image until it's needed. The proxy also allows you to add additional functionality, such as caching the image for future use or controlling access to the real image resource.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `onlineShoppingSystem`

A simple exercise based on UML version of this pattern.

## TODO

- [Folder Path](./src/main/java/it/gb/TODO)
- [launch.json](../../.vscode/launch.json) param or `java -jar` argument: `TODO`

TODO.
