package com.gmail.vozoromsined;

import java.util.Scanner;

/*Задание 5.2
Введите с клавиатуры любое число, следует подсчитать сумму всех цифр данного числа и
вывести результат на экран. */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Incert the number: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Your sum: " + sum);

    }
}
