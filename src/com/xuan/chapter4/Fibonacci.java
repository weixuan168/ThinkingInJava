package com.xuan.chapter4;

/**
 * Created by Xuan on 2017/6/9.
 */
public class Fibonacci {
    public static void getFibonacci(int i) {
        if (i == 1) {
            System.out.println(1);
        } else if (i == 2) {
            System.out.println("1,1");
        } else {
            int[] a = new int[i];
            a[0] = 1;
            a[1] = 1;
            for (int j = 2; j < i; j++) {
                a[j] = a[j - 1] + a[j - 2];
            }
            for (int j : a) {
                System.out.print(j + ",");
            }
        }
    }

    public static void main(String[] args) {
        getFibonacci(Integer.parseInt(args[0]));

    }



}
