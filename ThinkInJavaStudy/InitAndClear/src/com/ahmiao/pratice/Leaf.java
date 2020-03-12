package com.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * 测试this关键字
 * @Author AhmiaoChen
 * @Date 2020-03-12 16:06
 */
public class Leaf {
    int i=0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i="+i);
    }
    @Test
    public void testThis(){
        Leaf x=new Leaf();
        x.increment().increment().increment().print();
    }
}
