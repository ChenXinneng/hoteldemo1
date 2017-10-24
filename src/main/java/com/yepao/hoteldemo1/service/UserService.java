package com.yepao.hoteldemo1.service;

import com.yepao.hoteldemo1.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;
}
