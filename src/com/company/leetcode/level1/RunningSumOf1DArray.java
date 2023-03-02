package com.company.leetcode.level1;

//https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {1,1,1,1,1};
        int arr3[] = {3,1,2,10,1};
        
    }

    public int[] runningSum(int[] nums) {
        
        for (int i = 1; i < nums.length; i++) {
            
            nums[i]  += nums[i-1];
        }
        return nums;
    }
}

