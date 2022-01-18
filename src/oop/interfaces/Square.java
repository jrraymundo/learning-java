package oop.interfaces;

public class Square implements Shape {

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public int getSideCount() {
        return 4;
    }
}
