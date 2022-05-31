package com.xl.designpattern.factory.simple;

/**
 * @Author : wyl
 * @Date : 2022/5/31
 * Desc :
 */
public class SimpleFactory {
    public static Car getCar(String name) {
        if (name.equals("五菱")) {
            return new WulinCar();
        } else if (name.equals("BYD")) {
            return new BYDCar();
        } else {
            return null;
        }
    }
}
