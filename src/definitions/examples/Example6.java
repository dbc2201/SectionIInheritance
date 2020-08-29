/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 4:15 PM
 *  File Name : Example6.java
 * */
package definitions.examples;

public class Example6 {
    public static void main(String[] args) {

    }
}

class Airplane {
    private final int airplaneID;
    private final int numberOfSeats;

    public Airplane(int airplaneID, int numberOfSeats) {
        this.airplaneID = airplaneID;
        this.numberOfSeats = numberOfSeats;
    }

    public void displayInformation() {
        System.out.println("airplaneID = " + airplaneID);
        System.out.println("numberOfSeats = " + numberOfSeats);
    }
}

class Jet extends Airplane {
    public Jet(int airlineID, int numberOfSeats) {
        super(airlineID, numberOfSeats);
    }
}