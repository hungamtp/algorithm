package com.company.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        //merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{4,5,6,0,0,0}, 3, new int[]{1,2,3}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p_merge = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums2[p2] > nums1[p1]) {
                nums1[p_merge] = nums2[p2];
                p_merge--;
                p2--;
            } else {
                nums1[p_merge] = nums1[p1];
                p_merge--;
                p1--;
            }
        }
        while (p2 >= 0) {
            nums1[p_merge] = nums2[p2];
            p_merge--;
            p2--;
        }
    }
}
