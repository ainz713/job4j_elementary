package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int temp;
        if (left.length != 0 && left[left.length - 1] > right[0]) {
            temp = right[0];
            right[0] = left[left.length - 1];
            left[left.length - 1] = temp;
        }
        for (int i = 0; i < rsl.length; i++) {
            System.arraycopy(left, 0, rsl, 0, left.length);
            System.arraycopy(right, 0, rsl, left.length, right.length);
        }
        return rsl;
    }
}
