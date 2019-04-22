package com.gmail.vozoromsined;

import java.util.Scanner;

public class Task3_1 {
    /*Задание 3.1
public static void main(String[] args) {
int s = 3700;
int sec;
int m;
int min, h;
sec = s % 60;
m = (s -sec) / 60;
min = m % 60;
h = (m -min) / 60;
System.out.println(h+" часов" + min + " минут" + sec + " секунд");
}
Продолжите приведенный пример, добавьте расчет и вывод суток и недель.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("insert seconds(60-min; 3600-hour; -day; -week): ");
        int time = scanner.nextInt();
        int sec = time % 60;
        int min = ((time - sec) / 60);
        int hour = (min / 60);
        int day = hour / 24;
        int week = day / 7;
        System.out.println("week: " + week + "; day: " + day % 7 + "; hour: " + hour % 24 + "; min: " + min % 60 + "; sec: " + sec);
    }
}

