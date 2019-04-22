package com.gmail.vozoromsined;

import java.util.Scanner;

public class Task4_2 {
    /*Задание 4.2
    Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
    Проверить помещаются ли эти дома на данном участке. Стороны домов — параллельны
    сторонам участка, в остальном размещение может быть любым.
    */
    public static void main(String[] args) {
        int a = 3, b = 3, c = 3, d = 3, e = 3, f = 3;
        menu(a, b, c, d, e, f);
    }

    private static void menu(int a, int b, int c, int d, int e, int f) {
        boolean test = true;
        while (test) {
            System.out.println("data: " + a + " =a; " + b + " =b; " + c + " =c; " + d + " =d; " + e + " =e; " + f + " =f.");
            System.out.println("Chose command: change a,b,c,d,e,f; give answer - [ans]; or [exit]");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            switch (command) {
                case "a": {
                    System.out.print("Insert a: ");
                    a = scanner.nextInt();
                    break;
                }
                case "b": {
                    System.out.print("Insert b: ");
                    b = scanner.nextInt();
                    break;
                }
                case "c": {
                    System.out.print("Insert c: ");
                    c = scanner.nextInt();
                    break;
                }
                case "d": {
                    System.out.print("Insert d: ");
                    d = scanner.nextInt();
                    break;
                }
                case "e": {
                    System.out.print("Insert e: ");
                    e = scanner.nextInt();
                    break;
                }
                case "f": {
                    System.out.print("Insert f: ");
                    f = scanner.nextInt();
                    break;
                }
                case "ans": {
                    testArea(a, b, c, d, e, f);
                    break;
                }
                case "exit": {
                    test=false;
                    break;
                }
                default:
                    System.out.println("incorrect");
            }
        }
    }

    private static void testArea(int a, int b, int c, int d, int e, int f) {
        if (a * e + b * f - a * b >= c * d || a * f + b * e - a * b >= c * d)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
