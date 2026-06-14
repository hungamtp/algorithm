package com.company.dynamic;

public class UniquePathMatrixWithObstacle {
    public static void main(String[] args) {
        int[][] matrix = new  int[][]{{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(calculateUniquePathWithObstacle(matrix));
    }

    public static int calculateUniquePathWithObstacle(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = -1;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != -1) {
                    matrix[i][j] =( matrix[i - 1][j] == -1 ? 0 : matrix[i - 1][j]) +( matrix[i][j - 1] == -1 ? 0 : matrix[i][j - 1]);
                }
            }
        }
        return matrix[matrix.length - 1][matrix[0].length - 1];
    }
}
