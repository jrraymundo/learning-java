package fundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaders {
    public static void main(String[] args) throws IOException {
        /**
         * To use BufferedReader you need to initialize an InputStreamReader first
         * then pass it to a BufferedReader when instantiating
         */
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStream);

        /**
         * BufferedReader captures the input you enter like Scanner.
         * It returns a String by default, so int and other number types need to be parsed.
         * */
        System.out.println("Enter a string: ");
        String inputString = br.readLine();
        System.out.println(inputString);

        System.out.println("Enter an integer: ");
        int inputInt = Integer.parseInt(br.readLine());
        System.out.println(inputInt);
    }
}
