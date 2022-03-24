package hackerRank;

import java.util.*;

public class BalancedStrings {

    public static boolean isBalanced(String line, Stack<Character> stack) {
        for (int i = 0; i < line.length(); i++) {
            // System.out.println(stack);
            switch (line.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.push(line.charAt(i));
                    break;
                case ')':
                    if (stack.isEmpty()) return false;
                    if (stack.peek() == '(') stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty()) return false;
                    if (stack.peek() == '{') stack.pop();
                    break;
                case ']':
                    if (stack.isEmpty()) return false;
                    if (stack.peek() == '[') stack.pop();
                    break;
                default:
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            // System.out.println("--- " + line + " ---");

            boolean result = isBalanced(line, stack);

            System.out.println(result);
            stack.clear();
        }

        sc.close();
    }
}

/*
Case 1

Input:
{}()
({()})
{}(
[]

Output:
true
true
false
true

------------

Case 2

Input:
({}[])
(({()})))
({(){}()})()({(){}()})(){()}
{}()))(()()({}}{}
}}}}
))))
{{{
(((
[]{}(){()}((())){{{}}}{()()}{{}{}}
[[]][][]
}{

Output:
true
false
true
false
false
false
false
false
true
true
false
*/