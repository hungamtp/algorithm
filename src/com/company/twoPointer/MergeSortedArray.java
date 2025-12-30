package com.company.twoPointer;

//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray {
    public static void main(String[] args) {
        //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1, nums2 and the end of merged array
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;


        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p--] = nums2[p2--];
        }
    }

}
