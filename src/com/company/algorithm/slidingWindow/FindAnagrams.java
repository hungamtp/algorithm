package com.company.algorithm.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
    public static void main(String[] args) {
        //Find All Anagrams in a String
        //👉 Given strings s and p, return all start indices of p’s anagrams in s.
        //➤ Example: s = “cbaebabacd”, p = “abc” → Output: [0, 6]
        //➤ LeetCode: 438
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int sLen = s.length(), pLen = p.length();
        if (sLen < pLen) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count frequency of characters in p
        for (int i = 0; i < pLen; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // Compare the first window
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // Slide the window
        for (int i = pLen; i < sLen; i++) {
            // Add new character to the window
            sCount[s.charAt(i) - 'a']++;
            // Remove the character left behind
            sCount[s.charAt(i - pLen) - 'a']--;

            if (Arrays.equals(pCount, sCount)) {
                result.add(i - pLen + 1);
            }
        }

        return result;
    }

}
