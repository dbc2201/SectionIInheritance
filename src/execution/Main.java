/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 3:44 PM
 *  File Name : Main.java
 * */
package execution;

import definitions.MobilePhone;
import definitions.Phone;

public class Main {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        System.out.println(myPhone.getContactNumber());
        MobilePhone myMobilePhone = new MobilePhone();
        System.out.println(myMobilePhone.getContactNumber());
    }
}
