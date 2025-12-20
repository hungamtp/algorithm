package com.company.leetcode.level1;

// https://leetcode.com/problems/subarray-sum-equals-k/
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1,3,2,1}, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int result = 0;
        int left = 0;
        int right = 0;
        while (left != nums.length - 1 && right != nums.length - 1) {
            if (sum > k) {
                sum -= nums[left];
                left++;
            } else {
                sum += nums[right];
                right++;
            }

            if (sum == k) {
                result++;
                sum -= nums[left];
                sum += nums[right];
            }
        }
        return result;
    }
}
