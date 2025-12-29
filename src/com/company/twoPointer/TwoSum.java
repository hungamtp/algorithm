package com.company.twoPointer;


import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 5, 7, 15}, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 2){
            return new int[]{1,2};
        }
        int left = 0;
        int right = numbers.length - 1;
        int currentSum = 0;
        while (left < right) {
            currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                break;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{left+1, right+1};
    }
}
