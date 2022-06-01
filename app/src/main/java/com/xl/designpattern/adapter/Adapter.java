package com.xl.designpattern.adapter;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc :转接头
 */
public class Adapter extends NetworkCable implements NetToUsb {
    @Override
    public void handlerRequest() {
        super.request();
    }
}
