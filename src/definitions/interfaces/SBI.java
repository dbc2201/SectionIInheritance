/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 4:09 PM
 *  File Name : SBI.java
 * */
package definitions.interfaces;

public class SBI implements Bank {

    private int customerID;

    @Override
    public void createBankAccount(String firstName, String lastName) {
        System.out.println("Congratulations, " + firstName + " " + lastName +
                ". Your bank account is now opened!");
    }

    @Override
    public void transferBankAccount(int oldCustomerID, int newCustomerID) {
        this.customerID = newCustomerID;
        System.out.println("Congratulations, " + oldCustomerID + ".");
        System.out.println("The account is now transferred to " + newCustomerID);
    }
}
