package com.huarui.service.impl;

import com.huarui.dao.UsersDao;
import com.huarui.dao.impl.UsersDaoImpl;
import com.huarui.entity.Users;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public class UserServiceImpl implements com.huarui.service.UserService{
    @Override
    public List<Users> findAll() {
        return  new UsersDaoImpl().findAll();
    }
}
