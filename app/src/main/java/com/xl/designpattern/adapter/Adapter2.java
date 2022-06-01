package com.xl.designpattern.adapter;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc :
 */
public class Adapter2 implements NetToUsb {

    private NetworkCable networkCable;

    public Adapter2(NetworkCable networkCable) {
        this.networkCable = networkCable;
    }

    @Override
    public void handlerRequest() {
        networkCable.request();
    }

}
