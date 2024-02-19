package by.itstep.lomachenkov.stage16.task2.controller;

import by.itstep.lomachenkov.stage16.task2.model.MatrixLogic;
import by.itstep.lomachenkov.stage16.task2.view.ResultUI;
import by.itstep.lomachenkov.stage16.util.Input;
import by.itstep.lomachenkov.stage16.util.MatrixGenerator;
import by.itstep.lomachenkov.stage16.util.MatrixUI;
import by.itstep.lomachenkov.stage16.view.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.print("This program displays the column numbers, " +
                "which elements form monotonic sequence\n");

        int rows;
        int columns;

        do {
            Printer.print("Enter the matrix size(rows, columns): ");
            rows = Input.input();
            columns = Input.input();
        } while (rows <= 0 && columns <= 0);

        int[][] matrix = MatrixGenerator.createMatrix(rows, columns);

        MatrixGenerator.initMatrix(matrix);

        Printer.print(MatrixUI.format(matrix));

        String msg = MatrixLogic.getColumnNumbersWithSequence(matrix);

        Printer.print(ResultUI.format(msg));
    }
}
