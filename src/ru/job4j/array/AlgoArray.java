package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[0] > array[i]) {
                min = array[i];
                array[i] = array[0];
                array[0] = min;
            }
        }
        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                i = 0;
            }
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
