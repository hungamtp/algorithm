package com.company.arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length <= 2) return 0;
        int availableIndex = 1;
        int currentNum = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentNum) {
                currentNum = nums[i];
                nums[availableIndex] = currentNum;
                count = 1;
                availableIndex ++;
            } else {
                if (count < 2){
                    nums[availableIndex] = currentNum;
                    availableIndex ++;
                }
                count++;
            }
        }
        return availableIndex;
    }
}
