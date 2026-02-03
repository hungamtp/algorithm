package com.company.HashTable;

import java.util.*;

public class SubSumArray {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2, 3, 3, 3, 4, 4, 5});
    }

    public static String sumSubArrayEqualK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                return i + " to " + (map.get(sum - k) + 1);
            } else {
                map.put(sum, i);
            }
        }
        return "-1";
    }

    public static void removeDuplicates(int[] nums) {
        int availableIndex = 1;
        int currentNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentNum) {
                nums[availableIndex] = nums[i];
                currentNum = nums[i];
                availableIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
