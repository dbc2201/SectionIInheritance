/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 4:08 PM
 *  File Name : ATM.java
 * */
package definitions.interfaces;

public interface ATM {
    /**
     * This method specifies how to withdraw money from an ATM.
     *
     * @param amount The amount of money the customer wants to withdraw.
     */
    void withdrawMoney(double amount);

    // CAREFUL! This is not the <default> visibility modifier!
    default void checkPin(int pin) {

    }
}
