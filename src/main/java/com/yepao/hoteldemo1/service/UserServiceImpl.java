package com.yepao.hoteldemo1.service;

import com.yepao.hoteldemo1.mapper.UserMapper;
import com.yepao.hoteldemo1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    //User接口
    @Autowired
    private UserMapper userMapper;

    public List<User> findUser() throws Exception {

        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<User> users = userMapper.selectByExample(null);

        return users;
    }
}
