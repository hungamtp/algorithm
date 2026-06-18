package com.company.arrays;

public class JumpGame2 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 1, 3, 1, 1, 4, 1, 1, 1, 1}));
    }

    public static int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
