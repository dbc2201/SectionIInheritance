/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 4:07 PM
 *  File Name : Example5.java
 * */
package definitions.examples;

public class Example5 {
    public static void main(String[] args) {

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

}
