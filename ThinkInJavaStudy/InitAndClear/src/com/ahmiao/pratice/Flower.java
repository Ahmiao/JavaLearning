package com.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-12 16:16
 */
public class Flower {
    int petalCount=0;
    String s="initial value";
    Flower(int petals){
        petalCount=petals;
        System.out.println("只有int参数的构造器,petalCount+"+petalCount);
    }
    Flower(String s,int petals){
        this(petals);
        this.s=s;
        System.out.println("有int和String参数");
    }
   public Flower(){
        this("hi",7);
        System.out.println("默认构造器，没有参数！");
    }
    void primtPetalCount(){
        System.out.println("petalsCount="+petalCount+",s="+s);
    }
    @Test
    public void testThis(){
        Flower x=new Flower();
        x.primtPetalCount();
    }
}
