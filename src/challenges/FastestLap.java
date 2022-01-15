package challenges;

import java.util.Scanner;

public class FastestLap {
    static double[] laps;
    static double fastestLap = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getLapCount();
        getLapTimes();
        printLapDetails();
    }

    public static void getLapCount() {
        System.out.print("How many laps? ");
        laps = new double[scanner.nextInt()];
    }

    public static void getLapTimes() {
        System.out.println("Input your lap times");
        for (int x = 0; x < laps.length; x++) {
            laps[x] = scanner.nextDouble();
            if (x == 0) fastestLap = laps[x];
            if (laps[x] < fastestLap) fastestLap = laps[x];
        }
    }

    public static void printLapDetails() {
        System.out.println("Lap Times");
        for (int x = 0; x < laps.length; x++) {
            System.out.println("Lap " + (x+1) + ": " + laps[x]);
        }
        System.out.println("Your fastest lap is: " + fastestLap);
    }
}
