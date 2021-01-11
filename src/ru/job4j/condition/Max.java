package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Наибольшее число среди 1 и 2: " + Max.max(1, 2));
        System.out.println("Наибольшее число среди 2 и 1: " + Max.max(2, 1));
        System.out.println("Наибольшее число среди 1 и 1: " + Max.max(1, 1));
    }
}
