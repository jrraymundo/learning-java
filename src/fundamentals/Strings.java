package fundamentals;

import java.util.Date;

public class Strings {

    public static void main(String[] args) {
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
}
