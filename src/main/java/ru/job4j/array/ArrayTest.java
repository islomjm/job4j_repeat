package ru.job4j.array;

public class ArrayTest {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "a";
        array[1] = "b";
        array[2] = "c";
        array[3] = "d";
        array[4] = "e";
        for (String v : array) {
            System.out.println(v);
        }
    }
}
