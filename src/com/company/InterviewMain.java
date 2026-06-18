package com.company;

import java.util.*;

public class InterviewMain {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
        System.out.println(licenseKeyFormatting("a", 2));
        System.out.println(licenseKeyFormatting("2a", 2));
        System.out.println(licenseKeyFormatting("2aa", 2));
    }

    public static String licenseKeyFormatting(String s, int k) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                if (count == k) {
                    count = 0;
                    stack.push('i');
                }
                count++;
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (c == 'i') {
                sb.append('-');
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }


    static int countPieces(int length, int stick1, int stick2) {
        return (stick1 / length) + (stick2 / length);
    }

    static boolean canFormSquare(int length, int stick1, int stick2) {
        return countPieces(length, stick1, stick2) >= 4;
    }

    public static int solution(int A, int B) {
        // min to max length
        for (int length = Math.min(A, B); length > 0; length--) {
            if (canFormSquare(length, A, B)) {
                return length;
            }
        }
        return 0;
    }

    public static int maxIncome(int[] a) {
        if (a.length == 1) return a[0] % 1000000000;


        long profit = 0;
        int currentPrice = 0;


        for (int i = 0; i < a.length; i++) {

            if (a[i] > currentPrice) {
                profit += a[i] - currentPrice;
            }
            currentPrice = a[i];
        }
        return (int) (profit % 1000000000);
    }

    //IMPOSSIBLE
    public static String solution(String s, int k) {

        if (k > s.length()) {
            return "IMPOSSIBLE";
        }
        List<Character> characters = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' < 5) {
                if (count < k) {
                    characters.add('5');
                    count++;
                } else {
                    characters.add(s.charAt(i));
                }
            } else {
                characters.add(s.charAt(i));
            }
        }
        // add 5s to the end if we still have quota
        int index = characters.size() - 1;
        while (count < k && index >= 0) {
            if (characters.get(index) != '5') {
                characters.set(index, '5');
                count++;
            }
            index--;
        }


        if (count < k) {
            return "IMPOSSIBLE";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Character c : characters) {
                sb.append(c);
            }
            return sb.toString();
        }

    }
}
