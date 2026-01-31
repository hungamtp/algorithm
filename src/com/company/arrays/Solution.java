package com.company.arrays;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int[] lps = buildLPS(needle);

        int i = 0; // pointer for haystack
        int j = 0; // pointer for needle

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                if (j == needle.length()) {
                    return i - j; // found first occurrence
                }
            } else {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1;
    }

    // Build Longest Prefix Suffix (LPS) array
    private int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int length = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length > 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
