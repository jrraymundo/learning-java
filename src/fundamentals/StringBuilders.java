package fundamentals;

public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder myString = new StringBuilder();
        myString.append("world");
        myString.insert(0, "hello");
        myString.insert(5, " ");
        myString.append("!");
        System.out.println(myString);

        myString.reverse();
        System.out.println(myString);

        myString.replace(0, 6, "hello");
        System.out.println(myString);

        String subString = myString.substring(1, 5);
        System.out.println(subString);
    }
}
