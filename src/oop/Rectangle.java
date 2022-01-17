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

    /**
     * The use of "this" keyword is to refer to the class
     * and can be used to access its variables and methods.
     * It's only needed when your method parameter uses
     * the same name of your variable.
     */

    public void setHeight(int height) {
        if (height > 0) this.height = height;
    }

    public void setWidth(int width) {
        if (width > 0) this.width = width;
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
