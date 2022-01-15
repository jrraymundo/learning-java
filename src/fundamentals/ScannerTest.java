package fundamentals;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        /**
         * Scanner is used to take inputs.
         * By passing `System.in` we specify to get input from the terminal.
         * Calling `.next()` makes java wait for a string input from the user
         * But the scanner instance also has many other methods of `next()` depending on the data type
         *
         * e.g.
         * - nextByte()
         * - nextInt()
         * - nextDouble()
         * - etc.
         */
        Scanner ageScanner = new Scanner(System.in);
        System.out.print("What's your age? "); // `.print` allows us to type the input on the same line
        byte age = ageScanner.nextByte();
        System.out.println("Nice, you are " + age);
        // Implicit casting happens here while concatenating, as age is converted in to a string

        /**
         * For string inputs, each word is called a token.
         * The `next()` method will pause and capture the first token or word that the user inputs
         * you will need to write multiple `next()` methods to capture the other tokens/words
         * that the user inputs.
         *
         * If you have 3 `next()` calls, and the user inputs 3 tokens in one enter
         * then Java will automatically assign the three tokens right away.
         */
        Scanner tokenScanner = new Scanner(System.in);
        System.out.print("Give 3 words separated by a space ");
        String word1 = tokenScanner.next();
        String word2 = tokenScanner.next();
        String word3 = tokenScanner.next();
        System.out.println("You gave: " + word1 + " " + word2 + " " + word3);

        /**
         * The `nextLine()` allows capturing all tokens or the whole string of the user input
         */
        Scanner nameScanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = nameScanner.nextLine().trim();
        System.out.println("Hi " + name + "!");
    }
}
