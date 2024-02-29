package by.itstep.lomachenkov.stage16.additionaltask.controller;

import by.itstep.lomachenkov.stage16.additionaltask.model.MatrixLogic;
import by.itstep.lomachenkov.stage16.util.Input;
import by.itstep.lomachenkov.stage16.util.MatrixGenerator;
import by.itstep.lomachenkov.stage16.util.MatrixUI;
import by.itstep.lomachenkov.stage16.util.ResultUI;
import by.itstep.lomachenkov.stage16.view.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.print("This program checks whether is the matrix triangle " +
                "and if it is displays its type\n");

        int size;

        do {
            Printer.print("Enter the size of the matrix: ");
            size = Input.input();
        } while (size < 2);

        int[][] matrix = MatrixGenerator.createMatrix(size);

        MatrixGenerator.initMatrixByUser(matrix);

        String type = MatrixLogic.checkMatrix(matrix);

        Printer.print(MatrixUI.toString(matrix));

        Printer.print(ResultUI.formatTriangle(type));
    }
}
