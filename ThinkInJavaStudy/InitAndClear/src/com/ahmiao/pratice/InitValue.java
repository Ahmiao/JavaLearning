package com.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-12 16:49
 */
public class InitValue {
    boolean t;
    char c;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitValue ref;
    void printInit(){
        System.out.println("初始化默认值：");
        System.out.println("boolean:"+t);
        System.out.println("char:"+c);
        System.out.println("short:"+s);
        System.out.println("int:"+i);
        System.out.println("long:"+l);
        System.out.println("float:"+f);
        System.out.println("double:"+d);
        System.out.println("InitValue:"+ref);
    }
    @Test
    public void testInit(){
        InitValue iv=new InitValue();
        iv.printInit();
    }
}
