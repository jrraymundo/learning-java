package fundamentals;

public class Math {

    public static void main(String[] args) {
        int maxResult = java.lang.Math.max(1, 8);
        System.out.println(maxResult); // Returns the bigger number

        double randomResult = java.lang.Math.random();
        System.out.println(randomResult); // Some random numbers from 0 to 1

        int randomRound = (int) (java.lang.Math.random() * 100);
        System.out.println(randomRound); // Returns random number from 0 to 100
    }
}
