package challenges;

import java.util.Scanner;

public class FastestLap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many laps? ");
        double[] laps = new double[scanner.nextInt()];

        double fastestLap = 0;
        System.out.println("Input your lap times");
        for (int x = 0; x < laps.length; x++) {
            laps[x] = scanner.nextDouble();
            if (x == 0) fastestLap = laps[x];
            if (laps[x] < fastestLap) fastestLap = laps[x];
        }

        System.out.println("Lap Times");
        for (int x = 0; x < laps.length; x++) {
            System.out.println("Lap " + (x+1) + ": " + laps[x]);
        }
        System.out.println("Your fastest lap is: " + fastestLap);
    }
}
