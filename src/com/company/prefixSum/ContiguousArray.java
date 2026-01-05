package com.company.prefixSum;

import java.util.ArrayList;
import java.util.List;

public class ContiguousArray {
    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0, 1, 1, 1, 1, 1, 0, 0, 0}));
        System.out.println(findMaxLength(new int[]{0, 1, 1}));
        System.out.println(findMaxLength(new int[]{0, 1, 0}));
        System.out.println(findMaxLength(new int[]{0, 0}));
        System.out.println(findMaxLength(new int[]{0, 1}));
    }

    public static int findMaxLength(int[] nums) {
        if ( nums.length == 1) return 0;
        List<Integer> list = new ArrayList<>();
        int currentNumber = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentNumber) {
                count++;
            } else {
                list.add(count);
                count = 1;
                currentNumber = nums[i];
            }
            if (i == nums.length - 1) {
                list.add(count);
            }
        }
        int result = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            result = Math.max(result, Math.min(list.get(i), list.get(i + 1)) * 2);
        }
        return result;
    }
}
