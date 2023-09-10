package oop.interfaces;

/**
 * An Interface is similar to abstract classes
 * The key difference are:
 * - They are designed to only have abstract methods without any "body".
 *   The "body" of the method comes when you "implement" the interface on a class
 * - BUT you can actually also add a method with a body if you declare it with "default"
 * 	 this will make other objects inherit the body as a default method which can be still be overridden 
 * - Multiple interfaces can be implemented on a class, while abstract classes
 *   can only be extended one per class
 */

public interface Shape {
    abstract String getName();
    abstract int getSideCount();
    
    default void printSomething() {
    	System.out.println("Default print in shape interface");
    }
}
