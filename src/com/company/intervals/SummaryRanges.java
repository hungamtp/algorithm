package com.company.intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
//        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
//        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
        System.out.println(summaryRanges(new int[]{-2147483648, 0, 2, 3, 4, 6, 8, 9}));
        System.out.println(Math.abs(-123));
        System.out.println(Math.abs(Math.abs(1) - Math.abs(-123)));
    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }
        int startIndex = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 != nums[i]) {
                if (startIndex == nums[i - 1]) {
                    result.add(String.valueOf(startIndex));
                } else {
                    result.add(startIndex + "->" + nums[i - 1]);
                }
                startIndex = nums[i];
            }
        }
        if (startIndex == nums[nums.length - 1]) {
            result.add(String.valueOf(startIndex));
        } else {
            result.add(startIndex + "->" + nums[nums.length - 1]);
        }
        return result;
    }
}
