package com.xuan.chapter4;

import java.io.IOException;

/**
 * Created by Xuan on 2017/7/14.
 */
public class AboutSystemIn {
    public static void main(String[] args) {
        try {
            //System.in.read()返回的是输入字符的ASKII 码（一个 int 整数）。
            // 比如我们在控制台输入数字5的时候，read()返回的结果就是5的ASKII 码53。
            int num = System.in.read();
            System.out.println(num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
