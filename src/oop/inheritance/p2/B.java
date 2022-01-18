package oop.inheritance.p2;

import oop.inheritance.p1.A;

/**
 * By importing class A and extending it to class B,
 * class B inherits all public and protected variables/methods of class A.
 */

public class B extends A {
    public int v5 = 100;
    public int v6 = 101;

    /**
     * B's constructor
     *
     * Since A has a constructor with a parameter,
     * we need to also create a constructor for B
     * and then use `super()` to pass the arguments needed
     * for A's constructor
     */
    public B(int v1) {
        super(v1);
    }

    public void doSomething() {
        printSomething(); // Inherited protected method from class A
    }
}
