package com.gmail.vozoromsined;

import java.util.Scanner;

public class Task8 {
     /*Задание 4.3
     Используя цикл while, рассчитайте для введенного числа его факториал. Факториал числа
     n - это произведение всех натуральных чисел от 1 до n.
     */
     public static void main(String[] args) {
         System.out.print("insert number: ");
         Scanner scanner=new Scanner(System.in);

         int n=scanner.nextInt();
         int i=1, factorial=1;
         while(i<=n){
             factorial*=i;
             i++;
         }
         System.out.print("your factorial: "+factorial);
     }
}
