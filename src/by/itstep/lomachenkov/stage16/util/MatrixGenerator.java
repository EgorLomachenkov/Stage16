package by.itstep.lomachenkov.stage16.util;

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

    public static int[][] createMatrix(int rows, int columns) {
        return new int[rows][columns];
    }

    public static void initMatrixByUser(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Input.input();
            }
        }
    }
}
