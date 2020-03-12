package com.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-13 0:27
 */
public class Cartoon extends Drawing {
    public Cartoon(){
        System.out.println("Cartoon 构造器！");
    }
    @Test
    public void test(){
        Cartoon cartoon=new Cartoon();

    }
}
class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing 构造器");
    }
}
class Art{
    Art(){
        System.out.println("Art 构造器");
    }
}