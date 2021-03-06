# 5. 初始化和清理
## 5.1 用构造器确保初始化
+ 通过提供构造器。类的设计者可以确保每个对象都会得到初始化。
## 5.2 方法重载
+ 提供相同的方法名，不一样的参数列表。
### 5.2.1 区分重载方法
+ 每个重载的方法都有独一无二的参数列表。
### 5.2.2 涉及基本类型的重载
+ 基本类型能从一个很小的类型提升到一个“较大”的类型，此过程涉及到重载。
+ 注意java中不能以返回值作为区分重载方法。
## 5.3 默认构造器
+ 默认构造器（无参构造器），其作用是创建一个默认对象。
## 5.4 this关键字
+ this关键字只能在方法内部中使用。
+ 如果在方法的内部调用同一个类的另一个方法，就不必用this
### 5.4.1 在构造器调用构造器
+ 通常写this的时候，都是指“这个对象”或者“当前对象”，而且它本身表示对当前对象的引用。
### 5.4.2 static的含义
+ static方法就是没有this方法。
+ 在static方法的内部不能调用非静态方法，反过来是可以的。
+ 可以通过类名和对象调用自己
+ static具有全局函数的语义
## 5.5 清理：终结处理和垃圾回收
+ java允许在类中定义一个名为finalize的方法。
+ 使用finalize方法，要注意2点：  
+ 1.对象可能不被垃圾回收
+ 2.垃圾回收不等于析构
## 5.6 成员初始化
+ Java尽力保证：所有的变量在使用前都能得到恰到好处的初始化，赋给默认值。
+ 对于方法中的局部变量，Java在编译时以错误的形式来贯彻这种保证
## 5.7 构造器初始化
### 5.7.1 初始化顺序
+ 在类的内部，变量先后定义了决定了初始化的先后顺序。
### 5.7.2 静态数据的初始化
+ 无论创建多少对象，静态数据都只占用一份存储区域。
+ static 关键字不能作用于局部变量，因此他只能作用于域。
+ 如果没有初始化，是基本类型就按基本类型的默认值，是对象引用就是null。
### 5.7.3 显式的静态初始化
+ 格式如下：
```java
public class Test{
    static int i;
    static{
        i=1;
    }
}
```
### 5.7.4 非静态实例初始化
+ 格式如下：
```java
public void Test{
    int i;
    {
        i=1;
    }
}
```
## 5.8 数组初始化
+ 在java中，数组是相同类型的、用一个标识符名称封装到一起的对象序列或基本类型数据序列。
+ 格式如下：
```java
    type[] val1;
    type  val2[];
```
## 5.9 枚举类型
+ 格式如下：
```java
    public enum Type{
        TYPE1,TYPE2,TYPE3
    }
```



