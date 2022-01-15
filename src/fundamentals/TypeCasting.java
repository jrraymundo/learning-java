package fundamentals;

public class TypeCasting {

    public static void main(String[] args) {
        /**
         * Casting is a process of making Java convert types in expressions.
         * They can either be implicit or explicit.
         */

        /**
         * IMPLICIT Casting
         * Different types of primitives can be IMPLICITLY cast in the same expressions (a.k.a. widening)
         * As long as:
         *  - No data loss will happen
         *  - They are compatible (Numbers are not compatible with strings)
         * ----------------------------------------------------------------------------
         * Example:
         * A short has 2 bytes, while an int has 4 bytes
         * You can add a short to an int because:
         *  - No data loss can happen, a short from 2 bytes increments to 4 bytes thus becomes an int
         *  - They are compatible, both short and int are numbers
         */
        short x = 1;
        int y = x + 2;
        System.out.println(y); // 3

        /**
         * EXPLICIT Casting
         * If a primitive needs to convert into a lower data type then it needs to be EXPLICITLY cast
         * (a.k.a. narrowing)
         *
         * In this case, we have a double that should be added to an int
         * then stored to an int variable.
         * We just need to add (int) cast to the double.
         */
        double v = 1.1;
        int z = (int)v + 2;
        System.out.println(z); // 3
    }
}
