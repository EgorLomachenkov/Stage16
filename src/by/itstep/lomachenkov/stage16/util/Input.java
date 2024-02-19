package by.itstep.lomachenkov.stage16.util;

import java.util.Scanner;

public class Input {
    private static final Scanner SCN;

    static {
        SCN = new Scanner(System.in);
    }
    public static int input() {
        return SCN.nextInt();
    }
}
