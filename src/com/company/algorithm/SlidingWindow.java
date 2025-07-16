package com.company.algorithm;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,0,2,2,5};
        int[] arr2 = new int[]{2,2,0,-4,2,2,4,2,8,7,0,2,1,1,2,3,1,0,0,4,0,0};
        System.out.println(slidingWindow(arr1,4,3));
        System.out.println(slidingWindow(arr2,4,3));
        System.out.println(slidingWindow(arr2,4,2));

    }

    public static int slidingWindow(int[] arr, int sum, int k) {
        if (arr.length == 0) {
            return 0;
        }
        int count = 0;
        int firstSum = 0;
        for (int i=0  ; i < k ; i++){
            firstSum += arr[i];
        }
        if (firstSum == sum){
            count ++;
        }
        for (int i = k; i < arr.length ; i++){

            firstSum += arr[i];
            firstSum -= arr[i-k];
            if (firstSum == sum){
                count ++;
            }
        }
        return count;
    }
}
