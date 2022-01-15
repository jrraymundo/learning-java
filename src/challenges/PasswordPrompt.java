package challenges;

import java.util.Scanner;

public class PasswordPrompt {

    public static void main(String[] args) {
        int attemptCount = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What's the password? ");
            String answer = scanner.nextLine();
            attemptCount++;
            if (answer.equals("shark50")) {
                System.out.println("Password accepted!");
                System.out.println("It took you " + attemptCount + " attempts");
                break;
            }
            if (answer.equals("q") || answer.equals("quit")) {
                System.out.println("Exiting program... Have a nice day!");
                break;
            }
        }
    }
}
