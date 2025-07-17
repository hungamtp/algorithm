package com.company.algorithm.slidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "acab"));
        System.out.println(checkInclusion("adc", "dcda"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[52];
        int[] arr2 = new int[52];

        int s1Length = s1.length();
        if(s2.length() < s1Length){
            return  false;
        }
        for (int i = 0; i < s1Length; i++) {
            arr1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1Length; i++) {
            arr2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(arr1, arr2)) {
            return true;
        }

        for (int i = s1Length; i < s2.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
            arr2[s2.charAt(i - s1Length) - 'a']--;
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }

}
