package oop;

import java.lang.reflect.Constructor;

/**
 * In OOP, class variables should usually be set to private (encapsulated)
 * meaning they should not be directly accessible/mutated by other classes
 * when instantiated. Prefer to use methods that will edit get/set the class variables
 */

public class Rectangle {
    private int width = 0;
    private int height = 0;

    /**
     * Constructor Method
     * In Java, they should have the same name of the class and have no return type.
     * The constructor will run every time the class is instantiated.
     */
    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public void setHeight(int value) {
        if (value > 0) height = value;
    }

    public void setWidth(int value) {
        if (value > 0) width = value;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return width * height;
    }
}
