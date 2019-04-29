package com.gmail.vozoromsined;

import java.util.Scanner;

    /*Задание 5.3
    Имеется целое число, введенное в клавиатуры, определить является ли это число
    простым, т.е. делится без остатка только на 1 и себя.*/

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Incert number: ");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count >= 3) {
            System.out.println("not");
        } else
            System.out.println("yes");
    }

}
