package com.gmail.vozoromsined;

import java.util.Scanner;

public class Task4_1 {
    /*Задание 4.1
    Имеются три числа — день, месяц, год. Вывести в виде трех чисел дату следующего дня.
    Постарайтесь испольщовать операторы if, else, или switch и не использовать стандартные
    классы JDK для работы с датами! Помните про ввод данных в программу в виде строки String
    и затем конвертация в цифровое значение int.
    */
    public static void main(String[] args) {
        System.out.print("Incert year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.print("Insert mounth: ");
        int mounth;
        do {
            mounth = scanner.nextInt();
        } while (!testMounth(mounth));
        int day;
        System.out.print("Incert day: ");
        do {
            day = scanner.nextInt();
        } while (!testDays(year, mounth, day));
        giveNextDay(year,mounth,day);

    }

    private static boolean testMounth(int mounth) {
        boolean test = false;
        if (mounth > 12 || mounth<1)
            System.out.println("wrong mounth, insert new!");
        else
            test = true;
        return test;

    }

    private static boolean testDays(int year, int mounth, int day) {
        boolean test = false;
        if (mounth == 2) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                if (day <= 29) {
                    test = true;
                } else {
                    System.out.println("It's leap year but too many days, have to be <=29");
                }
            } else {
                if (day <= 28) {
                    test = true;
                } else {
                    System.out.println("It's not leap year but too many days <=28");
                }
            }
        } else {
            if ((mounth % 2 != 0) && (mounth <= 7) || (mounth % 2 == 0 && mounth > 7)) {
                if (day <= 31) {
                    test = true;
                } else {
                    System.out.println("too many days <=31");
                }
            } else {
                if (day <= 30)
                    test = true;
                else {
                    System.out.println("too many days <=30");
                }
            }
        }
        return test;
    }

    private static void giveNextDay(int year,int mounth,int day){
        if(testDays(year,mounth,day+1)){
            System.out.println("next day: "+(day+1)+"."+mounth+"."+year);
        }
        else{
            if(testMounth(mounth+1)) {
                System.out.println("next day: "+01+"."+(mounth+1)+"."+year);
            }
            else
                System.out.println("next day: "+01+"."+1+"."+year+1);
        }
    }
}