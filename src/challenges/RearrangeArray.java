package challenges;

import java.util.Arrays;

public class RearrangeArray {
    static String[] namesArray = {"jerome", "martin", null, "coco", null, null, "maui"};

    public static void main(String[] args) {
        String[] rearrangedArray = new String[namesArray.length];
        int j = 0;
        for (int i = 0; i < namesArray.length; i++) {
            if (namesArray[i] != null) {
                rearrangedArray[j] = namesArray[i];
                j++;
            }
        }
        printArray(rearrangedArray);
    }

    static void printArray(String[] array) {
        System.out.println(Arrays.toString(array));
        for (String name : array) {
            if (name != null) System.out.println(name);
        }
    }
}
