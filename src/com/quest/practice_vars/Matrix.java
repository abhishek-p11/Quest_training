package com.quest.practice_vars;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i ;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
                System.out.print('\n');
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");

                }
        }
    }
}
