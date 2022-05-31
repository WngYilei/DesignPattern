package com.xl.designpattern.factory.abstract1;

/**
 * @Author : wyl
 * @Date : 2022/5/31
 * Desc :
 */
public class HuaweiFactory implements Factory {
    @Override
    public IPhone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public IRoute getRoute() {
        return new HuaweiRoute();
    }
}
