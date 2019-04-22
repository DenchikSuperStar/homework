package com.gmail.vozoromsined;

import java.util.Scanner;

public class Task3_4 {
    /*Задание 3.4
    Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число,
    добавив к нему слово «рублей» в правильном падеже. Используйте if и else, a так же
    класс java.io.Console для ввода значений целого числа.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Show me your money: ");
        int rub = scanner.nextInt();
        if (rub % 100 <= 20 && rub % 100 >= 11) {
            System.out.println(rub + " рублей");
        } else {
            if (rub % 10 == 1) {
                System.out.print(rub + " рубль");
            } else {
                if (rub % 10 >= 2 && rub % 10 <= 4) {
                    System.out.println(rub + " рубля");
                } else {
                    System.out.println(rub + " рублей");
                }
            }
        }
    }
}
