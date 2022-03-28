package hackerRank;

import java.util.*;
import java.io.*;

public class UniqueStrings {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            set.add(br.readLine());
            System.out.println(set.size());
        }
    }
}
