package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
public class BestTimeBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4, 7, 8}));
        System.out.println(maxProfit2(new int[]{7, 1, 5, 3, 6, 4, 7, 8}));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    // Peek valley
    public static int maxProfit2(int[] prices) {
        int profit = 0;
        int buyPrice = 0;
        int sellPrice = 0;
        int i = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] > prices[i + 1]) {
                i++;
            }
            buyPrice = prices[i];
            while (i < prices.length - 1 && prices[i] < prices[i + 1]) {
                i++;
            }
            sellPrice = prices[i];
            profit += sellPrice - buyPrice;

        }
        return profit;
    }
}
