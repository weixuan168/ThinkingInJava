package com.xuan.chapter4;

import java.util.Scanner;

/**
 * Created by Xuan on 2017/6/23.
 */
public class NewFibonacci {
    public static void main(String[] args) {
        System.out.println("请输入想要打印的斐波那契数字的个数:");

        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int f=1,g =0;
        for(int i=0;i<num;i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
        scanner.close();
    }
}
