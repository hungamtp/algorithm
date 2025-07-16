package com.company.algorithm;

import java.lang.reflect.Array;
import java.util.*;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 0, 2, 2, 5};
        int[] arr2 = new int[]{2, 2, 0, -4, 2, 2, 4, 2, 8, 7, 0, 2, 1, 1, 2, 3, 1, 0, 0, 4, 0, 0};
        System.out.println(findSumEqualToK(arr1, 4, 3));
        System.out.println(findSumEqualToK(arr2, 4, 3));
        System.out.println(findSumEqualToK(arr2, 4, 2));

        System.out.println(findMaxInRangK(arr1, 3));
        System.out.println(findMaxInRangK(arr2, 3));
        System.out.println(findMaxInRangK(arr2, 4));

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

    public static void resetMap(Map<String, Boolean> pMap) {
        for (Map.Entry<String, Boolean> entry : pMap.entrySet()) {
            entry.setValue(true);
        }
    }

    public static int findSumEqualToK(int[] arr, int sum, int k) {
        if (arr.length == 0) {
            return 0;
        }
        int count = 0;
        int firstSum = 0;
        for (int i = 0; i < k; i++) {
            firstSum += arr[i];
        }
        if (firstSum == sum) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {

            firstSum += arr[i];
            firstSum -= arr[i - k];
            if (firstSum == sum) {
                count++;
            }
        }
        return count;
    }

    public static int findMaxInRangK(int[] arr, int k) {
        if (arr.length == 0) {
            return 0;
        }
        int max = 0;
        int temp = 0;
        for (int i = 0; i < k; i++) {
            max += arr[i];
        }
        temp = max;
        for (int i = k; i < arr.length; i++) {
            temp += arr[i];
            temp -= arr[i - k];
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
