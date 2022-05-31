package com.xl.designpattern.factory.abstract1;

/**
 * @Author : wyl
 * @Date : 2022/5/31
 * Desc :
 */
public class XiaoMiPhone  implements IPhone{
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("小米手机发短信");
    }
}
