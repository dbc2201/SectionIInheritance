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
        myBike.display();
        RacingBike myRacingBike = new RacingBike();
        myRacingBike.display();
        DeliveryBike myDeliveryBike = new DeliveryBike();
        myDeliveryBike.display();
        Bike newBike = new DeliveryBike();
        newBike.display();
        newBike.bike();
    }
}

class Bike {
    public void display() {
        System.out.println("Bike class.");
    }

    public void bike() {
        System.out.println("bike...");
    }
}

class RacingBike extends Bike {
    @Override
    public void display() {
        System.out.println("RacingBike class.");
    }

    public void race() {
        System.out.println("race...");
    }
}

class DeliveryBike extends Bike {
    @Override
    public void display() {
        System.out.println("DeliveryBike class.");
    }

    public void deliver() {
        System.out.println("deliver...");
    }
}
