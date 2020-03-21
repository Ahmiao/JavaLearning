package com.ahmiao.java.lang;

import java.util.Iterator;

/**
 * java 集合框架的根框架
 * @param <T>
 */
public interface Collection<T> extends Iterable<T> {
    /**
     * 获取集合的大小
     * @return 该集合的大小
     */
    int sixe();

    /**
     * 查看集合是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 查看该集合是否有该元素
     * @return
     */
    boolean cotains(Object o);

    /**
     * 获取迭代器
     * @return
     */
    Iterator<T> iterator();

    /**
     * 集合转数组
     * @return
     */
    Object [] toArray();

    /**
     * 集合数组转数组
     * @param t
     * @return
     */
    Object [] toArray(T [] t);

    /**
     * 添加数据
     * @param t
     * @return
     */
    boolean add(T t);

    /**
     * 移除数据
     * @param o
     * @return
     */
    boolean remove(Object o);

    /**
     * 两个集合是否有相同的元素
     * @param c
     * @return
     */
    boolean containsAll(Collection<?> c);

    /**
     * 把另一个集合的
     * @param c
     * @return
     */
    boolean addAll(Collection<?> c);

}
