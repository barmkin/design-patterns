# Interpreter Pattern

- ["Launcher" or "Main" class](./src/main/java/it/gb/InterpreterPattern.java)

The Interpreter Pattern is a behavioral design pattern used in software engineering to define a language or grammar for interpreting and executing specific expressions or sentences in that language. It allows you to implement a language interpreter, which processes sentences and performs operations based on their structure and meaning.

The Interpreter Pattern is typically used to solve problems related to parsing, interpreting, or evaluating domain-specific languages or complex grammatical expressions. It involves defining a set of classes that represent the elements of the grammar and their relationships.

## Key components of the Interpreter Pattern

    Abstract Expression: This is an abstract class or interface that defines the interpretation operation. It usually declares an interpret() method, which serves as the common interface for all the concrete expressions.

    Terminal Expression: A Terminal Expression is a subclass of the Abstract Expression, representing the basic elements of the grammar. These elements do not have any sub-expressions. Terminal expressions implement the interpret() method to perform specific actions based on their meaning in the language.

    Non-terminal Expression: A Non-terminal Expression is a subclass of the Abstract Expression, representing complex elements of the grammar composed of one or more sub-expressions. Non-terminal expressions implement the interpret() method to interpret and perform operations based on their sub-expressions.

    Context: The Context contains information or state relevant to the interpretation process. It may include the input to be interpreted, as well as any additional data needed during the interpretation.

    Client: The Client is responsible for creating the abstract syntax tree (AST) or expression tree, which represents the sentences or expressions to be interpreted. It then invokes the interpretation operation through the Abstract Expression.

## When to use the Interpreter Pattern

The Interpreter Pattern is most suitable when you encounter scenarios where you need to process and interpret complex, structured expressions or sentences in a domain-specific language. It is valuable when the expressions have a hierarchical structure that can be represented as a syntax tree, and you want to avoid using complex, nested conditional logic to interpret the expressions.

## Example scenario

Consider a simple domain-specific language for mathematical expressions that involve addition, subtraction, multiplication, and division. You can use the Interpreter Pattern to create classes for each type of expression (e.g., AddExpression, SubtractExpression, MultiplyExpression, DivideExpression) that can interpret the syntax tree and evaluate the mathematical result based on the input context.

By using the Interpreter Pattern, you can achieve a clear separation between the grammar and the interpretation logic. It also allows you to extend the language with new expressions easily, as each expression type is encapsulated within its respective class, promoting maintainability and flexibility.

## Generic Example

- [Folder Path](./src/main/java/it/gb/generic)

Generic Interpreter pattern with "OR" logic based on simple text strings. It contains a context, a non-terminal expression and a terminal expression.

## Basic Math Functions

- [Folder Path](./src/main/java/it/gb/basicMathFunctions)

Evaluate a string expression and return, if the statement is correct, the result of the basic mathematical functions (sum, subtraction, multiplication and division).
