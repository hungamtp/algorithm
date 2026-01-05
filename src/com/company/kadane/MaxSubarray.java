package com.company.kadane;

//https://leetcode.com/problems/maximum-subarray/
public class MaxSubarray {
    public static void main(String[] args) {

    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
