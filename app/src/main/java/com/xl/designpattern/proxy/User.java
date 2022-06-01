package com.xl.designpattern.proxy;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc :
 */
public class User implements IUser {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void query() {
        System.out.println("query");
    }
}
