# SOLID Principles with Java
## A comprehensive guide and code repository demonstrating the five core principles of object-oriented design. These principles help in creating more maintainable, understandable, and flexible software.

---------------------------------------------------

### Table of Contents

[Single Responsibility Principle (SRP)](https://github.com/naderelfeel10/SOLID-Principles-with-Java-/tree/main/src/SRP) 

[Open/Closed Principle (OCP)](https://github.com/naderelfeel10/SOLID-Principles-with-Java-/tree/main/src/OCP) 

[Liskov Substitution Principle (LSP)](https://github.com/naderelfeel10/SOLID-Principles-with-Java-/tree/main/src/LSP) 

[Interface Segregation Principle (ISP)](https://github.com/naderelfeel10/SOLID-Principles-with-Java-/tree/main/src/ISP) 

[Dependency Inversion Principle (DIP)](https://github.com/naderelfeel10/SOLID-Principles-with-Java-/tree/main/src/DIP) 

----------------------------------------

## 1. Single Responsibility Principle (SRP)
"A class should have one, and only one, reason to change."

 ### Description
Every module or class should have responsibility over a single part of the functionality provided by the software. This minimizes the "side effects" when making changes later.

### Example:
Separating a Printing Function from the Book class to a separate class used for printing .

### Folder: /src/SRP


## 2. Open/Closed Principle (OCP)
"Software entities should be open for extension, but closed for modification."

 ### Description
You should be able to extend a class's behavior without modifying its existing source code. This is usually achieved using Interfaces or Abstract classes.

### Example:
Adding a new report generator without modifying in ReprotGenerator class

### Folder: /src/OCP

## 3. Liskov Substitution Principle (LSP)
"Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program."

 ### Description
If class B is a subclass of class A, we should be able to pass B to any method that expects A without the method crashing or behaving unexpectedly.

### Example:
ensuring a Square doesn't break the logic of a Rectangle.

### Folder: /src/LSP

## 4. Interface Segregation Principle (ISP)
"Many client-specific interfaces are better than one general-purpose interface."

 ### Description
Clients should not be forced to depend upon interfaces that they do not use. This principle deals with the disadvantages of "fat" or "polluted" interfaces.

### Example:
Splitting a ParkingLot into free and paid Parking interfaces, so free parking vechiles may extend just the free parking one with out throwing error in the not used methods

### Folder: /src/ISP

## 5. Dependency Inversion Principle (DIP)
"Depend upon abstractions, [not] concretions."

 ### Description
High-level modules should not depend on low-level modules. Both should depend on abstractions.

Abstractions should not depend on details. Details should depend on abstractions.

### Example:
An OrderService depending on a MessageService interface rather than a concrete EmailSender class.

### Folder: /src/DIP
