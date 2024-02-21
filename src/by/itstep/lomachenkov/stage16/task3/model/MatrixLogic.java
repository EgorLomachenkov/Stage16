package by.itstep.lomachenkov.stage16.task3.model;

public class MatrixLogic {
    //O(N^2)
    public static int getMaxElement(int[][] matrix) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            if (isIncreaseSeq(matrix[i]) || isDecreaseSeq(matrix[i])) {
                max = getRowMaxElement(matrix[i]) > max ?
                        getRowMaxElement(matrix[i]) : max;
            }
        }

        return max;
    }

    //O(N)
    private static int getRowMaxElement(int[] row) {
        int max = row[0];

        for (int i = 1; i < row.length; i++) {
            max = row[i] > max ? row[i] : max;
        }

        return max;
    }

    //O(N)
    private static boolean isIncreaseSeq(int[] row) {
        for (int i = 1; i < row.length; i++) {
            if (row[i] <= row[i - 1]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isDecreaseSeq(int[] row) {
        for (int i = 1; i < row.length; i++) {
            if (row[i] >= row[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
