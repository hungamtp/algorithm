package com.company.HashTable;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        System.out.println(longestConsecutive(new int[]{1, 2, 3, 4, 5}));
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(longestConsecutive(new int[]{0}));
        System.out.println(longestConsecutive(new int[]{1, 100}));
        System.out.println(longestConsecutive(new int[]{1, 2}));
        System.out.println(longestConsecutive(new int[]{2, 1}));
        System.out.println(longestConsecutive(new int[]{2, 0}));
    }

    public static int longestConsecutive(int[] nums) {

        int length = nums.length;
        if (length == 0 || length == 1) return length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(nums[i], i);
        }
        int result = 0;
        for (int i = 1; i < length; i++) {
            int count = 0;
            int currentKey = nums[i];
            if (!map.containsKey(currentKey)) {
                continue;
            }
            while (map.containsKey(currentKey)) {
                count++;
                map.remove(currentKey);
                currentKey++;
            }
            currentKey = nums[i] -1;
            while (map.containsKey(currentKey)) {
                count++;
                map.remove(currentKey);
                currentKey--;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
