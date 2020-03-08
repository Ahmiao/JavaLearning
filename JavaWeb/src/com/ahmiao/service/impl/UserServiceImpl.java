package com.ahmiao.service.impl;

import com.ahmiao.dao.UserDao;
import com.ahmiao.dao.impl.UserDaoImpl;
import com.ahmiao.domain.User;
import com.ahmiao.service.UserService;

import java.util.List;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-07 22:20
 */
public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl();
    @Override
    public List<User> findAll() {
        //调用dao完成查询
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUsernameAndPassword(user);
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.deleteUser(id);
    }

    @Override
    public User findUserById(String id) {
        return dao.findUserById(id);
    }
}
