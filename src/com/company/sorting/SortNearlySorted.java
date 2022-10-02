package com.company.sorting;

//https://www.geeksforgeeks.org/nearly-sorted-algorithm/?ref=lbp
public class SortNearlySorted {
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        int arr1[] = {10, 9, 8, 7, 4, 70, 60, 50};
        int k1 = 4;
        solve(arr , k);
        solve(arr1 , k1);
    }
    public static int[] solve(int number[]  , int k){
        for(int i = 0 ; i < (k+1)/2 ; i++){
            int temp = number[i];
            number[i] = number[k-i];
            number[k-i] = temp;
        }
        for (int i = k +1; i < number.length  ; i++){
            for (int j = i+1 ; j < number.length ; j++){
                if(number[i] > number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        return number;
    }
}
