package com.company.prefixSum;

public class SubarrayEqualToK {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1,1}, 2));
        System.out.println(subarraySum(new int[]{1, 2,3,3,4}, 3));
        System.out.println(subarraySum(new int[]{-1,-1,1}, 0));
    }


    public static int subarraySumUsingMap(int[] nums, int k) {
        int result = 0;
        return result;
    }
    
    public static int subarraySum(int[] nums, int k) {
        if (nums.length == 1 && nums[0] == k) return 1;

        if (nums.length == 0) return 0;
        int result = 0;
        int[] prefixSums = new int[nums.length];
        prefixSums[0] = nums[0];
        if (prefixSums[0] == k) {
            result++;
        }
        for (int i = 1; i < nums.length; i++) {
            prefixSums[i] = prefixSums[i - 1] + nums[i];
        }
        for (int i = 1; i < prefixSums.length; i++) {
            int currentSum = prefixSums[i];
            int left = 0;
            while (left <= i) {
                if (currentSum == k) {
                    result++;
                }
                if (left == 0) {
                    currentSum -= prefixSums[left];
                } else {
                    currentSum = currentSum - prefixSums[left] + prefixSums[left - 1];
                }
                left++;
            }
        }
        return result;
    }


}
