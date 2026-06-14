package com.company.dynamic;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(lcs("stoner", "tower"));
    }


    /**
     * Dynamic Programming grid for finding the Longest Common Subsequence (LCS)
     * between the strings "STONE" and "TOWER".
     * * Ø   T   O   W   E   R
     * +---+---+---+---+---+---+
     * Ø | 0 | 0 | 0 | 0 | 0 | 0 |
     * +---+---+---+---+---+---+
     * S | 0 | 0 | 0 | 0 | 0 | 0 |
     * +---+---+---+---+---+---+
     * T | 0 | 1 | 1 | 1 | 1 | 1 |
     * +---+---+---+---+---+---+
     * O | 0 | 1 | 2 | 2 | 2 | 2 |
     * +---+---+---+---+---+---+
     * N | 0 | 1 | 2 | 2 | 2 | 2 |
     * +---+---+---+---+---+---+
     * E | 0 | 1 | 2 | 2 | 3 | 3 |
     * +---+---+---+---+---+---+
     * * Resulting LCS Length: 3 (Matching characters: 'T', 'O', 'E')
     */
    public static int lcs(String s1, String s2) {
        int[] prv = new int[s2.length() + 1];
        int[] current = new int[s2.length() + 1];
        for(int i =1;i<=s1.length();i++){
            for(int j =1;j<=s2.length();j++){
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    current[j] = prv[j-1]+1;
                }else{
                    current[j] = Math.max(prv[j],current[j-1]);
                }
            }
            prv = current;
            current = new int[s2.length() + 1];
        }
        return prv[s2.length()];
    }
}
