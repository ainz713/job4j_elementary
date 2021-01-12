package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= result && second >= third) {
            return second;
        } else if (third >= result && third >= second) {
            return third;
        }
        return result;
    }
}
