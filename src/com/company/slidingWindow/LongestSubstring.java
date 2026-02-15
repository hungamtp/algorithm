package com.company.slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {


//       find the length of the longest substring without duplicate characters.
        System.out.println(lengthOfLongestSubstring("abcaxgtxcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> sMap = new HashMap<>();
        int left = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (sMap.containsKey(current) && sMap.get(current) >= left) {
                left = sMap.get(current) + 1;
            }
            sMap.put(current, i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    public static int lengthOfLongestSubstringUsingSet(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
                i--;
            } else {
                set.add(s.charAt(i));
            }
            maxLength = Math.max(maxLength, i-left +1);
        }

        return maxLength;
    }
}

