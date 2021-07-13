package com.z.service;

import com.z.pojo.User;

public interface UserService {
    //添加用户
    public int addUser(User user);
    //删除用户
    public int delUser(User user);
    //登录用户
    public User loginUser(User user);
    //修改账户或者密码
    public int reviseUser(User user);
}
