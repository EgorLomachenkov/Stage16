package by.itstep.lomachenkov.stage16.task1.model;

public class MatrixLogic {
    // O(N*M)
    public static int getElementsSum(int[][] matrix) {
        int sum = 0;

        for (int[] row : matrix) {
            sum += getSumElementsInRow(row);
        }

        return sum;
    }

    private static int getSumElementsInRow(int[] row) {
        int sum = 0;
        int flag = 0;

        for (int i = 0; i < row.length; i++) {
            if (row[i] > 0) {
                flag++;
                continue;
            }

            sum += flag == 1 ? row[i] : 0;

            sum = (row[i] == row[row.length - 1] && flag == 1) ? 0 : sum;
        }

        return sum;
    }
}
