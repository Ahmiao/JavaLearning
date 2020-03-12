package coam.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * 测试对象的等价性
 * @Author AhmiaoChen
 * @Date 2020-03-12 9:44
 */
public class Equivalence {
    @Test
    public void testEqu(){
        Integer n1=47;
        Integer n2=47;
        Integer n3=new Integer(47);
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));
        System.out.println(n1==n3);
        System.out.println(n1.equals(n3));
    }
}
