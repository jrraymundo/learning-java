package oop.inheritance.p1;

/**
 * Rules of inheritance:
 * 1. public - accessible to extended class and other classes
 * 2. protected - accessible to extended class but not for other classes
 * 3. private - only accessible to the class itself
 * 4. no access modifier (a.k.a. package-private) - only classes in the same package can access
 */

public class A {
    private int v1 = 0;
    protected int v2 = 10;
    public int v3 = 15;
    public int v4 = 20;

    // A's constructor
    public A(int v1) {
        this.v1 = v1;
    }

    public void addNumbers(int x, int y) {
        int result = x + y;
        System.out.printf("%d + %d is equal to %d", x, y, result);
    }

    protected void printSomething() {
        System.out.println("Printing from A's protected method");
        System.out.println("Private v1 variable is equal to " + v1);
        System.out.println("Protected v2 variable is equal to " + v2);
    }
}
