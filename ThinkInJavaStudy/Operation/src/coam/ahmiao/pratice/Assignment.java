package coam.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * 对象的赋值操作
 * @Author AhmiaoChen
 * @Date 2020-03-12 1:10
 */
public class Assignment {
    @Test
    public void testAssign(){
        Tank t1=new Tank();
        Tank t2=new Tank();
        t1.level=9;
        t2.level=47;
        System.out.println("1:t1.level="+t1.level+",t2.level="+t2.level);
        t1=t2;
        System.out.println("2:t1.level="+t1.level+",t2.level="+t2.level);
        t1.level=37;
        System.out.println("3:t1.level="+t1.level+",t2.level="+t2.level);
        t2.level=27;
        System.out.println("4:t1.level="+t1.level+",t2.level="+t2.level);
    }

}
class Tank{
    int level;
}
