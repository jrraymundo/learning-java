package fundamentals;

public class Conditions {

    public static void main(String[] args) {
        /**
         * Conditions are straightforward
         * Same with JavaScript but the way Java developers
         * write conditions are a little different
         * in terms of format
         */

        // If else condition
        int number = 0;
        if (number == 1) {
            System.out.println("Nice");
        }
        else if (number > 1) {
            System.out.println("Great");
        }
        else {
            System.out.println("Awesome!");
        }

        // Simple & concise condition
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

        // Ternary Operator
        boolean isMarried = false;
        String status = isMarried ? "Married" : "Single";
        System.out.println(status);

        // Switch case
        byte role = 1;
        switch (role) {
            case 1:
                System.out.println("You're admin");
                break;
            case 2:
                System.out.println("You're moderator");
                break;
            default:
                System.out.println("You're a guest!");
        }
    }
}
