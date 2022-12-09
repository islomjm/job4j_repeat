package ru.job4j.calculate;

public class Operations {
    public int multiply(int one, int two) {
        int resultMulty =  one * two;
        System.out.println("Результат умножения " + resultMulty);
        return resultMulty;
    }

    public int division(int one, int two) {
        int resultDiv = one / two;
        System.out.println("Результат деления " + resultDiv);
        return resultDiv;
    }

    public int minus(int one, int two) {
        int resultMinus = one - two;
        System.out.println("Результат вычитания " + resultMinus);
        return resultMinus;
    }

    public int plus(int one, int two) {
        int resultPlus = one + two;
        System.out.println("Результат сложения " + resultPlus);
        return resultPlus;
    }
}
