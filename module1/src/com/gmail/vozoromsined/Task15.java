package com.gmail.vozoromsined;


public class Task15 {
    /*Задание 5.5
    Создать массив с целыми числовыми значения (с помощью Math.random() метода) . Определите сумму
    элементов массива, расположенных между минимальным и максимальным значениями.*/
    public static void main(String[] args) {
        int[] array=new int[15];
        for(int i=0;i<array.length;i++){
            array[i]=(int)Math.round(Math.random()*100);
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        int min=0, max=0,sum=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>array[max])
                max=i;
            else if(array[i]<array[min])
                min=i;
        }
        if(max<min)
            for(int i=max+1;i<min;i++){
                sum+=array[i];
            }
        else
            for (int i=min+1;i<max;i++)
                sum+=array[i];
        System.out.println(sum+" - sum between: "+array[min]+" - min; "+array[max]+" - max.");
    }
}
