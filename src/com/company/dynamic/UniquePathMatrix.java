package com.company.dynamic;

public class UniquePathMatrix {
    public static void main(String[] args) {
        System.out.println(calculateUniquePath(3,3));
    }

    public static int calculateUniquePath(int n , int m){
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n ; i++) {
            matrix[i][0] = 1;
        }
        for (int i = 0; i < m ; i++) {
            matrix[0][i] = 1;
        }
        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < m; j++) {
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
