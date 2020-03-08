package com.ahmiao.dao;

import com.ahmiao.domain.User;

import java.util.List;

/**
 * @Description 用户操作的dao
 * @Author AhmiaoChen
 * @Date 2020-03-07 22:21
 */
public interface UserDao {
    public List<User> findAll();

    public User findUsernameAndPassword(User user);

    public void add(User user);

    public void deleteUser(String id);

    public User findUserById(String id);
}
