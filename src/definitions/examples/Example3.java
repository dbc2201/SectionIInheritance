/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 4:17 PM
 *  File Name : Example3.java
 * */
package definitions.examples;

public class Example3 {
    public static void main(String[] args) {

    }
}
class A1 {
    public int i, j;

    void setValues(int x, int y) {
        i = x;
        j = y;
    }

    public int sum(int x, int y) {
        int sum = i + j;
        return sum;
    }
}
class B1 extends A1 {
    public int multiply(int x, int y) {
        int product = i * j;
        return product;
    }
}
class C1 extends A1 {
    public int divide(int x, int y) {
        int division = i / j;
        return division;
    }
}
class D1 extends A1 {
    public int subtract(int x, int y) {
        int difference = i - j;
        return difference;
    }
}

















