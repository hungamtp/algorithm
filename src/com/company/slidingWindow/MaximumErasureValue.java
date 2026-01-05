package com.company.slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumErasureValue {
    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(new int[]{187, 470, 25, 436, 538, 809, 441, 167, 477, 110, 275, 133, 666, 345, 411, 459, 490, 266, 987, 965, 429, 166, 809, 340, 467, 318, 125, 165, 809, 610, 31, 585, 970, 306, 42, 189, 169, 743, 78, 810, 70, 382, 367, 490, 787, 670, 476, 278, 775, 673, 299, 19, 893, 817, 971, 458, 409, 886, 434}));
        System.out.println(maximumUniqueSubarray(new int[]{1, 2, 3, 4, 12, 11, 100, 5, 4, 9, 10, 5}));
    }

    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int currentSum = 0;
        int result = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            while (map.contains(nums[right])) {
                map.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            currentSum += nums[right];
            map.add(nums[right]);
            result = Math.max(result, currentSum);
        }
        return result;
    }
}
