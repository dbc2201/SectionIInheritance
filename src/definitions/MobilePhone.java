/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 25/08/20
 *  Time: 3:39 PM
 *  File Name : MobilePhone.java
 * */
package definitions;

import org.w3c.dom.ls.LSOutput;

/**
 * This Java class will model a Mobile Phone.
 * We are assuming that the landline phone was invented first (obviously),
 * and then, some engineers invented a mobile phone.
 * */
public class MobilePhone extends Phone {

}

// MobilePhone IS A type of Phone.
// MobilePhone should acquire the properties of Phone.

// Both the Phone and the MobilePhone classes are related now.
// SuperClass/Parent Class : Phone
// SubClass  /Child Class  : MobilePhone
// MobilePhone is acquiring the properties and method of the Phone class.

// MobilePhone extends Phone
// <subclass>  extends <superclass>
// The Phone.java class is the superclass (parent class) of the MobilePhone.java class.
// The MobilePhone.java class is the subclass (child class) of the Phone.java class.

// Phone <-- (is inherited by) MobilePhone.