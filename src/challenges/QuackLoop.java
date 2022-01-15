package challenges;

public class QuackLoop {

    public static void main(String[] args) {
        for (int x = 1; x <= 40; x++) {
            System.out.println(x);
            if (x % 3 == 0) System.out.println("Quack!");
        }
    }
}
