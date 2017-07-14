package com.xuan.chapter2;

/**
 *The first Thinking in Java example program.
 * @author Xuan
 * @version 4.0
 */
public class ShowSystemProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));

    }

}
