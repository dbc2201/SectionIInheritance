/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 31/08/20
 *  Time: 10:09 AM
 *  File Name : StaticBinding.java
 * */
package definitions.bindings;

public class StaticBinding {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.display();
        Car myCar = new Car();
        myCar.displayColor(); // method call
        // Associating the method call with the method body, at compile time.
        // Also know as, Static Binding.
    }
}
class Vehicle {
    public void display() {
        System.out.println("Vehicle Class.");
    }
}

class Car extends Vehicle {
    public void displayColor() { // method body
        System.out.println("The Car is black.");
    }
}

