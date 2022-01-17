package fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

    public static void main(String[] args) {
        /**
         * ArrayList is a dynamically sized array that comes from the Java Collection framework
         * It works similar to JavaScript arrays
         * Its dynamic so the size/length is not fixed.
         * Lots of methods are available to add or remove items etc.
         */
        ArrayList<String> f1Teams = new ArrayList<>(
            Arrays.asList(
                "Mercedes AMG Petronas",
                "Red Bull Racing",
                "Scuderia Ferrari"
            )
        );
        System.out.println(f1Teams); // [Mercedes AMG Petronas, Red Bull Racing, Scuderia Ferrari]

        f1Teams.add("McLaren");
        System.out.println(f1Teams); // [Mercedes AMG Petronas, Red Bull Racing, Scuderia Ferrari, McLaren]
    }
}
