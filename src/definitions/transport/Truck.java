/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 3:06 PM
 *  File Name : Truck.java
 * */
package definitions.transport;

class Truck extends Vehicle {  // The class has a <default> visibility modifier

}
// How to use Visibility Modifiers with Classes & Methods in Inheritance
// 1. public : a public class can accessed anywhere in the project.
// 2. private
// 3. protected
// 4. <default> : cannot be accessed outside the package
//                it can be accessed anywhere in the same package
//                a class with the <default> visibility modifier is acting as
//                a private member for the package
//                So, we sometimes also call it 'package-private' visibility modifier.
class MonsterTruck {
    public MonsterTruck() {
        Truck myTruck = new Truck();
    }
}