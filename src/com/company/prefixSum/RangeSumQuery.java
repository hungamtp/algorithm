package com.company.prefixSum;

public class RangeSumQuery {
    public static void main(String[] args) {

    }

    static class NumArray {
        int[] sums;
        int[] prefixSums;

        public NumArray(int[] nums) {
            this.sums = nums;
            this.prefixSums = new int[nums.length];
            this.prefixSums[0] = sums[0];
            for (int i = 1; i < nums.length; i++) {
                this.prefixSums[i] = nums[i] + prefixSums[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            if (left == 0) return this.prefixSums[right];

            return this.prefixSums[right] - this.prefixSums[left-1];
        }
    }
}
