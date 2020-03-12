package coam.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * 移动操作符
 * @Author AhmiaoChen
 * @Date 2020-03-12 10:37
 */
public class URShift {
    @Test
    public void testURShift(){
        int i=-1;
        System.out.println(Integer.toBinaryString(i));
        i>>>=10;
        System.out.println(Integer.toBinaryString(i));
        long l=-1;
        System.out.println(Long.toBinaryString(l));
        l>>>=10;
        System.out.println(Long.toBinaryString(l));

    }
}
