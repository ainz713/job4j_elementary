package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > result && third > result) {
            result = third;
        }
        if (second > result && second > third) {
            result = second;
        }
        return result;
    }
}
