package com.company.sorting;

//https://www.geeksforgeeks.org/sort-an-array-according-to-absolute-difference-with-given-value/?ref=lbp
public class SortAccordingAbsoluteDifference {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 9, 2};
        solve(arr, 7);
    }

    public static int[] solve(int number[], int n) {
        for(int i = 0; i< number.length ; i++){
            for (int j = i +1 ; j< number.length ;j++){
                 if(Math.abs(number[i] - n) > Math.abs(number[j] - n)){
                     int temp = number[i];
                     number[i]= number[j];
                     number[j] = temp;
                 }
            }
        }
        return number;
    }
}
