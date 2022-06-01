package com.xl.designpattern.bridge;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc :
 */
public class Apple implements Brand {
    @Override
    public void getName() {
        System.out.print("苹果");
    }

}
