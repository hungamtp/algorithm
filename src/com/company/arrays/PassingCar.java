package com.company.arrays;

public class PassingCar {
    public static void main(String[] args) {

    }

    public int solution(int[] arr) {
        int count =0;
        int currentZeros =0;
        for (int value : arr) {
            if (value  ==0){
                currentZeros++;
            } else {
                count += currentZeros;
                if (count > 1000000000) {
                    return -1;
                }
            }
        }
        return count;
    }
}
