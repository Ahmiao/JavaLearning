package coam.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * 测试自增和自减
 * @Author AhmiaoChen
 * @Date 2020-03-12 1:43
 */
public class AutoInc {
    @Test
    public void testAutoInc(){
        int i=1;
        System.out.println("i:"+i);
        //前缀表达式
        System.out.println("++i:"+ ++i);
        //后缀表达式
        System.out.println("i++:"+i++);
        //i++;
        System.out.println("i:"+i);

        //前缀表达式
        System.out.println("--i："+ --i);
        //后缀表达式
        System.out.println("i--:"+i--);
        System.out.println("i:"+i);
    }
}
