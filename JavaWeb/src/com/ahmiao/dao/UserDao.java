package com.ahmiao.dao;

import com.ahmiao.domain.PageBean;
import com.ahmiao.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @Description 用户操作的dao
 * @Author AhmiaoChen
 * @Date 2020-03-07 22:21
 */
public interface UserDao {


    public List<User> findAll();

    User findUserByUsernameAndPassword(String username, String password);

    void add(User user);

    void delete(int id);

    User findById(int i);

    void update(User user);

    /**
     * 查询总记录数
     * @return
     * @param condition
     */
    int findTotalCount(Map<String, String[]> condition);

    /**
     * 分页查询每页记录
     * @param start
     * @param rows
     * @param condition
     * @return
     */
    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
}