/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 03/09/20
 *  Time: 3:24 PM
 *  File Name : ATM.java
 * */
package definitions.interfaces;

public interface Example {
    // 1. For fields
    // i. every field declared in an interface must be initialized.
    // ii. every field declared in an interface is automatically considered
    // as public by the compiler.
    // iii. every field declared in an interface is automatically considered
    // as final by the compiler, i.e we cannot change its value.
    // iv. every fields declared in an interface is automatically considered
    // as static by the compiler.
    // public static final <dataType> <variableName> = <initialValue>;
    int atmID = 1234;

    // 2. For methods
    // i. every method declared in an interface is automatically considered
    // as an abstract method by the compiler.
    // ii. every method declared in an interface is automatically considered
    // as a public method by the compiler.
    // public abstract <staticModifier> <returnType> <methodName>();
    void withdrawMoney();
}
