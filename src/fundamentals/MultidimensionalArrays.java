package fundamentals;

import java.util.Arrays;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        /**
         * Multidimensional arrays are possible
         * Just add more brackets
         */

        /**
         * Older way of creating an array
         */
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers)); // [[1, 0, 0], [0, 0, 0]]

        /**
         * Newer way of creating an array
         */
        int[][] newNumbers = { {1, 2, 3}, {0, 6, 3} };
        System.out.println(Arrays.deepToString(newNumbers)); // [[1, 2, 3], [0, 6, 3]]
    }
}
