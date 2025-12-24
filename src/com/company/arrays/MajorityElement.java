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
            map.put(num, map.getOrDefault(num, 0) + 1);
            int count = map.get(num);
            if (count > max) {
                max = count;
                majorityNumber = num;
            }
        }


        return majorityNumber;
    }

    // Voting
    public int majorityElementVoting(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
