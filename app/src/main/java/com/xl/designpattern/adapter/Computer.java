package com.xl.designpattern.adapter;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc : 电脑
 */
public class Computer {

    //    网络连接
    public void connect(Adapter2 adapter) {
        adapter.handlerRequest();
    }

}
