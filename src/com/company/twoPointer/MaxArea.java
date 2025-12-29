package com.company.twoPointer;

public class MaxArea {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 3, 2, 5, 25, 24, 5}));
//        System.out.println(Math.abs(-4));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(Math.min(height[left], height[right]) * (right - left) , maxArea);
            if (height[left] < height[right]) {
                left ++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
