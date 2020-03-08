package com.ahmiao.test;

import com.ahmiao.domain.User;
import com.ahmiao.service.UserService;
import com.ahmiao.service.impl.UserServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-07 23:30
 */
public class UserListTest {
    @Test
    public void findAllTset(){
        //1.调用userService完成查询
        UserService service = new UserServiceImpl();
        List<User> users=service.findAll();
        for (User user:users
             ) {
            System.out.println(user);
        }
    }
}
