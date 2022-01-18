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

    /**
     * This is an added method for Square that is not part of the Shape interface
     */
    public String getShapeType() {
        return "2D Shape";
    }
}
