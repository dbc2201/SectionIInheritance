/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 4:09 PM
 *  File Name : SBI.java
 * */
package definitions.interfaces;

public class SBI implements Bank {
    @Override
    public void createBankAccount(String firstName, String lastName) {
        System.out.println("Congratulations, " + firstName + " " + lastName +
                ". Your bank account is now opened!");
    }
}
