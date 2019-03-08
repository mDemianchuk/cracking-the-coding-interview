package com.demianchuk.chapter1;

public class MatrixRotation {
    public static void main(String[] args) {
        int length = 3;
        int[][] matrix = new int[length][length];

        fillOutMatrix(matrix);
        printMatrix(matrix);

        int[][] rotatedMatrix = matrixRotation(matrix);
        printMatrix(rotatedMatrix);

        int[][] inPlaceRotatedMatrix = inPlaceMatrixRotation(matrix);
    }

    public static int[][] inPlaceMatrixRotation(int[][] matrix) {
        //TODO
        return matrix;
    }

    public static int[][] matrixRotation(int[][] matrix) {
        int length = matrix.length;
        int[][] rotatedMatrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                rotatedMatrix[i][j] = matrix[length - 1 - j][i];
            }
        }

        return rotatedMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0, length = matrix.length; i < length; i++) {
            for (int j = 0; j < length; j++) {
                buffer.append(matrix[i][j]);
                buffer.append(" ");
            }
            buffer.append("\n");
        }
        System.out.println(buffer);
    }

    private static void fillOutMatrix(int[][] matrix) {
        int num = 1;
        for (int i = 0, length = matrix.length; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = num++;
            }
        }
    }
}
