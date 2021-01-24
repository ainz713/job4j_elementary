package ru.job4j.array;

import java.util.Collections;

public class Defragment {
    public static String[] compress(String[] array) {
        int nullIndex = 0;
        int notNullIndex = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                nullIndex = index;
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        notNullIndex = i;
                        break;
                    }
                }
                swap(array, nullIndex, notNullIndex);
            }
        }
        return array;
    }

    private static void swap(String[] array, int nullIndex, int notNullIndex) {
        String temp = "";
        temp = array[nullIndex];
        array[nullIndex] = array[notNullIndex];
        array[notNullIndex] = temp;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
