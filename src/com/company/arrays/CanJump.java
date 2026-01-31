package com.company.arrays;

public class CanJump {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 0, 1, 1, 4}));
    }


    public static boolean canJump(int[] nums) {
        int jump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > jump) {
                return false;
            }
            jump = Math.max(jump, i + nums[i]);
            if (jump >= nums.length) {
                return true;
            }
        }
        return true;
    }
}
