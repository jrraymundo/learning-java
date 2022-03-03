package fundamentals;

import java.util.*;
import java.io.*;

public class BufferedVsScanner {

    public static void Scan() {
         Scanner scan = new Scanner(System.in);
         int i = scan.nextInt();
         double d = scan.nextDouble();
         scan.nextLine();
         String s = scan.nextLine();

         System.out.println("String: " + s);
         System.out.println("Double: " + d);
         System.out.println("Int: " + i);

         scan.close();
    }

    public static void Buffered() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        double d = Double.parseDouble(reader.readLine());
        String s = reader.readLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        reader.close();
    }

    public static void main(String[] args) throws IOException {
         // Scan();
         Buffered();
    }
}
