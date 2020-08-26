/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 26/08/20
 *  Time: 11:41 AM
 *  File Name : Car.java
 * */
package definitions.transport;

public class Car extends FourWheeler {
    // Car --> FourWheeler
    // Car class is the child class of FourWheeler class.
    // FourWheeler --> Vehicle
    // FourWheeler class is the child class of Vehicle class.
    // Vehicle <-- FourWheeler <-- Car
    // Vehicle is the parent of FourWheeler.
    // FourWheeler is the child of Vehicle.
    // But, FourWheeler is also the parent of Car.
    // Car is the child of FourWheeler.
    // Multi-level Inheritance
    // Vehicle (grandparent) <- FourWheeler (parent) <- Car (child)
}

// Vehicle <-- (is inherited by) FourWheeler
// The Vehicle.java class is the parent (super)class of the FourWheeler.java class.
// The FourWheeler.java class is the child (sub)class of the Vehicle.java class.

// Vehicle <-- Car
// The Vehicle.java class is also the parent (super)class of Car.java class.
// The Car.java class is also the child (sub)class of the Vehicle.java class.

// Vehicle <-- FourWheeler & Car