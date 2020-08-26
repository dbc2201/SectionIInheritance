/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 3:51 PM
 *  File Name : FourWheeler.java
 * */
package definitions.transport;

public class FourWheeler extends Vehicle {

    // This method is also overloaded.
    public void travel(String source, String destination) {
        System.out.println("Vehicle is travelling from " + source +
                " to " + destination + ".");
    }
}

// FourWheeler IS A type of Vehicle.
// Vehicle <-- FourWheeler.
// Vehicle.java class is the superclass of FourWheeler.java class.
// FourWheeler.java class is the subclass of Vehicle.java class.
// Vehicle.java class is the parent class.
// FourWheeler.java class is the the child class.
// FourWheeler.java class is acquiring all the properties & methods of the Vehicle.java class.
