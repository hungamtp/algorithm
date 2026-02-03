package com.company.HashTable;

public class HasUniqueChar {
    public static void main(String[] args) {
        System.out.println(hasUniqueChar("leetcode"));
        System.out.println(hasUniqueChar("abvcs"));
        System.out.println(hasUniqueChar("12341"));
    }
    public static boolean hasUniqueChar(String str) {
        int[] charIndex = new int[200];
        for (int i = 0; i < str.length(); i++) {
            if (charIndex[str.charAt(i)] > 0) {
                return false;
            }
            charIndex[str.charAt(i)]++;
        }

        return true;
    }
}
