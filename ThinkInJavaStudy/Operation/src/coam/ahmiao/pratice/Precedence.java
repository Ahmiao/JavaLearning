package coam.ahmiao.pratice;

import org.junit.Test;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-12 1:07
 */
public class Precedence {
    @Test
    public void testPrece(){
        int x=1,y=2,z=3;
        int a=x+y-2/2+z;
        System.out.println(a);
    }
}
