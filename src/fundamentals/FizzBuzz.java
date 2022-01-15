package fundamentals;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        /**
         * Pseudo
         * if n % 5 == 0 && n % 3 == 0 return fizzbuzz
         * if n % 5 == 0 return fizz
         * if n % 3 == 0 return buzz
         * else return n
         */

        String word = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            word += "fizz";
        }
        if (number % 3 == 0) {
            word += "buzz";
        }

        if (word.equals("")) {
            System.out.println(number);
        } else {
            System.out.println(word);
        }
    }
}
