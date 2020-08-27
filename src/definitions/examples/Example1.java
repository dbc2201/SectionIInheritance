/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 3:30 PM
 *  File Name : Example1.java
 * */
package definitions.examples;

// If a class is public, the name of the class and the name of the file
// should be exactly the same!
public class Example1 {
    public static void main(String[] args) {
        DemoA objectA = new DemoA();
        objectA.display();
    }
}
// we cannot create more than one public class in a single file
class DemoA {
    // We will only call this class a 'parent class' when we have a 'child class'.
    public void display() {
        System.out.println("Parent Class Method.");
    }
}
class DemoB extends DemoA { // we have written the extends keyword
    // so, right now, it is child class
    @Override
    public void display() { // method overriding? YES!
        System.out.println("Child Class Method.");
    }
}
