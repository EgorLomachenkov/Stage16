package by.itstep.lomachenkov.stage16.task1.controller;

import by.itstep.lomachenkov.stage16.task1.model.MatrixLogic;
import by.itstep.lomachenkov.stage16.util.ResultUI;
import by.itstep.lomachenkov.stage16.util.Input;
import by.itstep.lomachenkov.stage16.util.MatrixGenerator;
import by.itstep.lomachenkov.stage16.util.MatrixUI;
import by.itstep.lomachenkov.stage16.view.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.print("This program displays the sum of the elements" +
                " located between two first positive elements in each row\n");

        int rows;
        int columns;

        do {
            Printer.print("Enter the size of matrix(rows, columns): ");
            rows = Input.input();
            columns = Input.input();
        } while (rows <= 0 && columns <= 0);

        int[][] matrix = MatrixGenerator.createMatrix(rows, columns);

        MatrixGenerator.initMatrix(matrix);

        int sum = MatrixLogic.getElementsSum(matrix);

        Printer.print(MatrixUI.toString(matrix));

        Printer.print(ResultUI.formatSum(sum));

    }
}
