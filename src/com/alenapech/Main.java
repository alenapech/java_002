package com.alenapech;

import java.util.Scanner;

public class Main {

//    1 - Напишите программу, чтобы проверить, содержит ли данная строка только цифры.(с возможностью ввода или нет
//    решайте сами)
//    2 - Напишите программу для объединения данной строки с самим собой заданное количество раз(количество и строку
//    мы вводим)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input string: ");
        String input = in.nextLine();
        System.out.println("Is there only digits: " + isThereOnlyDigits(input));

        System.out.print("Input string: ");
        input = in.nextLine();
        System.out.print("Input count: ");
        int n = in.nextInt();
        System.out.println("Result: " + concatString(input, n));
    }

    private static String concatString(String input, int n) {
        String result = input;
        for (int i = 0; i < n; i++) {
            result = result.concat(input);
        }
        return result;
    }

    private static boolean isThereOnlyDigits(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)))
                return false;
        }
        return true;
    }

}
