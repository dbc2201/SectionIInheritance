/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 03/09/20
 *  Time: 3:06 PM
 *  File Name : Example.java
 * */
package definitions.abstractClass;

public class Example {
    public static void main(String[] args) {

    }
}

class Human {
    public void talk() {
        System.out.println("I am Human.");
    }
}

class Student extends Human {
    @Override
    public void talk() {
        System.out.println("I am a Student.");
    }
}

class Teacher {

}