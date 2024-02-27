package by.itstep.lomachenkov.stage16.task6.controller;

import by.itstep.lomachenkov.stage16.task6.model.VectorLogic;
import by.itstep.lomachenkov.stage16.util.Input;
import by.itstep.lomachenkov.stage16.util.MatrixGenerator;
import by.itstep.lomachenkov.stage16.util.ResultUI;
import by.itstep.lomachenkov.stage16.view.Printer;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Printer.print("This program constructs the vector based on two input vectors\n");

        int size;

        do {
            Printer.print("Enter the size of the vectors" +
                    "(at least 1000 elements): ");
            size = Input.input();
        } while (size < 1000);

        int[] firstVector = MatrixGenerator.createVector(size);
        int[] secondVector = MatrixGenerator.createVector(size);

        MatrixGenerator.initVector(firstVector);
        MatrixGenerator.initVector(secondVector);

        int[] vector = VectorLogic.getNewVector(firstVector, secondVector);

        boolean test = VectorLogic.isIncreaseTest(vector);

        Printer.print(Arrays.toString(vector));
        Printer.print("\n" + ResultUI.formatTest(test));
    }
}
