# 3 操作符
## 3.1 更简单的打印语句
```java
public void testPrint(){
        System.out.println("hello world!");
    }
```
## 3.2 使用java操作符
加（+）减（-）乘（*）除（/）赋值（=）等几乎所有的操作符 只能操作
“基本类型”。例外的操作符是“=”、“==”、“！=”，这些操作符能操作所有的对象。String类型支持“+”和“+=”。

## 3.3 优先级
+ 先乘除后加减  
+ 当编译器观察到一个String后面紧跟一个“+”，而这个“+”又紧跟一个非String类型的元素
会尝试把它转换成String。
## 3.4 赋值
+ 赋值使用操作符“=”。它的意思就是“取右边的值，把它赋值给左边”
右值可以为任何常数、变量或者表达式。如果变量必须是明确的、已经命名的变量。
+ 基本类型存储实际的数值。
+ 对象赋值的操作，就是引用指向赋值的对象。
### 3.4.1 方法中调用别名的问题
```java
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
```
## 3.5 算术操作符
加（+）减（-）乘（*）除（/）以及取模操作符（%）
## 3.6 自动递增和递减
类型：
+ 递减操作“--”  
+ 递增操作“++”
方式：
+ “前缀式”，会先执行计算再生成值。
+ “后缀式”，会先生成值再执行计算