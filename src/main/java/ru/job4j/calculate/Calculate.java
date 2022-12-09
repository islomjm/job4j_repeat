package ru.job4j.calculate;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        char operand = scanner.next().charAt(0);
        int two = scanner.nextInt();
        Operations operations = new Operations();

        switch (operand) {
            case '*':
                operations.multiply(one, two);
                break;
            case '/':
                operations.division(one, two);
                break;
            case '-':
                operations.minus(one, two);
                break;
            case '+':
                operations.plus(one, two);
                break;
            default:
                System.out.println("не выполнено условие");
        }

    }
}
