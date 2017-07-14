package com.xuan.chapter3;

import java.util.Random;

/**
 * Created by Xuan on 2017/6/8.
 */
public class AboutRamdom {
    public static void main(String[] args) {

        Random random = new Random(11);//种子值一样，产生的随机序列值就一样
        for (int i = 0; i < 10; i ++)
            System.out.println(random.nextInt(2));

        int x=0,y=1, z = 2;
        String s = "x,y,z";
        System.out.println(s + x + y + z);
        System.out.println(s + (x + y + z));

        boolean b = true;
        //布尔类型不允许进行任何类型的转换，也不能进行运算
//        int a = (int) b;
    }
}
