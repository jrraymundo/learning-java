package oop.interfaces;

public class Triangle implements Shape {
    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public int getSideCount() {
        return 3;
    }
}
