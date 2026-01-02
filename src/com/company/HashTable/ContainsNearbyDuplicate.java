package com.company.HashTable;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums.length <= 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
