package fundamentals;

public class NumberFormat {

    public static void main(String[] args) {
        /**
         * To format numbers, there is a dedicated NumberFormat class with various methods to use
         * This type of class is not instantiated like the usual "new NumberFormat()".
         * It uses "factory methods" where you invoke a method of the class to create an instance.
         */
        java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(); // Returns a new object instance
        String result = currencyInstance.format(123456.78);
        System.out.println(result); // ₱123,456.78

        // We format for percent, but this time we shorten the lines of code by method chaining
        String percentResult = java.text.NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percentResult);
    }
}
