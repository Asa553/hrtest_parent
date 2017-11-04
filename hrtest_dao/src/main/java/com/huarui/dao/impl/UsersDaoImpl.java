package com.huarui.dao.impl;

import com.huarui.dao.UsersDao;
import com.huarui.entity.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
public class UsersDaoImpl implements UsersDao{

    @Override
    public List<Users> findAll() {
        List<Users> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            Users users=new Users();
            users.setUid(i);
            users.setUname("hello world"+i);
            list.add(users);
        }
        return  list;
    }
}
