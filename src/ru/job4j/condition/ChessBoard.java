package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = Math.abs(x1 - x2);
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            return rsl;
        }
            return 0;

    }
}
