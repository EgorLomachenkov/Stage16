package by.itstep.lomachenkov.stage16.util;

public class MatrixUI {
    public static String toString(int[][] matrix) {
        return String.format("Matrix:\n%s", convert(matrix));
    }

    private static String convert(int[][] matrix) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                builder.append(matrix[i][j]).append(" ");
            }

            builder.append("\n");
        }

        return builder.toString();
    }
}
