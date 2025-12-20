package com.company.arrays;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static void main(String[] args) {

    }

    // O(n)
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int majorityNumber = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            int count = map.getOrDefault(num, 0);
            if (count > max) {
                max = count;
                majorityNumber = num;
            }
        }


        return majorityNumber;
    }
}
