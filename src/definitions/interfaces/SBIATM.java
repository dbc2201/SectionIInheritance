/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 4:17 PM
 *  File Name : SBIATM.java
 * */
package definitions.interfaces;

public class SBIATM implements ATM, Bank {
    @Override
    public void withdrawMoney(double amount) {

    }

    @Override
    public void createBankAccount(String firstName, String lastName) {

    }

    @Override
    public void transferBankAccount(int oldCustomerID, int newCustomerID) {

    }  // Single Responsibility Principle
   // SOLID Principles

    int correctPin = 5678;

    @Override
    public void checkPin(int pin) {
        if (pin == correctPin) {
            System.out.println("Logged In");
        } else {
            System.out.println("please check your pin and try again.");
        }
    }
}
