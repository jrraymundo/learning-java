package fundamentals;

import java.util.StringTokenizer;

public class StringTokenizers {


    public static void main(String[] args) {
        /**
         * StringTokenizer is helpful for splicing related tasks for strings
         * For every call of nextToken(), the token count gets decremented.
         * So once you've called the last nextToken(), calling it again will return an error
         */
        StringTokenizer myString = new StringTokenizer("Hello World!");
        System.out.println(myString.countTokens()); // 2
        System.out.println(myString.hasMoreTokens()); // true
        System.out.println(myString.nextToken()); // "Hello"
        System.out.println(myString.nextToken()); // "World"

        StringTokenizer another = new StringTokenizer("Hi, Jerome Raymundo!", ",");
        System.out.println(another.nextToken()); // "Hi"
        System.out.println(another.nextToken()); // " Jerome Raymundo!"

        StringTokenizer andAnother = new StringTokenizer("Hi there!");
        while (andAnother.hasMoreTokens()) {
            System.out.println(andAnother.nextToken());
        }
    }
}
