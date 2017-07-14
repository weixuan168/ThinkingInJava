package com.xuan.chapter4;

/**
 * Created by Xuan on 2017/6/12.
 */
public class Exercise10 {
    //将两个数字合成一个两位数
    public static int com(int i, int j) {
        return i * 10 + j;
    }

    //根据所给的四位数得到它的四个位的数字
    public static int[] getNums(int k) {
        int[] nums = new int[4];
        nums[0] = k % 10;
        nums[1] = k % 100 / 10;
        nums[2] = k % 1000 / 100;
        nums[3] = k / 1000;
        return nums;
    }

    //判断所给的四位数是不是吸血鬼数，并输出
    public static void Judge(int i, int num1, int num2) {
        if (i == num1 * num2) {
            System.out.println(i + " = " + num1 + " * " + num2);
        }
    }
    public static void main(String[] args) {
        for (int i = 1001; i < 10000; i++) {
            int[] nums = getNums(i);
            Judge(i, com(nums[0], nums[1]), com(nums[2], nums[3]));
            Judge(i, com(nums[0], nums[1]), com(nums[3], nums[2]));
            Judge(i, com(nums[1], nums[0]), com(nums[3], nums[2]));
            Judge(i, com(nums[1], nums[0]), com(nums[2], nums[3]));

            Judge(i, com(nums[0], nums[2]), com(nums[1], nums[3]));
            Judge(i, com(nums[0], nums[2]), com(nums[3], nums[1]));
            Judge(i, com(nums[2], nums[0]), com(nums[3], nums[1]));
            Judge(i, com(nums[2], nums[0]), com(nums[1], nums[3]));

            Judge(i, com(nums[0], nums[3]), com(nums[1], nums[2]));
            Judge(i, com(nums[0], nums[3]), com(nums[2], nums[1]));
            Judge(i, com(nums[3], nums[0]), com(nums[2], nums[1]));
            Judge(i, com(nums[3], nums[0]), com(nums[1], nums[2]));
        }
    }
}
