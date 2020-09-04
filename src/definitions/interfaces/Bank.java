/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 4:05 PM
 *  File Name : Bank.java
 * */
package definitions.interfaces;

// Reserve Bank of India (RBI)
// RBI tells every bank the operations they must provide.
// Similarly, our Bank interface is telling what methods to override to each and every
// child class (acting as a Bank).
public interface Bank {
    /**
     * This method specifies how to open a bank account.
     *
     * @param firstName The first name of the customer.
     * @param lastName  The last name of the customer.
     */
    void createBankAccount(String firstName, String lastName);

    /**
     * This method specifies how to transfer a bank account from one customer to another.
     *
     * @param oldCustomerID customer ID of the customer who is transferring the bank account.
     * @param newCustomerID customer ID of the customer who is the new owner of the bank account.
     */
    void transferBankAccount(int oldCustomerID, int newCustomerID);
}
