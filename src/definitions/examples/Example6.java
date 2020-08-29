/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 4:15 PM
 *  File Name : Example6.java
 * */
package definitions.examples;

public class Example6 {
    public static void main(String[] args) {
        Airplane airbusA380 = new Airplane(1, 300);
        airbusA380.displayInformation();
        Jet rafael = new Jet(24, 2, 4);
        rafael.displayInformation();
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
    private int numberOfEngines;

    public Jet(int airplaneID, int numberOfSeats, int numberOfEngines) {
        super(airplaneID, numberOfSeats);
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("numberOfEngines = " + numberOfEngines);
    }
}






