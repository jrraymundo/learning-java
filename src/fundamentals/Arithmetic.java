package fundamentals;

public class Arithmetic {

    public static void main(String[] args) {
        /**
         * Arithmetic expressions use the usual operators
         */
        int add = 10 + 3;
        int sub = 10 - 3;
        System.out.println(add);
        System.out.println(sub);

        /**
         * For division, when integers are divided you get an integer in return
         * If you're expecting decimals, then you should specify the data types
         */
        int divide1 = 10 / 3;
        System.out.println(divide1); // 3

        double divide2 = (double) 10 / (double) 3;
        System.out.println(divide2); // 3.3333333333333335

        /**
         * Increment/decrement operators can also vary with the placements
         */
        int x = 0;
        x++;
        ++x;
        System.out.println(x);

        /**
         * Augmented assignment operator
         */
        int y = 0;
        y += 5;
        System.out.println(y);
    }
}
