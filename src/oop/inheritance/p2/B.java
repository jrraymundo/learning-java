package oop.inheritance.p2;

import oop.inheritance.p1.A;

/**
 * By importing class A and extending it to class B,
 * class B inherits all public and protected variables/methods of class A.
 */

public class B extends A {
    public int v5 = 100;
    public int v6 = 101;

    public void doSomething() {
        printSomething(); // Inherited protected method from class A
    }
}
