package challenges;

public class ReverseString {
    static int index = 0;
    static char[] reversedWord;

    public static void main(String[] args) {
        String reversedString = reverse("awesome");
        System.out.println(reversedString); // emosewa
    }

    public static String reverse(String str) {
        char[] wordArray = str.toCharArray(); // [a,w,e,s,o,m,e]
        reversedWord = new char[wordArray.length]; // reversedWord array initialized equal to size of string
        doRecursive(wordArray);
        return new String (reversedWord);
    }

    public static int doRecursive(char[] wordArray) {
        if (wordArray.length - (index + 1) < 0) return 1;
        char lastLetter = wordArray[wordArray.length - (index + 1)];
        reversedWord[index] = lastLetter;
        index++;
        return doRecursive(wordArray);
    }
}
