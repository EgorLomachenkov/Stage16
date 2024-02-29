package by.itstep.lomachenkov.stage16.additionaltask.model;

public class MatrixLogic {
    public static String checkMatrix(int[][] matrix) {
        boolean isLower = isLowerTriangle(matrix);
        boolean isUpper = isUpperTriangle(matrix);

        String str = "neither upper nor lower";

        if (isLower && isUpper) {
            return str;
        }

        str = isUpper ? "upper" : str;
        str = isLower ? "lower" : str;

        return str;
    }
    private static boolean isUpperTriangle(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isLowerTriangle(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
