package com.xl.designpattern.factory.method;

import com.xl.designpattern.factory.simple.Car;

/**
 * @Author : wyl
 * @Date : 2022/5/31
 * Desc :
 */
public class WulingFactory implements IFactory {
    @Override
    public Car getCar() {
        return new WulinCar();
    }
}
