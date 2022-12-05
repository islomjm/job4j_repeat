package ru.job4j;

public class Types {
    public static void main(String[] args) {
        byte b = 100;
        short s = b;
        int i = s;
        long l = i;
        System.out.println("Вывод в консоль значения после расширения: " + l);
        System.out.println();

        int i1 = 2_147_483_600;
        float f = i1;
        System.out.println("Вывод в консоль значения после переобразавания: " + f);
        System.out.println();

        int i2 = 10000;
       // byte b1 = i;  //этот код не будет компилироваться так как выходит за пределы занчения
       // short s1 = i; //этот код не будет компилироваться так как выходит за пределы занчения


        //Для того чтобы код скомпилировался произведем явное преобразование типов:
        int i3 = 10000;
        byte b2 = (byte) i3;
        short s2 = (short) i3;
        System.out.println("Вывод в консоль значения после преобразования: " + b2);
        System.out.println("Вывод в консоль значения после преобразования: " + s2);
        System.out.println();

        double d = 94.984751;
        int i4 = (int) d;
        System.out.println("Вывод в консоль значения после преобразования: " + i4);
        System.out.println();

        double d1 = 94.984751;
        int i5 = (int) Math.round(d1);
        System.out.println("Вывод в консоль значения после преобразования: " + i5);
        System.out.println();

        int i6 = 658;
        char c = (char) i6;
        System.out.println("Вывод в консоль значения после преобразования: " + c);
    }
}
