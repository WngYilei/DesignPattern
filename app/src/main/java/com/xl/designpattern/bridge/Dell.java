package com.xl.designpattern.bridge;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc :
 */
public class Dell implements Brand {
    @Override
    public void getName() {
        System.out.print("Dell");
    }
}
