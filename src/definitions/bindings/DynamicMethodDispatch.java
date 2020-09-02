/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 02/09/20
 *  Time: 11:07 AM
 *  File Name : DynamicMethodDispatch.java
 * */
package definitions.bindings;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Bike myBike = new Bike();
    }
}

class Bike {
    public void display() {
        System.out.println("Bike class.");
    }
}

class RacingBike extends Bike {
    @Override
    public void display() {
        System.out.println("RacingBike class.");
    }
}

class DeliveryBike extends Bike {
    @Override
    public void display() {
        System.out.println("DeliveryBike class.");
    }
}
