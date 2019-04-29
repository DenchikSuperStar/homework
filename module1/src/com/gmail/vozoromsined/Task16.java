package com.gmail.vozoromsined;

public class Task16 {
    /*Создать массив, заполнить его случайными элементами, распечатать,
    * перевернуть и снова распечатать.*/
    public static void main(String[] args) {
        int[] array=new int[13];
        for(int i=0;i<array.length;i++){
            array[i]=(int)Math.round(10*Math.random());
            //array[i]=i;
        }
        toString(array);
        System.out.println("\nAnd reversed: ");
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array[array.length-i-1]]=temp;
        }
        toString(array);
    }

    private static void toString(int[] array) {
        for(int i=0;i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

}
