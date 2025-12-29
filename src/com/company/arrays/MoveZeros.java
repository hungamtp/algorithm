package com.company.arrays;

import java.util.*;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeros {
    public static void main(String[] args) {

        // [1,1,1,0,0,3]
        //[0,1,0,3,12]
        moveZeroes(new int[]{0,0,3,0,5,1,0});
    }

    public static void moveZeroes(int[] nums) {

        if (nums.length == 0) return;
        int temp = 0;
        int currentAvailable = 0;

        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] != 0 ) {
                temp = nums[i];
                nums[i] = 0;
                nums[currentAvailable] = temp;
                currentAvailable++;
            }
        }
    }
}
