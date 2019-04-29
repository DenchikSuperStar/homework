package com.gmail.vozoromsined;

import java.util.Scanner;

public class Task18 {
    /*Найти в строке не только запятые, но и другие знаки препинания.
    Подсчитать общее их количество.*/
    public static void main(String[] args) {
        String text = "Here we, write, some? simbols! like : this ; ";
        char[] symbols=new char[]{'!','?',',','.',';',':'};
        int count=0;
        for(int i=0;i<text.length();i++)
            for (char symbol : symbols) {
                if (symbol == text.charAt(i))
                    count++;
            }
        System.out.println("Our text: "+text+"\nNumber of symbols: "+count);
    }
}
