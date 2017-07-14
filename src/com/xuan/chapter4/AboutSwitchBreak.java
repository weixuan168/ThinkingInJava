package com.xuan.chapter4;

/**
 * Created by Xuan on 2017/6/9.
 */
public class AboutSwitchBreak {
    /**
     * switch语言特性：case标志只匹配一次，匹配到哪一个 case 就闷头闷脑地往下执行，
     * 直到遇到 break 或者到达 switch 语句的结尾花括号
     */
    public static void main(String[] args) {
        for(int i=0;i<6;i++) {
            switch (i) {
                case 0:
                    System.out.println(i);
//                    break;
                case 1:
                    System.out.println(i);
                    break;
                case 2:
                    System.out.println(i);
                    break;
                case 3:
                    System.out.println(i);
                    break;
                case 4:
                    System.out.println(i);
                    break;
                case 5:
                    System.out.println(i);
                    break;
                default:
            }
        }
    }

}
