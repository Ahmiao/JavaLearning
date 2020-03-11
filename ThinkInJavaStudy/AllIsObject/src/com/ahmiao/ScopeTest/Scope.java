package com.ahmiao.ScopeTest;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-11 15:44
 */
public class Scope {
    public static void main(String[] args) {
        {
            int x=12;//只有x有效
            {
                int q=96;//x和q都有效
                x=13;
            }
            //只有x有效

            //q在此失去作用域
        }
        {
            String s=new String ("a String");
        }//作用域的结束点

    }
}
