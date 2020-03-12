package com.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * 测试继承
 * @Author AhmiaoChen
 * @Date 2020-03-13 0:05
 */
public class Detergent extends Cleanser{
    @Override
    public void scrub() {
        append("Detergent.scrub ");
        super.scrub();
    }
    public void foam(){
        append("foam() ");
    }
    @Test
    public void test(){
        Detergent x=new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
    }
}
class Cleanser{
    private String s="Cleanser ";
    public void append(String a){s+=a;}
    public void apply(){append("apply ");}
    public void dilute(){append("dilute ");}
    public void scrub(){append("scrub ");}

    @Override
    public String toString() {
        return s;
    }
}
