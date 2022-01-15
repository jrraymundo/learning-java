package fundamentals;

public class Operators {

    public static void main(String[] args) {
        /**
         * Comparison operators
         */
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        /**
         * Logical operators
         */
        boolean boolResult = x > 0 && y > 0; // Works the same way in JavaScript
        System.out.println(boolResult);

        boolean hasMoney = true;
        boolean hasJob = true;
        System.out.println(hasJob || hasMoney);
    }
}
