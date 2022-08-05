package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rs = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rs = index;
                break;
            }
        }
        return rs;
    }
}
