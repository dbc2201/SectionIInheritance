/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 4:05 PM
 *  File Name : Bank.java
 * */
package definitions.interfaces;

public interface Bank {
    /**
     * This method specifies how to open a bank account.
     *
     * @param firstName The first name of the customer.
     * @param lastName  The last name of the customer.
     */
    void createBankAccount(String firstName, String lastName);
}
