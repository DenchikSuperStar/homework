package com.gmail.vozoromsined;

import java.util.Scanner;

public class Task6 {
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
        System.out.println("dd.mm." + printWright(year));
        do {
            mounth = scanner.nextInt();
            if (!checkMounth(mounth))
                System.out.println("wrong mounth, insert new!");
        } while (!checkMounth(mounth));
        System.out.println("dd." + printWright(mounth) + "." + printWright(year));
        int day;
        System.out.print("Incert day: ");
        do {
            day = scanner.nextInt();
            if (!checkDay(day, mounth, year))
                System.out.println("wrong day, insert new! no more than " + dayInMounth(mounth, year));
        } while (!checkDay(day, mounth, year));
        System.out.println(printWright(day) + "." + printWright(mounth) + "." + printWright(year));
        System.out.print("tommotow will be: ");
        nextDay(year, mounth, day);
    }

    private static String printWright(int a) {
        if (a < 10)
            return ("0" + a);
        else
            return (""+a);
    }

    private static boolean checkMounth(int mounth) {
        return (mounth <= 12 && mounth >= 1);
    }

    private static boolean checkDay(int day, int mounth, int year) {
        return ((dayInMounth(mounth, year) >= day) && (day > 0));
    }

    private static int dayInMounth(int mounth, int year) {
        if (testFeb(mounth)) {
            if (leapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            if ((mounth % 2 != 0 && mounth <= 7) || (mounth % 2 == 0 && mounth > 7)) {
                return 31;
            } else {
                return 30;
            }
        }
    }

    private static boolean testFeb(int mounth) {
        return (mounth == 2);
    }

    private static boolean leapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    private static void nextDay(int year, int mounth, int day) {
        if (day + 1 <= dayInMounth(mounth, year)) {
            System.out.println("next day: " + printWright(day + 1) + "." + printWright(mounth) + "." + printWright(year));
        } else {
            if (checkMounth(mounth + 1)) {
                System.out.println("next day: " + printWright(1) + "." + printWright(mounth + 1) + "." + printWright(year));
            } else
                System.out.println("next day: " + printWright(1) + "." + printWright(1) + "." + printWright(year + 1));
        }
    }


}