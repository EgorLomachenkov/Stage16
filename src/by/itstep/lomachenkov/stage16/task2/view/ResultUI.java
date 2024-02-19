package by.itstep.lomachenkov.stage16.task2.view;

public class ResultUI {
    public static String format(String msg) {
        msg = msg.isEmpty() ? "There aren't such columns."
                : msg.substring(0, msg.length() - 2);

        return String.format("Column numbers, " +
                "which elements form a sequence: %s.", msg);
    }
}
