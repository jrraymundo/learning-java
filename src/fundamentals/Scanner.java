package fundamentals;

public class Scanner {

    public static void main(String[] args) {
        /**
         * Scanner is used to take inputs.
         * By passing `System.in` we specify to get input from the terminal
         * The scanner instance also has many methods of next() depending on the data type
         */
        java.util.Scanner ageScanner = new java.util.Scanner(System.in);
        System.out.print("What's your age? "); // `.print` allows us to type the input on the same line
        byte age = ageScanner.nextByte();
        System.out.println("Nice, you are " + age);
        // Implicit casting happens here while concatenating, as age is converted in to a string

        /**
         * For string inputs, each word is called a token.
         * `next()` will capture only the first token or word
         * `nextLine()` allows capturing all tokens or the whole string
         */
        java.util.Scanner nameScanner = new java.util.Scanner(System.in);
        System.out.print("What is your name? ");
        String name = nameScanner.nextLine().trim();
        System.out.println("Hi " + name + "!");
    }
}
