package com.xuan.chapter4;

/**
 * Created by Xuan on 2017/6/9.
 */
public class FibonacciAnswer {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        System.out.println("First " + k + " Fibonacci numbers:");
        for(int i=1;i<=k;i++) {
            System.out.println(fib(i));
        }
    }

    public static int fib(int i) {
        if (i < 3) {
            return 1;
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }
}
