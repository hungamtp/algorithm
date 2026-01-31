package com.company.arrays;

public class FirstOccurence {
    public static void main(String[] args) {

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
