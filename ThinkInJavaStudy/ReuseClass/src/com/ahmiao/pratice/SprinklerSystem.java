package com.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * 使用组合语法
 * @Author AhmiaoChen
 * @Date 2020-03-12 23:57
 */
public class SprinklerSystem {
    private String val1,val2,val3,val4;
    private WaterSource source=new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "val1='" + val1 + '\'' +
                ", val2='" + val2 + '\'' +
                ", val3='" + val3 + '\'' +
                ", val4='" + val4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }
    @Test
    public void test(){
        SprinklerSystem system=new SprinklerSystem();
        System.out.println(system);
    }
}
class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s="构造器";
    }

    @Override
    public String toString() {
        return s;
    }
}