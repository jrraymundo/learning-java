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

    /**
     * Method override
     * Class B inherits a method called addNumbers() from class A,
     * but we are able to override methods by declaring another method
     * with the same name, parameters, and return type
     *
     * The addNumbers method is overridden by class B,
     * as we multiply x and y arguments by 2 and then invoke the
     * original addNumbers method of class A
     * by calling `super.addNumbers(x, y)`
     *
     * Notice that there is an `@Override` placed above the method
     * This is common practice when overriding methods for readability
     */
    @Override
    public void addNumbers(int x, int y) {
        x = x * 2;
        y = y * 2;
        super.addNumbers(x, y);
    }

    public void doSomething() {
        printSomething(); // Inherited protected method from class A
    }
}
