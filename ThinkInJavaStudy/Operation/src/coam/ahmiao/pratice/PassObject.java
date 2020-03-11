package coam.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * 测试对象的别名
 * @Author AhmiaoChen
 * @Date 2020-03-12 1:20
 */
public class PassObject {
    static void f(Letter y){
        //此时Letter的别名为y
        y.c='z';
    }
    @Test
    public void testPs(){
        //此时Letter的别名为x
        Letter x=new Letter();
        x.c='a';
        System.out.println("1:x.c="+x.c);
        f(x);
        System.out.println("2:x.c="+x.c);
    }
}
class Letter{
    char c;
}