package com.gmail.vozoromsined;

public class Task19 {
    /*Имеется строка с текстом. Подчитать количество слов в тексте.
     * Желательно учесть, что слова могут разделяться несколькими пробелами, в начале
     * и конце текста также могут быть пробелы, но могут и отсутствовать.*/
    public static void main(String[] args) {
        String text = "   1Here 2we    3write 4some 5text 6that 7we 8like 9and " +
                "10will 11count 12number    13of 14words.   ";
        int count = 0;
        //inColumn(text);
        //String tex = "tex 123   lol   ";
        System.out.println("My text: "+text);
        System.out.println("Number of words: "+countWords(text));

    }

    private static int countWords(String text) {
        int count=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                for (int j = i; text.charAt(j) != ' ' && j < text.length() - 1; j++) {
                    if (text.charAt(j + 1) == ' ') {
                        i = j;
                        count++;
                    }
                }
            }
            if((i+1==text.length())&&(text.charAt(i)!=' '))
                count++;

        }
        return count;
    }

    private static void inColumn(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                System.out.print(text.charAt(i));
            } else {
                System.out.println();
            }

        }
    }
}
