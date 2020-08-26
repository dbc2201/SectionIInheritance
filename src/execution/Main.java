/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 3:44 PM
 *  File Name : Main.java
 * */
package execution;

import definitions.transport.FourWheeler;
import definitions.transport.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.travel();
        FourWheeler myFourWheeler = new FourWheeler();
        myFourWheeler.travel();
    }
}
