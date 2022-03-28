package hackerRank;

public class Generics {

    public static void main(String[] args) {
        Integer[] numArray = {1, 2, 3};
        myMethod(numArray);

        String[] strArray = {"Hello", "World"};
        myMethod(strArray);
    }

    public static <E> void myMethod(E[] array) {
        for (E item : array) {
            System.out.println(item);
        }
    }
}
