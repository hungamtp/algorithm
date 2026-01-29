package com.company.HashTable;

public class IsHappyNumber {
    public static void main(String[] args) {

    }


    public static int squareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {

        int slow = n;
        int fast = n;
        do
        {
            //  move slow number
            // by one iteration
            slow = squareSum(slow);

            //  move fast number
            // by two iteration
            fast = squareSum(squareSum(fast));

        }
        while (slow != fast);
        return slow == 1;
    }
}
