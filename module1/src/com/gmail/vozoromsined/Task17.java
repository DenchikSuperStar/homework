package com.gmail.vozoromsined;

public class Task17 {
    /* Создать двухмерный квадратный массив, и заполнить его "бабочкой".*/
    public static void main(String[] args) {
        int n=5;// можно задать любое n;
        int[][] array=new int[n][n];
        for(int i=0;i<array.length;i++){
            for(int j=i; j<array[i].length-i;j++){
                array[i][j]=1;
            }
        }
        for(int i=array.length-1;i>0;i--){
            for(int j=array[i].length-i-1; j<=i;j++){
                array[i][j]=1;
            }
        }
        toString(array);
    }

    private static void toString(int[][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
