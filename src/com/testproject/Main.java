package com.testproject;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        stringTest();
//        arrayTest();
//        multiDimensionalArrayTest();
//        constantTest();
//        arithmeticTest();
//        castingTest();
//        mathTest();
//        numberFormatTest();
        scannerTest();
    }

    public static void stringTest() {
        System.out.println(new Date());

        String message = "Hello World" + "!!";
        System.out.println(message);
        System.out.println("Starts with H " + message.startsWith("H"));
        System.out.println("Index of e is " + message.indexOf("e"));

        String name = "jerome";
        System.out.println(name.concat(" raymundo")); // "jerome raymundo" Will not mutate the original name string
        System.out.println(name); // "jerome"

        System.out.println("Someone said \"Hi!\" to me");
    }

    public static void arrayTest() {
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
        System.out.println(Arrays.toString(numbers)); // [1, 2, 0, 0, 0]

        /**
         * NEWER AND SIMPLER WAY to create an Array in Java
         * Note that Arrays in Java have fixed lengths.
         * Once you make an Array of 5 indices, you cannot change the length,
         * but you can still change the values
         */
        int[] newNumbers = { 2, 3, 5, 1, 4 };
        newNumbers[0] = 9;

        // Before sort
        System.out.println(Arrays.toString(newNumbers)); // [9, 3, 5, 1, 4]
        Arrays.sort(newNumbers);

        // After sort
        System.out.println(Arrays.toString(newNumbers)); // [1, 3, 4, 5, 9]

        System.out.println(newNumbers.length); // 5
    }

    public static void multiDimensionalArrayTest() {
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

    public static void constantTest() {
        /**
         * Use "final" to make your variable a constant
         * If you try to change a constant you'll get an error
         * "Cannot assign a value to final variable 'PI'"
         */
        final float PI = 3.14F;
        System.out.println(PI);
    }

    public static void arithmeticTest() {
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

    public static void castingTest() {
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

    public static void mathTest() {
        int maxResult = Math.max(1, 8);
        System.out.println(maxResult); // Returns the bigger number

        double randomResult = Math.random();
        System.out.println(randomResult); // Some random numbers from 0 to 1

        int randomRound = (int) (Math.random() * 100);
        System.out.println(randomRound); // Returns random number from 0 to 100
    }

    public static void numberFormatTest() {
        /**
         * To format numbers, there is a dedicated NumberFormat class with various methods to use
         * This type of class is not instantiated like the usual "new NumberFormat()".
         * It uses "factory methods" where you invoke a method of the class to create an instance.
         */
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(); // Returns a new object instance
        String result = currencyInstance.format(123456.78);
        System.out.println(result); // ₱123,456.78

        // We format for percent, but this time we shorten the lines of code by method chaining
        String percentResult = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percentResult);
    }

    public static void scannerTest() {
        /**
         * Scanner is used to take inputs.
         * By passing `System.in` we specify to get input from the terminal
         * The scanner instance also has many methods of next() depending on the data type
         */
        Scanner ageScanner = new Scanner(System.in);
        System.out.print("What's your age? "); // `.print` allows us to type the input on the same line
        byte age = ageScanner.nextByte();
        System.out.println("Nice, you are " + age);
        // Implicit casting happens here while concatenating, as age is converted in to a string

        /**
         * For string inputs, each word is called a token.
         * `next()` will capture only the first token or word
         * `nextLine()` allows capturing all tokens or the whole string
         */
        Scanner nameScanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = nameScanner.nextLine().trim();
        System.out.println("Hi " + name + "!");
    }
}
