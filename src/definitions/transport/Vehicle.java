/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 3:51 PM
 *  File Name : Vehicle.java
 * */
package definitions.transport;

public class Vehicle {

    /**
     * This method will make the Vehicle travel to a pre-defined destination.
     */
    public void travel() {
        System.out.println("Vehicle is travelling to Delhi.");
    }

    // change the number of parameters
    // change the type of parameters
    // This is a type of polymorphism
    // Method Overloading
    // The travel() method is now overloaded.
    // The travel() method is an overloaded method.
    public void travel(String destination) {
        System.out.println("Vehicle is travelling to " + destination + ".");
    }

}
