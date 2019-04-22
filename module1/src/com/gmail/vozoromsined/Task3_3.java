package com.gmail.vozoromsined;

import java.util.Scanner;

public class Task3_3 {
    /*Задание 3.3
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью
закрыть круглой картонкой радиусом r. Используйте класс java.io.Console для ввода значений a, b, r.*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Insert a: ");
        int a=scanner.nextInt();
        System.out.print("Insert b: ");
        int b=scanner.nextInt();
        System.out.print("Insert r: ");
        int r=scanner.nextInt();
        if(a*a+b*b<=r*2){
            System.out.println("Cower");
        }
        else
            System.out.println("Not cover");
    }
}
