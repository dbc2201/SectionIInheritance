/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 4:04 PM
 *  File Name : Example2.java
 * */
package definitions.examples;

public class Example2 {
    public static void main(String[] args) {

    }
}
class A {
    int j = 0;
    public void methodA(int k) {
        j = k;
    }
}
class B extends A {
    @Override
    public void methodA(int k) { // method overriding
        j = k * k;
    }

    public void methodB() {
        System.out.println("Class B method.");
    }
}
