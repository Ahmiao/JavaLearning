package com.ahmiao.practice;

/**
 * @Description
 * 创建一个类，它包含一个int域和一个char域，它们都没有被初始化
 * 将它们的值打印出来，已验证Java执行了默认初始化。
 * @Author AhmiaoChen
 * @Date 2020-03-11 23:32
 *
 */
public class PrintDefault {
    static  int a;
    static char b;
    static boolean c;
    static byte d;
    static int e;
    static long f;
    static float g;
    static double h;
    public static void main(String[] args) {

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("g="+g);
        System.out.println("h="+h);
    }
}
