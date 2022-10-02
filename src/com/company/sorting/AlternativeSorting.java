package com.company.sorting;

public class AlternativeSorting {
    public static void main(String[] args) {
        int arr[] = {7, 1, 2, 3, 4, 5, 6};
        solve(arr);
    }

    public static int[] solve(int numbers[]) {
        boolean max = true;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (max) {
                    if (numbers[i] < numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;

                    }
                } else {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }

            }
            max = !max;
        }
        return numbers;
    }
}
