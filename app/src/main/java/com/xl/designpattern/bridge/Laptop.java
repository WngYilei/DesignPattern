package com.xl.designpattern.bridge;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc :
 */
public   class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void getName() {
        super.getName();
        System.out.println("笔记本");
    }
}
