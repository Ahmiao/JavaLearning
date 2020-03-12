package coam.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * 测试短路操作
 * @Author AhmiaoChen
 * @Date 2020-03-12 9:59
 */
public class ShortCircuit {
    @Test
    public void testShortCir(){
        boolean b=test1(0)&&test2(2)&&test3(2);
        System.out.println("expression is "+b);
    }
    static boolean test1(int val){
        System.out.println("test1("+val+")");
        System.out.println("result: "+(val<1));
        return val<1;
    }
    static boolean test2(int val){
        System.out.println("test2("+val+")");
        System.out.println("result: "+(val<2));
        return val<2;
    }
    static boolean test3(int val){
        System.out.println("test3("+val+")");
        System.out.println("result: "+(val<3));
        return val<3;
    }
}
