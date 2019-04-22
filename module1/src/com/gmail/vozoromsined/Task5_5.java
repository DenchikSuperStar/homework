package com.gmail.vozoromsined;


public class Task5_5 {
    /*Задание 5.5
    Создать массив с целыми числовыми значения (с помощью Math.random() метода) . Определите сумму
    элементов массива, расположенных между минимальным и максимальным значениями.*/
    public static void main(String[] args) {
        int[] array=new int[15];
        for(int i=0;i<10;i++){
            array[i]=(int)Math.round(Math.random()*100);
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        int min=array[0], max=array[0],sum=0;
        for(int i=0;i<10;i++){
            if(array[i]>max)
                max=array[i];
            else if(array[i]<min)
                min=array[i];
            sum+=array[i];
        }
        System.out.println(sum-max-min+"- result; "+sum+" - total sum; "+min+" - min; "+max+" - max.");
    }
}
