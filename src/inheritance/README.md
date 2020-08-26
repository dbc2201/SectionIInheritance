# Inheritance in Object-Oriented Programming

## Motives
1. What is "Inheritance"?
2. How can we use "Inheritance" to re-use code/program(s)/software that are already developed and tested.
3. Observe the use of the `extends` keyword.
4. What is a `super` class and what is `sub` class.
5. How we can access the members of a `superclass` from a `subclass`.
6. Constructor Hierarchy.
7. Method Overriding, Dynamic Method Dispatch, Abstract Classes & Interfaces.
8. How we can model our programs to use all the concepts written above.

### Inheritance

- Simple English: 
-   Inheritance (noun): something that is (already) or may be (in the future) "inherited".
-   Inheritance (verb): the act of "inheriting" some things.

- Real-Life Examples:
1. Hair Color, color of the skin, color of the eyes, height, ... etc. (physical attributes)
- These are "inherited" by YOU from YOUR PARENTS.
2. Some money, a house, a car, some possessions, ... etc. (items of monetary value)
- These might be "inherited" by YOU from YOUR PARENTS, if they choose so.

- Definition: One ENTITY can acquire the properties/attributes/behaviour/traits/possessions
of another ENTITY related to it via Inheritance.

- Object-Oriented:

- IN object-oriented, entities are Classes!
- Definition: In object-oriented programming, a class can acquire the
properties(fields/variables) and methods of another class related to it.

### Re-using Code (Re-Usability of a code)

- The types of software that exist in the world:
1. Open Source Software: we can observe and/or modify the source code.
Ex - Linux, OpenJDK.
2. Closed Source Software: we cannot observe and/or modify the source code.
Ex - Google Chrome, Microsoft Windows, Microsoft Office.

- There are two ways of "using" a software: 
1. as an end-user (client/customer):
we can only download and install the software,
we cannot observe the actual source code of the software,
we cannot modify the actual source code of the software.
2. as a developer:
we can download the actual source code,
we can observe the source code, 
we can modify the source code as well.

- re-use : modifying the software that is already developed and tested.

### Types of Inheritance
1. Simple (Single) Inheritance.
2. Hierarchical Inheritance.
3. Multiple Inheritance. (NOT ALLOWED IN JAVA!)
4. Multi-level Inheritance.
5. Hybrid Inheritance.

### Polymorphism
1. Method Overloading: 
- The signature of the method should be same except,
- we can either change the number of parameters for the method, or
- we can change the type of parameters of the method.
- Changing the behaviour of a method based on the inputs to the method.

2. Method Overriding:
- The signature of the method should be exactly same, no exceptions!
- Changing the behaviour of a method based on the object that is calling the method.
- Uses the `@Override` annotation.
