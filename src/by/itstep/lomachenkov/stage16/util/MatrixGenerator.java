package by.itstep.lomachenkov.stage16.util;

import java.util.Arrays;
import java.util.Random;

public class MatrixGenerator {
    private static final Random RND;

    static {
        RND = new Random();
    }

    public static void initMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = RND.nextInt(-10, 5);
            }
        }
    }

    public static void initVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = RND.nextInt(-100000, 100000);

        }

        Arrays.sort(vector);
    }



    public static int[][] createMatrix(int rows, int columns) {
        return new int[rows][columns];
    }

    public static int[] createVector(int size) {
        return new int[size];
    }

    public static int[] createVector(int[] vector1, int[] vector2) {
        return new int[vector1.length + vector2.length];
    }

    public static void initMatrixByUser(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Input.input();
            }
        }
    }
}
