package com.xuan.chapter2;

/**
 * Created by Xuan on 2017/6/7.
 */
public class AboutStaticVariable {
    int a;
    char b;
    static String s="abc" ;

    public static void main(String[] args) {
        AboutStaticVariable asv= new AboutStaticVariable();
        AboutStaticVariable asv1 = new AboutStaticVariable();
        System.out.println(asv.a); //类成员会有默认初始值，局部变量则没有
        System.out.print(asv.b); //char类型的默认值是空字符
        System.out.println(asv1.s.hashCode());

        System.out.print("\0");
        System.out.println(asv.s.hashCode()); //即使创建了两个Test对象，static变量也只有一份存储空间。

        System.out.println(asv.equals(asv1));//false。Object的equals()是比较地址的，自己的类需重写equals()

        asv.s="def";
        asv.a++;
        System.out.println(asv.a);
        System.out.println(asv1.a);
        System.out.println(asv1.s );
    }
}
