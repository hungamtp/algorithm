package com.company.prefixSum;

public class LeastImpactDNA {
    public static void main(String[] args) {

        System.out.println('A');
        System.out.println('C');
        System.out.println('G');
        System.out.println('T');
    }

    public int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        int M = P.length;

        int[][] prefixSums = new int[3][N + 1];

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            prefixSums[0][i + 1] = prefixSums[0][i];
            prefixSums[1][i + 1] = prefixSums[1][i];
            prefixSums[2][i + 1] = prefixSums[2][i];

            if (c == 'A') prefixSums[0][i + 1]++;
            else if (c == 'C') prefixSums[1][i + 1]++;
            else if (c == 'G') prefixSums[2][i + 1]++;
        }

        int[] result = new int[M];
        for (int k = 0; k < M; k++) {
            int start = P[k];
            int end = Q[k] + 1;
            if (prefixSums[0][end] - prefixSums[0][start] > 0) {
                result[k] = 1;
            } else if (prefixSums[1][end] - prefixSums[1][start] > 0) {
                result[k] = 2;
            } else if (prefixSums[2][end] - prefixSums[2][start] > 0) {
                result[k] = 3;
            } else {
                result[k] = 4;
            }
        }

        return result;
    }
}
