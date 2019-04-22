package com.gmail.vozoromsined;

import java.util.Scanner;

public class Task5_4 {
    /*Задание 5.4
    Имеется целое число, следует вывести его в бухгалтерском формате. Т.е. начиная справа
    каждые три позиции отделяются пробелом. Например, число 20023143 должно быть выведено как
    20 023 143. (Не использовать классы и методы форматирования чисел из JDK!)
    */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Incert number :");
        int num=scanner.nextInt();
        int count=0, temp=num;
        while(temp!=0){
            temp/=10;
            count++;
        }
        for(int i=1;i<=count;i++){
            System.out.print((num/(int)Math.pow(10,count-i))%10);
            if((count-i)%3==0)
                System.out.print("   ");
        }
    }
}