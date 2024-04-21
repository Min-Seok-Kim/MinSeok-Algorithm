package DataStructure;

import java.util.Stack;

public class Stacks {
    public static char[][] tokens = {{'{', '}'}, {'[', ']'}, {'(', ')'}};


    public static boolean isOpenTerm(char c) {
        for (char[] array : tokens) {
            if(array[0] == c) {
                return true;
            }
        }
        return false;
    }

    public static boolean matches(char openTerm, char closeTerm) {
        for (char[] array : tokens) {
            if(array[0] == openTerm) {
                return array[1] == closeTerm;
            }
        }
        return false;
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();

        for (char c: expression.toCharArray()) {
            if(isOpenTerm(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty() || !matches(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "{[()]}"; // 올바른 괄호 표현식
        String expression2 = "{[(])}"; // 올바르지 않은 괄호 표현식

        // 첫 번째 표현식 검사



        if (isBalanced(expression1)) {
            System.out.println(expression1 + " is balanced.");
        } else {
            System.out.println(expression1 + " is not balanced.");
        }

        // 두 번째 표현식 검사
        if (isBalanced(expression2)) {
            System.out.println(expression2 + " is balanced.");
        } else {
            System.out.println(expression2 + " is not balanced.");
        }
    }

}
