package com.company.string;

import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("        Let's take LeetCode contest  "));
        System.out.println(reverseWords("the sky is blue"));

    }

    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        char lastChar = ' ';
        char blankChar = ' ';
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == blankChar && lastChar == blankChar) {
                continue;
            } else if (s.charAt(i) == blankChar && lastChar != blankChar) {
                stack.push(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            } else if (s.charAt(i) != blankChar && lastChar != blankChar) {
                stringBuilder.append(s.charAt(i));
            } else if (s.charAt(i) != blankChar && lastChar == blankChar) {
                stringBuilder.append(s.charAt(i));
            }
            if (i == s.length() - 1 && !stringBuilder.isEmpty()) {
                stack.push(stringBuilder.toString());
            }
            lastChar = s.charAt(i);
        }
        StringBuilder result = new StringBuilder();

        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            if (i == stackSize - 1) {
                result.append(stack.pop());
            } else {
                result.append(stack.pop()).append(" ");
            }

        }
        return result.toString();
    }
}
