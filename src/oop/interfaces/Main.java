package oop.interfaces;

public class Main {

    public static void main(String[] args) {
        getShape(new Square());
        getShape(new Triangle());
    }

    public static void getShape(Shape shape) {
        String name = shape.getName();
        int sides = shape.getSideCount();
        System.out.println(name);
        System.out.println(sides);
    }
}
