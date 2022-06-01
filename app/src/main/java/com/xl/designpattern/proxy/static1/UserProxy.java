package com.xl.designpattern.proxy.static1;

import com.xl.designpattern.proxy.IUser;
import com.xl.designpattern.proxy.User;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc :
 */
public class UserProxy implements IUser {

    User user;

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public void add() {
        System.out.println("UserProxy-add");
        user.add();
    }

    @Override
    public void update() {
        System.out.println("UserProxy-update");
        user.update();
    }

    @Override
    public void delete() {
        System.out.println("UserProxy-delete");
        user.delete();
    }

    @Override
    public void query() {
        System.out.println("UserProxy-query");
        user.query();
    }


}
