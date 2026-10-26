package com.company.arrays;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates2(nums));
    }
    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int lastNumber = nums[0];
        int availableIndex = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != lastNumber) {

                lastNumber = nums[i];
                nums[availableIndex] = nums[i];
                availableIndex++;
                count = 1;
            } else {
                if (count < 2) {
                    lastNumber = nums[i];
                    nums[availableIndex] = nums[i];
                    availableIndex++;
                }
                count++;
            }
        }
        return availableIndex;
    }
}
