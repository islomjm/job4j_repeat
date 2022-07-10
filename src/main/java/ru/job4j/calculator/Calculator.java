package ru.job4j.calculator;

public class Calculator {
//    public static void main(String[] args) {
//        int one = 1;
//        int two = 2;
//        int onePlusTwo = one + two;
//        int six = 6;
//        int four = 4;
//        int five = 5;
//        int sixDivTwo = six / two;
//        int fiveMinusTwo = five - two;
//        int fourTimeTwo = four * two;
//        System.out.println(onePlusTwo);
//        System.out.println(fiveMinusTwo);
//        System.out.println(sixDivTwo);
//        System.out.println(fourTimeTwo);
//        int ten = 10;
//        int eleven = 11;
//        int tenPlusEleven = ten + eleven;
//        System.out.println(tenPlusEleven);
//        int age = 18;
//        System.out.println(age);
//        age = 19;
//        System.out.println(age);
//        int result = one + two;
//        System.out.println(result);
//        one = 12;
//        two = 22;
//        result = one + two;
//        System.out.println(result);
//    }

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator.plus(4, 5);
        Calculator.plus(15, 16);
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}
