package by.itstep.lomachenkov.stage16.task4.model;

public class MatrixLogic {
    //O(N * M)
    public static int getRowWithGreatestSeqNumber(int[][] matrix) {
        int rowNumber = 0;
        int maxSequence = 0;

        for (int i = 0; i < matrix.length; i++) {
            int count = countEqualElements(matrix[i]);

            if (maxSequence < count) {
                maxSequence = count;
                rowNumber = i + 1;
            }
        }

        return rowNumber;
    }
    //O(N)

    private static int countEqualElements(int[] row) {
        int count = 1;
        int holder = count;

        for (int i = 1; i < row.length; i++) {
            if (row[i] == row[i - 1]) {
                count++;
            } else {
                holder = count > holder ? count : holder;
                count = 1;
            }
        }

        return count > holder ? count : holder;
    }
}
