package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Petr Arsentev2";
        names[2] = "Petr Arsentev3";
        names[3] = "Petr Arsentev4";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
