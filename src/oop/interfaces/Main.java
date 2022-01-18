package oop.interfaces;

public class Main {

    public static void main(String[] args) {
        getShape(new Square());
        System.out.println();
        getShape(new Triangle());
    }

    /**
     * This method allows us to pass any Class that implements the Shape interface,
     * which makes it reusable
     */
    public static void getShape(Shape shape) {
        String name = shape.getName();
        int sides = shape.getSideCount();
        System.out.println(name);
        System.out.println(sides);

        /**
         * Since our Square instance is actually instantiated as a Shape,
         * we can't invoke the unique `getShapeType` by default
         * because the Shape interface does not have that.
         *
         * In order to invoke unique methods of Square.
         * It needs to be converted via type casting.
         * By adding a condition and checking with `instanceof`
         * we can check convert the Square's type to Square
         */
        if (shape instanceof Square square) {
            String shapeType = square.getShapeType();
            System.out.println(shapeType);
        }
    }
}
