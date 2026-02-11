package com.company.arrays;

public class FirstOccurence {
    public static void main(String[] args) {
        String s2 = "abcxabcdabcdabcy";
        String s1 = "aabaaac";
        System.out.println("Is substring: " + isSubstring(s1, s2));

        // A B A B C A B A B D
        // LPS : 0 0 0 1 2 0 1 2 3 4

    }

    public static boolean isSubstring(String s1, String s2) {
        if (s1.isEmpty()) return true;
        if (s2.length() < s1.length()) return false;

        int[] lps = computeLPSArray(s1);
        int i = 0;
        int j = 0;

        while (i < s2.length()) {
            if (s1.charAt(j) == s2.charAt(i)) {
                i++;
                j++;
            }
            if (j == s1.length()) {
                return true; // Match found
            } else if (i < s2.length() && s1.charAt(j) != s2.charAt(i)) {
                // Mismatch after j matches
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }


    private static int[] computeLPSArray(String s1) {
        int[] lps = new int[s1.length()];
        int len = 0;
        int i = 1;

        while (i < s1.length()) {
            if (s1.charAt(i) == s1.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
    public static int strStr(String haystack, String needle) {
        int p = 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (needle.equals(haystack.substring(i, i + needle.length()))) {
                return i;
            }
        }
        return -1;

    }
}
