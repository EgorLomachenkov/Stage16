package by.itstep.lomachenkov.stage16.task5.model;

public class MatrixLogic {
    //O(N * M)
    public static int getGreatestIncreasingElementsAmount(int[][] matrix) {
        int maxAmount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int count = getAmountIncreasingElements(matrix[i]);

            if (maxAmount < count) {
                maxAmount = count;
            }
        }

        return maxAmount;
    }

    //O(N)
    private static int getAmountIncreasingElements(int[] row) {
        int count = 1;
        int holder = count;

        for (int i = 1; i < row.length; i++) {
            if (row[i] > row[i - 1]) {
                count++;
            } else {
                holder = count > holder ? count : holder;
                count = 1;
            }
        }

        return count > holder ? count : holder;
    }

}
