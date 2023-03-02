package com.company.leetcode.level1;

//https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1
public class FindPivotIndex {
    public static void main(String[] args) {
        int arr1[] = {1, 7, 3, 6, 5, 6};
        int arr2[] = {1, 2, 3};
        int arr3[] = {2,1,-1};
        int arr4[] = {0,0,0};
        System.out.println(pivotIndex(arr1));
        System.out.println(pivotIndex(arr2));
        System.out.println(pivotIndex(arr3));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}

