package challenges;

import java.util.Arrays;

public class InsertInArray {

    static String[] namesArray = {"jerome", "martin", "maui", "coco"};

    public static void main(String[] args) {
        /**
         * A value is inserted in an existing array with no more room,
         * by creating a new array, inserting the value in specified index,
         * then assigning the other values to the vacant indices by iteration
         */
        int indexToInsert = 1;
        String nameToInsert = "spike";
        String[] newArray = new String[namesArray.length + 1];
        newArray[indexToInsert] = nameToInsert;

        int j = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (i != indexToInsert) {
                newArray[i] = namesArray[j];
                j++;
            }
        }
        printArray(newArray);
    }

    static void printArray(String[] array) {
        System.out.println(Arrays.toString(array));
        for (String name : array) {
            System.out.println(name);
        }
    }
}
