package com.xl.designpattern.factory.abstract1;

/**
 * @Author : wyl
 * @Date : 2022/5/31
 * Desc :
 */
public class XiaoMiRoute  implements IRoute{
    @Override
    public void openWifi() {
        System.out.println("小米路由器打开wifi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器进行设置");
    }
}
