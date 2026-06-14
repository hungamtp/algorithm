package com.company.dynamic;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        System.out.println(nThTribonacciNumber(25));
    }
    public static int nThTribonacciNumber(int n){
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr[n];
    }
}
