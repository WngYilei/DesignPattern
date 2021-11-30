package com.xl.designpattern.single;

/**
 * 静态内部类
 */
public class Single2 {
    private static class Holder {
        static Single2 single2 = new Single2();
    }

    public static Single2 getInstance() {
        return Holder.single2;
    }
}
