package by.itstep.lomachenkov.stage16.task2.model;

public class MatrixLogic {
    // O(N * M), best case O(N)
    public static String getColumnNumbersWithSequence(int[][] matrix) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            if (isIncreaseSeq(matrix, i) || isDecreaseSeq(matrix, i)) {
                builder.append(i + 1).append(", ");
            }
        }


        return builder.toString();
    }

    //O(N)
    private static boolean isIncreaseSeq(int[][] matrix, int i) {
        for (int j = 1; j < matrix[i].length; j++) {
            if (matrix[j][i] <= matrix[j - 1][i]) {
                return false;
            }
        }

        return true;
    }

    //O(N)
    private static boolean isDecreaseSeq(int[][] matrix, int i) {
        for (int j = 1; j < matrix[i].length; j++) {
            if (matrix[j][i] >= matrix[j - 1][i]) {
                return false;
            }
        }

        return true;
    }

}
