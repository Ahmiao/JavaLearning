package com.ahmiao.dao.impl;

import com.ahmiao.dao.UserDao;
import com.ahmiao.domain.User;
import com.ahmiao.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Description
 * @Author AhmiaoChen
 * @Date 2020-03-07 22:23
 */
public class UserDaoImpl implements UserDao {
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findAll() {
        //使用JDBC操作数据库
        //定义sql
        String sql="select * from user";
        List<User> users= (List<User>) template.query(sql,new BeanPropertyRowMapper<User>(User.class));
         return users;
    }

    @Override
    public User findUsernameAndPassword(User user) {
        try{
        String sql="select * from user where username = ? and password =?";
        User userThis=template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),
                user.getUsername(),user.getPassword());
        return userThis;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void add(User user) {
        //1.定义sql
        String sql="insert into user values(null,?,?,?,?,?,?,null,null)";
        //2.执行sql
        template.update(sql,user.getName(),user.getGender(),user.getAge()
        ,user.getAddress(),user.getQq(),user.getEmail());
    }

    @Override
    public void deleteUser(String id) {
        //1.定义sql
        String sql="delete from user where id= ?";
        //2.执行sql
        template.update(sql,Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id) {
        return null;
    }
}
