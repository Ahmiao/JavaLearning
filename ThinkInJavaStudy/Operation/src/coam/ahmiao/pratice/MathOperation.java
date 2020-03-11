package coam.ahmiao.pratice;

import org.junit.Test;

import java.util.Random;

/**
 * @Description
 * 算术操作符的应用
 * @Author AhmiaoChen
 * @Date 2020-03-12 1:28
 */
public class MathOperation {
    @Test
    public void testMathOp(){
        //创建一个随机数生成器
        Random rand=new Random(47);
        int i ,j ,k;
        //选择从1到100：
        j=rand.nextInt(100)+1;
        System.out.println("j="+j);
        k=rand.nextInt(100)+1;
        System.out.println("k="+k);
        i=j+k;
        System.out.println("j+k="+i);
        i=j-k;
        System.out.println("j-k="+i);
        i=j/k;
        System.out.println("j/k="+i);
        i=j*k;
        System.out.println("j*k="+i);
        i=k%j;
        System.out.println("k%j="+i);
    }
}
