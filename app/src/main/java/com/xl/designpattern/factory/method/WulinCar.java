package com.xl.designpattern.factory.method;


import com.xl.designpattern.factory.simple.Car;

/**
 * @Author : wyl
 * @Date : 2022/5/31
 * Desc :
 */
public class WulinCar implements Car {
    @Override
    public void getName() {
        System.out.println("五菱");
    }
}
