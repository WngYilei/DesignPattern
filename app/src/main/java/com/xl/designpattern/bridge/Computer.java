package com.xl.designpattern.bridge;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc :
 */
public abstract class Computer {
  protected   Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void getName() {
        brand.getName();
    }
}


