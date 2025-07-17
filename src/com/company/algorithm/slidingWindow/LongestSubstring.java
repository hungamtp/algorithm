package com.company.algorithm.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {



//        find the length of the longest substring without duplicate characters.
//        Input: s = "abcaxgtbcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
        System.out.println(lengthOfLongestSubstring("abcaxgtxcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            if (map.containsKey(current) && map.get(current) >= left) {

                left = map.get(current) + 1;
            }

            map.put(current, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

