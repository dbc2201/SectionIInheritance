/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 31/08/20
 *  Time: 10:20 AM
 *  File Name : DynamicBinding.java
 * */
package definitions.bindings;

public class DynamicBinding {
    public static void main(String[] args) {
        Airplane myAirplane = new Jet();
        // We can store the reference of a child class object, inside
        // the reference variable of the parent class.
        myAirplane.display();
        myAirplane.showRemainingFuel();
    }
}

class Airplane {
    public void display() {
        System.out.println("Airplane Class.");
    }
    public void showRemainingFuel() {
        System.out.println("Sufficient Fuel Remaining.");
    }
}

class Jet extends Airplane {
    @Override
    public void display() {
        System.out.println("Jet Class.");
    }
}