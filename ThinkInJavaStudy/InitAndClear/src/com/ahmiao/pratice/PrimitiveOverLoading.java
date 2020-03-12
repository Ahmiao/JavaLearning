package com.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-12 15:24
 */
public class PrimitiveOverLoading {
    @Test
    public void testAll(){
        PrimitiveOverLoading p=new PrimitiveOverLoading();
        p.testConstVal();
        p.testShort();
        p.testChar();
        p.testByte();
        p.testLong();
        p.testFloat();
        p.testDouble();
    }
    void f1(char x){System.out.print("f1(char) "); }
    void f1(byte x){System.out.print("f1(byte) ");}
    void f1(short x){System.out.print("f1(short) ");}
    void f1(int x){System.out.print("f1(int) ");}
    void f1(long x){System.out.print("f1(long) ");}
    void f1(float x){System.out.print("f1(float) ");}
    void f1(double x){System.out.print("f1(double) ");}

    void f2(byte x){System.out.print("f2(byte) ");}
    void f2(short x){System.out.print("f2(short) ");}
    void f2(int x){System.out.print("f2(int) ");}
    void f2(long x){System.out.print("f2(long) ");}
    void f2(float x){System.out.print("f2(float) ");}
    void f2(double x){System.out.print("f2(double) ");}

    void f3(short x){System.out.print("f3(short) ");}
    void f3(int x){System.out.print("f3(int) ");}
    void f3(long x){System.out.print("f3(long) ");}
    void f3(float x){System.out.print("f3(float) ");}
    void f3(double x){System.out.print("f3(double) ");}

    void f4(int x){System.out.print("f4(int) ");}
    void f4(long x){System.out.print("f4(long) ");}
    void f4(float x){System.out.print("f4(float) ");}
    void f4(double x){System.out.print("f4(double) ");}

    void f5(long x){System.out.print("f5(long) ");}
    void f5(float x){System.out.print("f5(float) ");}
    void f5(double x){System.out.print("f5(double) ");}

    void f6(float x){System.out.print("f6(float) ");}
    void f6(double x){System.out.print("f6(double) ");}

    void f7(double x){System.out.print("f7(double) ");}
    void testConstVal(){
        int x=5;
        System.out.println("x: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testChar(){
        char x='x';
        System.out.println("x: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testByte(){
        byte x=0;
        System.out.println("x: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testShort(){
        short x=5;
        System.out.println("x: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testLong(){
        long x=5;
        System.out.println("x: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testFloat(){
        float x=5.0f;
        System.out.println("x: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testDouble(){
        double x=5.0d;
        System.out.println("x: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
}
