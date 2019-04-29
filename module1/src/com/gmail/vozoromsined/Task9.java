package com.gmail.vozoromsined;

public class Task9 {
    /*Задание 5.1
      Имеется последовательность (массив) случайных чисел (ее можно генерировать с помощью
      Math.random() метода), найти и вывести наибольшее из них.*/
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) Math.round(100 * Math.random());
            System.out.print("a[" + i + "]=" + array[i] + "\t");
        }
        System.out.println("\nAfter sorting:");
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                if (array[i] > array[j]) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
            System.out.print("a[" + i + "]=" + array[i] + "\t");
        }
    }
}
