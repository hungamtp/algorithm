package com.company.leetcode.level1;

//https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1
public class FindPivotIndex {
    public static void main(String[] args) {
        int arr1[] = {1, 7, 3, 6, 5, 6};
        int arr2[] = {1, 2, 3};
        int arr3[] = {-1, 1, 2};
        System.out.println(pivotIndex(arr2));
    }

    public static int pivotIndex(int[] nums) {
        int numsLength = nums.length;
        if (numsLength == 0) {
            return 0;
        }

        if (numsLength == 1) {
            return 0;
        }
        if (numsLength == 2) {
            if (nums[0] == nums[1]) {
                return 1;
            } else {
                return -1;
            }
        }

        int sumLeft = nums[0];
        int sumRight = nums[numsLength - 1];
        int rightIndex = numsLength - 1;
        int leftIndex = 0;


        while (true) {
            if (sumLeft == sumRight) {
                if (leftIndex == rightIndex - 2) {
                    return leftIndex + 1;
                } else if (leftIndex == rightIndex) {
                    return leftIndex;
                }
            } else if (sumLeft < sumRight) {
                sumLeft += nums[leftIndex + 1];
                leftIndex++;
            } else if (sumLeft > sumRight) {
                sumRight += nums[rightIndex - 1];
                rightIndex--;
            }
        }
    }
}

