package com.company.slidingWindow;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 0, 2, 2, 5};
        int[] arr2 = new int[]{2, 2, 0, -4, 2, 2, 4, 2, 8, 7, 0, 2, 1, 1, 2, 3, 1, 0, 0, 4, 0, 0};
        System.out.println(findSumEqualToK(arr1, 4, 3));
        System.out.println(findSumEqualToK(arr2, 4, 3));
        System.out.println(findSumEqualToK(arr2, 4, 2));

        System.out.println(findMaxInRangK(arr1, 3));
        System.out.println(findMaxInRangK(arr2, 3));
        System.out.println(findMaxInRangK(arr2, 4));

    }


    public static int findSumEqualToK(int[] arr, int sum, int k) {
        if (arr.length == 0) {
            return 0;
        }
        int count = 0;
        int firstSum = 0;
        for (int i = 0; i < k; i++) {
            firstSum += arr[i];
        }
        if (firstSum == sum) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {

            firstSum += arr[i];
            firstSum -= arr[i - k];
            if (firstSum == sum) {
                count++;
            }
        }
        return count;
    }

    public static int findMaxInRangK(int[] arr, int k) {
        if (arr.length == 0) {
            return 0;
        }
        int max = 0;
        int temp = 0;
        for (int i = 0; i < k; i++) {
            max += arr[i];
        }
        temp = max;
        for (int i = k; i < arr.length; i++) {
            temp += arr[i];
            temp -= arr[i - k];
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
