package com.xl.designpattern.factory.abstract1;

/**
 * @Author : wyl
 * @Date : 2022/5/31
 * Desc :
 */
public class HuaweiPhone  implements IPhone{
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("华为手机发短信");
    }
}
