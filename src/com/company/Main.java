package com.company;

import java.util.Scanner;

public class Main {
    static int wuw( int [] rr) {
        int min = rr[0];
        for (int i = 0; i < rr.length; i++) {
            if (rr[i] < min) {
                min = rr[i];
            }
        }
        return min;
    }
    static int fuf(int [] hh){
        int h = 0;
        for (int i = 0; i < hh.length; i++ ){
            h = h + hh[i];
        }
        h = h/ hh.length;
        return h;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("количество элементов");
        int num = in.nextInt();
        int [] arr = new int [num];
        System.out.println("заполним массив");
        for (int i = 0; i < num; i++){
            arr[i] = in.nextInt();
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("элементы массива");
        for (int i : arr){
            System.out.println(i);
        }
        int min = wuw(arr);
        int h = fuf(arr);
        int sum = min + h;
        System.out.println("минимальное " + min + "\nсреднее арифметичсекое " + h + "\nсумма минимального и среднего арифметического " + sum);
    }

}


