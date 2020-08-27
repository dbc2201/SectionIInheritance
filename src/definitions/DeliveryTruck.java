/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 3:11 PM
 *  File Name : DeliveryTruck.java
 * */
package definitions;

import definitions.transport.Truck;

public class DeliveryTruck extends Truck {

    public void startDeliveryTruck() {
        startTruck();
    }

}

// The difference between the <default> and the `protected` visibility modifiers is:
// If a member or a class is <default>, it can not be accessed outside its own package.
// But if a member or a class is protected, it can be accessed outside its own package,
// if the class is a child class.
