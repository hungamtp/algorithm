package com.company.algorithm.slidingWindow;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 4, 3};
        int[] arr2 = new int[]{1, 4, 4};
        int[] arr3 = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(minSubArrayLen(7, arr));
        System.out.println(minSubArrayLen(4, arr2));
        System.out.println(minSubArrayLen(11, arr3));
    }


    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0;
        int res = Integer.MAX_VALUE;

        for (right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public static int minSubArrayLenLeetCode(int target, int[] nums) {
        int left = 0, right = 0, sumOfCurrentWindow = 0;
        int res = Integer.MAX_VALUE;

        for (right = 0; right < nums.length; right++) {
            sumOfCurrentWindow += nums[right];

            while (sumOfCurrentWindow >= target) {
                res = Math.min(res, right - left + 1);
                sumOfCurrentWindow -= nums[left++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }

    //log(n2)
    public static int minSubArrayLenLogn2(int target, int[] nums) {
        int numsLenth = nums.length, tempSum = 0;

        for (int i = 1; i <= numsLenth; i++) {
            for (int j = i - 1; j < numsLenth; j++) {
                if (j == i - 1) {
                    tempSum = 0;
                    for (int x = 0; x < i; x++) {
                        tempSum += nums[x];
                    }
                    if (tempSum >= target) {
                        return i;
                    }
                    continue;
                }
                tempSum += nums[j];
                tempSum -= nums[j - i];
                if (tempSum >= target) {
                    return i;
                }
            }
        }
        return 0;
    }


}
