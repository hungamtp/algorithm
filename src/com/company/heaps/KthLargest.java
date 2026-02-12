package com.company.heaps;

import com.company.heaps.myHeap.MyHeap;

public class KthLargest {
    public static void main(String[] args) {

    }

    public static int findKthLargestUsingHeap(int[] nums, int k) {
        MyHeap heap = new MyHeap();
        for (int i = 0; i < nums.length; i++) {
            heap.insert(nums[i]);
        }

        for (int i = 1; i < k; i++) {
            heap.remove();
        }
        return heap.getHeap().get(0);
    }
}
