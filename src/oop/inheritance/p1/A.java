package oop.inheritance.p1;

/**
 * Rules of inheritance:
 * 1. public - accessible to extended class and other classes
 * 2. protected - accessible to extended class but not for other classes
 * 3. private - only accessible to the class itself
 * 4. no access modifier (a.k.a. package-private) - only classes in the same package can access
 */

public class A {
    private int v1 = 5;
    protected int v2 = 10;
    public int v3 = 15;
    public int v4 = 20;

    protected void printSomething() {
        System.out.println("Printing from A's protected method");
    }
}
