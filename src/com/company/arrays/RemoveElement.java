package com.company.arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1,2,3,3,5}, 3));
    }

    public static int removeElement(int[] nums, int val) {

        int currentAvailable  = 0;
        int temp= 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] != val) {
                temp = nums[i];
                nums[i] = 0;
                nums[currentAvailable] = temp;
                currentAvailable++;
            }
        }
        return currentAvailable;
    }
}
