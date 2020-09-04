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
5. Hybrid Inheritance. (We need Abstract Classes and/or Interfaces)

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

## Binding
Associating a method call to a method body. It has two types:

### Static Binding
When the binding is performed at compile time, by the compiler, it is called `Static Binding` or
`Early Binding`.

### Dynamic Binding
The compiler is not able to resolve the method call (binding) at compile time. 
It is also called `late binding`.
Ex - Method Overriding.

The basic difference between static binding and dynamic binding is, 
the static binding occurs at compile time, whereas
the dynamic binding occurs at run time. 


## Dynamic Method Dispatch
- It is a mechanism by which we can achieve runtime polymorphism for overridden methods
in Java. 
- It is implemented with the help of a reference variable of a parent class.
- The reference variable of the parent class can refer to the reference value of an object
of the child class.
- Ex = ParentClassName parentClassReferenceVariable = new ChildClassName();
- Bike newBike = new RacingBike();
- There can be many subclasses (child classes) inherited from a single parent class.
- Each child class will have its own version of the method of the overridden method.
- The compiler then uses Dynamic Method Dispatch to select the correct version of 
the overridden method from the parent and the child classes. 

We know that in Java, we have 4 types of program units:
1. Classes (a definition class, and an execution class).
2. Abstract Classes.
3. Interfaces.
4. Enums.

## Abstract Classes:
- Are similar to classes, the only difference is that an abstract class
can have abstract methods.
- An abstract method is a method whose body is not properly defined.
- There are situations in which it is desired that a parent class will not
define the method body, but should contain the signatures so that a child class
can override the methods.
- There can be many child classes but only a single parent class.
- Each child class will implement (override) its own version of the overridden
methods of the parent class.
- Any class in Java that has an abstract method has to be declared as an asbtract
class.
- Any abstract class in Java should have at least 1 abstract method.
- It is necessary for every child class of an abstract class to implement
(override) all the abstract methods of the parent class.

## Interfaces:
### Similarities between Classes and Interfaces:
1. The structure of a class, and an interface are mostly similar, with the only 
exception that a class is defined with the class keyword, and an interface is 
defined with an interface keyword.
2. Just like classes, interfaces can also have visibility modifiers, they can 
be public or <default>.
3. We can create a reference variable of an interface just like we can create a 
reference variable of a class.

