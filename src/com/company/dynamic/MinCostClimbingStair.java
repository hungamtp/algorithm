package com.company.dynamic;

public class MinCostClimbingStair {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairsOptimized(new int[]{5,18,4,15,6}));
    }
    public static int minCostClimbStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        }
        return dp[cost.length-1];
    }

    public static int minCostClimbingStairsOptimized(int[] cost) {
        int firstPlace = cost[0];
        int secondPlace = cost[1];
        int temp =0;
        for (int i = 2; i < cost.length; i++) {
            temp = Math.min(firstPlace, secondPlace) + cost[i];
            firstPlace = secondPlace;
            secondPlace = temp;
        }
        return Math.min(firstPlace, secondPlace);
    }
}
