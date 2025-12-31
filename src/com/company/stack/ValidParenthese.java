package com.company.stack;

import java.util.Stack;

// the last close parenThese will match with the last open parentThese in Stack

public class ValidParenthese {
    public static void main(String[] args) {
        System.out.println(']' - 1);
        System.out.println('[' - 1);
        System.out.println('{' - 1);
        System.out.println('}' - 1);
        System.out.println('(' - 1);
        System.out.println(')' - 1);
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        Stack<Character> parenTheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (isOpen(s.charAt(i))) {
                parenTheses.push(s.charAt(i));
            } else {
                if  (parenTheses.isEmpty()) return false;
                if (!isValidPair(parenTheses.peek(), s.charAt(i))) {
                    return false;
                }
            }
        }
        return parenTheses.isEmpty();
    }

    public static boolean isOpen(char parenThese) {
        return switch (parenThese) {
            case '(', '{', '[' -> true;
            default -> false;
        };
    }

    public static boolean isValidPair(char openParenThese, char closeParenThese) {
        if (openParenThese == '(' && closeParenThese == ')') {
            return true;
        }
        if (openParenThese == '[' && closeParenThese == ']') {
            return true;
        }
        if (openParenThese == '{' && closeParenThese == '}') {
            return true;
        }
        return false;
    }
}
