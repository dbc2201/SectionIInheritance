/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 3:06 PM
 *  File Name : Truck.java
 * */
package definitions.transport;

public class Truck extends Vehicle {

}
// How to use Visibility Modifiers with Classes & Methods in Inheritance
// 1. public : a public class can accessed anywhere in the project.
// 2. private
// 3. protected
// 4. <default>
class MonsterTruck {
    public MonsterTruck() {
        Truck myTruck = new Truck();
    }
}