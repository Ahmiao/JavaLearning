package com.ahmiao.domain;

import java.util.List;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-09 15:45
 */
public class PageBean {
    private int totalCoount;//总记录
    private int totalPage;//总页码
    private List list;//每页的数据
    private int currentPage;
    private int rows;

    public int getTotalCoount() {
        return totalCoount;
    }

    public void setTotalCoount(int totalCoount) {
        this.totalCoount = totalCoount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRpws() {
        return rows;
    }

    public void setRpws(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCoount=" + totalCoount +
                ", totalPage=" + totalPage +
                ", list=" + list +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                '}';
    }
}
