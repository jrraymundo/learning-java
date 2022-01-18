package oop.interfaces;

/**
 * An Interface is similar to abstract classes
 * The key difference are:
 * - They are designed to only have abstract methods without any "body".
 *   The "body" of the method comes when you "implement" the interface on a class
 * - Multiple interfaces can be implemented on a class, while abstract classes
 *   can only be extended one per class
 */

public interface Shape {
    abstract String getName();
    abstract int getSideCount();
}
