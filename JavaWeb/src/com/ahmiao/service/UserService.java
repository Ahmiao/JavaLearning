package com.ahmiao.service;

import com.ahmiao.domain.User;

import java.util.List;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-07 22:18
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();

    /**
     * 登录
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 保存User
     * @param user
     */
    public void addUser(User user);

    /**
     * 根据id删除User
     * @param id
     */
    public void deleteUser(String id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public User findUserById(String id);
}
