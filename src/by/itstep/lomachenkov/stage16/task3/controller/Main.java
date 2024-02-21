package by.itstep.lomachenkov.stage16.task3.controller;

import by.itstep.lomachenkov.stage16.task3.model.MatrixLogic;
import by.itstep.lomachenkov.stage16.task3.util.ResultUI;
import by.itstep.lomachenkov.stage16.util.Input;
import by.itstep.lomachenkov.stage16.util.MatrixGenerator;
import by.itstep.lomachenkov.stage16.util.MatrixUI;
import by.itstep.lomachenkov.stage16.view.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.print("This program displays the greatest element in the rows," +
                " that elements form a sequence.\n");

        int rows;
        int columns;

        do {
            Printer.print("Enter the matrix size(rows, columns): ");
            rows = Input.input();
            columns = Input.input();
        } while (rows <= 0 && columns <= 0);

        int[][] matrix = MatrixGenerator.createMatrix(rows, columns);

        MatrixGenerator.initMatrixByUser(matrix);

        int max = MatrixLogic.getMaxElement(matrix);

        Printer.print(MatrixUI.toString(matrix));

        Printer.print(ResultUI.format(max));
    }
}
