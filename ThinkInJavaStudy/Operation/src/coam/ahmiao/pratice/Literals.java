package coam.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * 测试直接常量
 * @Author AhmiaoChen
 * @Date 2020-03-12 10:10
 */
public class Literals {
    @Test
    public void testLiterals(){
        int i1=0x2f;
        System.out.println("i1:"+Integer.toBinaryString(i1));
        int i2=0X2F;
        System.out.println("i2:"+Integer.toBinaryString(i2));
        int i3=0177;
        System.out.println("i3:"+Integer.toBinaryString(i3));
        char c=0xffff;
        System.out.println("c:"+Integer.toBinaryString(c));
        byte b=0x7f;
        System.out.println("b:"+Integer.toBinaryString(b));
        short s=0x7fff;
        System.out.println("s:"+Integer.toBinaryString(s));
    }
}
