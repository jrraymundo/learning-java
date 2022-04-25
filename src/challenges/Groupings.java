package challenges;

import java.util.*;

public class Groupings {

    public static void main(String[] args) {
        int N = 3;
        int K = 3;
        int[] given = {1, 6, 4};

        for (int i = 0; i < N; i++) {
            List arrayList = new ArrayList<>(N);
            int[] array = new int[N];
            array[i] = given[i];

            for (int j = i + 1; j < N; j++) {

                for (int x = 0; x < N; x++) {
                    if (Math.abs(array[x] - given[j]) <= K) {
                        array[j] = given[j];
                        continue;
                    }

                    if (Math.abs(given[j] - array[x]) <= K) {
                        array[j] = given[j];
                    }
                }

            }

            if (i == N - 1) {
                // Another loop might be needed
                for (int x = 0; x < N; x++) {
                    if (Math.abs(array[x] - given[N-1]) <= K) {
                        array[N-1] = given[N-1];
                        continue;
                    }

                    if (Math.abs(given[N-1] - array[x]) <= K) {
                        array[N-1] = given[N-1];
                    }
                }
            }

            System.out.println(Arrays.toString(array));
        }

//        for (int i = 0; i < N; i++) {
//            List arrayList = new ArrayList<>(N);
//            int[] array = new int[N];
//            array[0] = given[i];
//
//            for (int j = 0; j < N; j++) {
//                if (array[j] == given[j]) {
//                    continue;
//                }
//
//                for (int x = 0; x < N; x++) {
//                    if (array[x] == 0) continue;
//                    if (Math.abs(given[j] - array[x]) <= K) {
//                        array[j] = given[j];
//                    }
//                }
//            }
//
//            System.out.println(Arrays.toString(array));
//        }
    }
}
