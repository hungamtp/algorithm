package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] nums2 = {5};
        int[] nums3 = {-1};
        sortedSquares(nums);
        sortedSquares(nums2);
        sortedSquares(nums3);
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
        }

        return result;
    }
}
