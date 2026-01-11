package com.company.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[103];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = i;
        }
        int x = 55;
        System.out.println(binarySearch(arr, x));
    }
    public static boolean binarySearch(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == x) return true;
            if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
