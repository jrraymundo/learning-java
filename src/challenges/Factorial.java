package challenges;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        System.out.print(num + " * ");
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }
}
