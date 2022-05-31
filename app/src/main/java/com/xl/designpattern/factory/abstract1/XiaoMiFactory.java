package com.xl.designpattern.factory.abstract1;

/**
 * @Author : wyl
 * @Date : 2022/5/31
 * Desc :
 */
public class XiaoMiFactory  implements Factory{
    @Override
    public IPhone getPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public IRoute getRoute() {
        return new XiaoMiRoute();
    }
}
