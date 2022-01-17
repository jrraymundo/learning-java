package fundamentals;

import java.util.Scanner;

public class StaticVariables {

    /**
     * These are static variables declared outside class methods
     * They will be accessible by all methods
     */
    static String name = "Jerome";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        myMethod();
    }

    /**
     * When creating methods it's actually not necessary to write public
     * It's only required for main method, and if we're dealing with multiple classes
     */
    static void myMethod() {
        System.out.print("Hello " + name + ", enter some text: ");
        String text = scanner.nextLine();
        System.out.println(text);
    }
}
