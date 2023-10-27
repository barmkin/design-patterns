# Composite Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/CompositePattern.java)

The Composite Pattern is a structural design pattern used in software engineering to compose objects into tree structures to represent part-whole hierarchies. This pattern allows clients to treat individual objects and compositions of objects (composites) uniformly. Essentially, it enables you to create complex structures from simpler building blocks, while ensuring that both individual objects and their compositions are handled in a consistent manner.

## Key components of the Composite Pattern

    Component: The Component is an interface or an abstract class that defines the common interface for both leaf objects (individual objects) and composite objects (containers or structures). This interface typically includes methods for operations that can be performed on both types of objects.

    Leaf: The Leaf is a class that implements the Component interface. It represents the individual objects or the simplest building blocks in the hierarchy. Leafs have no child components.

    Composite: The Composite is a class that also implements the Component interface. It represents the composite objects, which can contain child components. Composites manage a collection of child components, and they delegate the operations to their child components as needed.

## When to use the Composite Pattern

The Composite Pattern is useful when:

    You need to create structures that represent part-whole hierarchies, where individual objects and their compositions can be treated uniformly.

    You want to allow clients to work with complex structures of objects without distinguishing between leaf objects and composites.

    You need to support the construction of recursive structures, such as a directory tree where a directory can contain subdirectories and files.

    You want to add and remove objects dynamically from the structure.

    You want to create a tree-like representation for objects and perform operations that affect the entire hierarchy.

## Example scenario

Consider a drawing application where you have simple graphical shapes (e.g., circles, squares) and more complex groups that can contain both simple shapes and other groups. By using the Composite Pattern, you can create a Component interface that defines methods for drawing and manipulating graphical objects. The Leaf objects represent individual shapes, and the Composite objects represent groups of shapes. Clients can work with both individual shapes and groups of shapes in the same way, allowing them to create complex drawings made up of simple and composite objects.

The Composite Pattern simplifies the handling of complex structures and encourages code reuse by treating individual objects and compositions in a uniform manner. This makes it especially valuable in scenarios where you need to represent hierarchical structures of objects.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

A simple exercise based on UML version of this pattern.

## TODO

- [Folder Path](./src/main/java/it/gb/TODO)

TODO.
