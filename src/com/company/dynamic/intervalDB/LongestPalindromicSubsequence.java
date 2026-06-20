package com.company.dynamic.intervalDB;

public class LongestPalindromicSubsequence {

    // Example: comparing "TOTAL" against "TOTAL" (length 5)
//
// dp[i][j] grid — rows and columns both indexed 0..4,
// representing positions in the string "TOTAL":
//
//          j=0   j=1   j=2   j=3   j=4
//          (T)   (O)   (T)   (A)   (L)
//        +-----+-----+-----+-----+-----+
// i=0 (T)|  1  |  0  |  0  |  0  |  0  |
//        +-----+-----+-----+-----+-----+
// i=1 (O)|  0  |  1  |  0  |  0  |  0  |
//        +-----+-----+-----+-----+-----+
// i=2 (T)|  0  |  0  |  1  |  0  |  0  |
//        +-----+-----+-----+-----+-----+
// i=3 (A)|  0  |  0  |  0  |  1  |  0  |
//        +-----+-----+-----+-----+-----+
// i=4 (L)|  0  |  0  |  0  |  0  |  1  |
//        +-----+-----+-----+-----+-----+

    public static void main(String[] args) {
        System.out.println(longestPalinSubseq("bbbab")); // 4
        System.out.println(longestPalinSubseq("cbbd"));  // 2
        System.out.println(longestPalinSubseq("tttttttttt"));  // 2
    }

    public static int longestPalinSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {

                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }

}