package fundamentals;

public class Arrays {

    public static void main(String[] args) {
        /**
         * OLDER WAY of creating an Array in Java,
         * We declare an integer array variable with "int[]" called "numbers"
         * then we instantiate an integer array with max 5 values "new int[5]".
         *
         * Next, we assign a number from index 0 to 1.
         * Since this numbers array gets max 5 values, the unassigned indices
         * will have a default value of 0
         */
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        /**
         * This actually prints "[I@4617c264"
         * Because an Array is a reference type, and it comes from a Class.
         * So when you store an array in a variable, it only stores an address or reference to the array,
         * while the actual value is stored somewhere else.
         *
         * With that said, "[I@4617c264" is the reference to the "numbers" array
         */
        System.out.println(numbers);

        /**
         * To print an Array just like in JavaScript,
         * you need to add "import java.util.Arrays"
         * then use Arrays.toString(array)
         */
        System.out.println(java.util.Arrays.toString(numbers)); // [1, 2, 0, 0, 0]

        /**
         * NEWER AND SIMPLER WAY to create an Array in Java
         * Note that Arrays in Java have fixed lengths.
         * Once you make an Array of 5 indices, you cannot change the length,
         * but you can still change the values
         */
        int[] newNumbers = { 2, 3, 5, 1, 4 };
        newNumbers[0] = 9;

        // Before sort
        System.out.println(java.util.Arrays.toString(newNumbers)); // [9, 3, 5, 1, 4]
        java.util.Arrays.sort(newNumbers);

        // After sort
        System.out.println(java.util.Arrays.toString(newNumbers)); // [1, 3, 4, 5, 9]

        System.out.println(newNumbers.length); // 5
    }
}
