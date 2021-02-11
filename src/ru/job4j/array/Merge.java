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
            for (int j = 0; j < left.length; j++) {
                rsl[j] = left[j];
            }
           for (int k = 0; k < right.length; k++) {
                rsl[left.length + k] = right[k];
            }
        return rsl;
    }
}
