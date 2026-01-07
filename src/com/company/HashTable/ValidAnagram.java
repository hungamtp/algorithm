package com.company.HashTable;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] mapS = new int[26];
        int[] mapT = new int[26];
        for (int i = 0; i < s.length(); i++) {
            mapS[s.charAt(i) - 'a']++;
            mapT[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(mapS, mapT);
    }
}
