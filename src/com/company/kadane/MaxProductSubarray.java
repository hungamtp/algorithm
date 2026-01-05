package com.company.kadane;

public class MaxProductSubarray {
    public static void main(String[] args) {

    }

    public static int maxProduct(int[] nums) {
        // track both min and max, min can turn to max if encounter negative number
        if (nums.length == 0) return 0;
        int min = nums[0];
        int max = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currentProduct = nums[i];
            int tempMax = max;
            max = Math.max(currentProduct, Math.max(min * currentProduct, max * currentProduct));
            min = Math.min(currentProduct, Math.min(min * currentProduct, tempMax * currentProduct));

            result = Math.max(result, max);
        }
        return result;
    }
}
