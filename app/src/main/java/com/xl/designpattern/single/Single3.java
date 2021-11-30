package com.xl.designpattern.single;

/**
 * 饿汉式
 */
public class Single3 {
    static Single3 single3 = new Single3();

    private Single3() {
    }

    public static Single3 getInstance() {
        return single3;
    }
}
