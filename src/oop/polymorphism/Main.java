package oop.polymorphism;

import java.util.ArrayList;

public class Main {

    /**
     * Polymorphism in Java describes classes that can become their subclasses
     * It is allowed to declare a Driver class (main)
     * then instantiate it with "new F1Driver" (subclass)
     *
     * Since the subclass is instantiated as its Main class:
     * - The subclass will mainly act as the Main class
     * - Unique variables and methods of the subclass are not directly accessible
     * - However, overridden methods in the subclass will still work including the constructor
     *
     * More info: https://www.geeksforgeeks.org/polymorphism-in-java
     */

    public static void main(String[] args) {
        Driver driver1 = new F1Driver("Lewis Hamilton", "F1 Mercedes", true, "Mercedes");
        System.out.println(driver1.getName());
        driver1.greeting();

        /**
         * The unique methods of the F1Driver subclass are not available
         * when it's declared as the "main" Driver class,
         * even though it's instantiated as "new F1Driver"
         */
        // System.out.println(driver1.getF1Team()); -- Does not work!

        /**
         * You cannot declare a subclass then instantiate its main class to it
         */
        // F1Driver driver2 = new Driver("Kimi Raikkonen", "F1 Alfa Romeo", true, "Alfa Romeo");

        /**
         * Due to polymorphism, we are able to create an array list based on a Main class
         * then add its different subclasses together in 1 array list.
         */
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(new F1Driver("Charles Leclerc", "F1 Ferrari", true, "Ferrari"));
        drivers.add(new RallyDriver("Valterri Bottas", "Subaru WRX", true));
        for (Driver driver: drivers) {
            System.out.println(driver.getName());
        }
    }
}
