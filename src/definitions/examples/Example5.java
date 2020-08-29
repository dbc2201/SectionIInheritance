/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 4:07 PM
 *  File Name : Example5.java
 * */
package definitions.examples;

public class Example5 {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.bikeID = 1;
        myBike.modelYear = 2020;
        myBike.display();
        SuperBike mySuperBike = new SuperBike();
        mySuperBike.bikeID = 2;
        mySuperBike.modelYear = 2019;
        mySuperBike.maxSpeed = 250;
        mySuperBike.display();
    }
}

class Bike {
    int bikeID;
    int modelYear;

    void display() {
        System.out.println("bikeID = " + bikeID);
        System.out.println("modelYear = " + modelYear);
    }
}

class SuperBike extends Bike {
    int maxSpeed;

    @Override
    void display() {
        System.out.println("bikeID = " + bikeID);
        System.out.println("modelYear = " + modelYear);
        System.out.println("maxSpeed = " + maxSpeed);
    }
}
