package com.company.dynamic;

public class ClimbingStair {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
