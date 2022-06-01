package com.xl.designpattern.bridge;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc :
 */
public
class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void getName() {
        super.getName();
        System.out.println("台式机");
    }
}
