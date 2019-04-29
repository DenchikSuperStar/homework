package com.gmail.vozoromsined;

import java.util.Scanner;

public class Task3 {
    /*Задание 3.2
Введите число с клавиатуры в консоль JVM. Определите, является ли последняя
цифра числа семеркой. Выведите ответ в консоль.
*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Insert number: ");
        int num=scanner.nextInt();
        if(num%10==7)
            System.out.println("Last digit is 7");
        else
            System.out.println("Last digit is not 7");
    }
}
