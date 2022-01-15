package fundamentals;

public class SystemOutFormat {

    public static void main(String[] args) {
        /**
         * System.out.format() can be used to print variables in a string
         * similar to how you would use backticks or template literals in JavaScript.
         * - First param takes the string then you insert "%" placeholders
         * - %s = string, %d = digit, %f = float/double
         * - By inserting .1 in "%.1f", you are specifying to return up to 1 decimal place
         * - Succeeding params/arguments should match the order of the placeholders and the data types
         */

        String name = "Jerome";
        int age = 123;
        double height = 358.3333;

        System.out.format(
            "My name is %s, Im %d years old, and my height is %.1f",
            name,
            age,
            height
        );
    }
}
