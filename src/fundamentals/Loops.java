package fundamentals;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        /**
         * For loop
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World! " + i);
        }

        /**
         * While loop
         * Useful when you don't know how many times you want to repeat something
         * Good use case, is when you want to keep asking for inputs from a user
         * until user satisfies a condition.
         *
         * It's common to do a forever true condition in while loops
         * but use "break" and "continue" to handle the stopping
         */
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Type something: ");
            input = scanner.next().toLowerCase();
            if (input.equals("continue")) {
                System.out.println("Let's continue!");
                continue;
            }
            if (input.equals("quit")) {
                break;
            }
        }

        /**
         * Do While loop
         * A loop that will do something at least once
         * even if the condition is already false from the beginning.
         */
        do {
            System.out.println("Do");
        } while (false);

        /**
         * Foreach loop
         * To do a foreach loop like in JavaScript,
         * declare the single value and its type followed by a colon and the array
         */
        String[] fruits = { "Apple", "Mango", "Banana" };
        for (String singleFruit: fruits) {
            System.out.println(singleFruit);
        }
    }
}
