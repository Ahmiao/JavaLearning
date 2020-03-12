package com.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-12 14:34
 */
public class SimpleConstructor {
    @Test
    public void testInit(){
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
class Rock{
    Rock(){
        System.out.println("Rock");
    }
}