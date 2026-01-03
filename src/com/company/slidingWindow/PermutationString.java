package com.company.slidingWindow;

import java.util.Arrays;

public class PermutationString {
    public static void main(String[] args) {

        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] arr1 = new int[52];
        int[] arr2 = new int[52];

        int k = s1.length();
        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(arr1, arr2)) return true;
        for (int i = 0; i < s2.length() - k; i++) {
            arr2[s2.charAt(i) - 'a']--;
            arr2[s2.charAt(i + k) - 'a']++;
            if (Arrays.equals(arr1, arr2)) return true;
        }
        return false;
    }

}
