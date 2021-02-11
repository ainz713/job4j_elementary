package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int temp;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] > right[j]) {
                    temp = left[i];
                    left[i] = right[j];
                    right[j] = temp;
                }
            }
        }
            for (int j = 0; j < left.length; j++) {
                rsl[j] = left[j];
            }
           for (int k = 0; k < right.length; k++) {
                rsl[rsl.length - 1 - k] = right[max(right)];
               right[max(right)] = 0;
            }
        return rsl;
    }

    public static int max(int[] left) {
        int max = left[0];
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            if (max < left[i]) {
                max = left[i];
                index = i;
            }
        }
        return index;
    }
}
