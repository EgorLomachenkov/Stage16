package by.itstep.lomachenkov.stage16.util;

public class ResultUI {
    public static String formatSum(int sum) {
        return String.format("The sum: %d", sum);
    }

    public static String formatColumns(String msg) {
        msg = msg.isEmpty() ? "There aren't such columns."
                : msg.substring(0, msg.length() - 2);

        return String.format("Column numbers, " +
                "which elements form a sequence: %s.", msg);
    }

    public static String formatMax(int max) {
        return String.format("The maximum is: %d", max);
    }

    public static String formatRows(int rowNumber) {
        return String.format("The row number: %d", rowNumber);
    }

    public static String formatElements(int maxAmount) {
        return String.format("The max increasing elements amount: %d", maxAmount);
    }

    public static String formatTest(boolean test) {
        return test ? "The algorithm works properly" : "The algorithm works incorrect";
    }
}
