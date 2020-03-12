package coam.ahmiao.pratice;

import org.junit.Test;

import java.util.Random;

/**
 * @Description
 * 测试逻辑操作符
 * @Author AhmiaoChen
 * @Date 2020-03-12 9:53
 */
public class Bool {
    @Test
    public void testBool(){
        Random rand=new Random(47);
        int i=rand.nextInt(100);
        int j=rand.nextInt(100);
        System.out.println("i:"+i);
        System.out.println("j:"+j);
        System.out.println("i>j is "+(i>j));
        System.out.println("j>i is "+(j>i));
        System.out.println("i>=j is "+(i>=j));
        System.out.println("j>=i is "+(j>=i));
        System.out.println("i==j is "+(i==j));
        System.out.println("j!=i is "+(j!=i));
    }
}
