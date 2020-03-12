# 4. 控制流程语句
## 4.1 ture和false
+ 所有的条件语句都需要利用条件表达式来决定执行路径的真假。
## 4.2 if-else
+ 格式如下：
```java
    if(Boolean-expression){
        expression;
    }else{
        expression;
    }
```
## 4.3 迭代
+ while、do-while和for用来控制循环，有时将它们分为迭代语句。
+ while语句格式如下：
```java
    while(Boolean-expression){
        statement;
    }
```
### 4.3.1 do-while
+ 格式如下：
```java
    do{
    statement;
    }while(Boolean-expression);
```
### 4.3.2 for
+ 格式如下：
```java
    for(intialization;Boolean-exprssion;step){
        stament;
    }
```
## 4.4 Foreach语法
+ Java SE5引入了一种新的更加简洁的for语法用于数组和容器。
+ 格式如下：
```java
    for(type a :f){
        statement;
    }
```
## 4.5 return
+ 指定一个方法返回什么值
+ 导致当前的方法退出，并返回那个值
## 4.6 break和continue
+ break:用于强行退出循环
+ continue:停止执行当前的迭代，然后退回循环起点。
## switch
+ 格式如下：
```java
    switch(cases){
     case case1: statement;break;
     case case2: statement;break;
     case case3: statement;break;
     ......
    }
``` 
