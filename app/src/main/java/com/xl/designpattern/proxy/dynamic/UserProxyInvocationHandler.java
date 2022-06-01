package com.xl.designpattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @Author : wyl
 * @Date : 2022/6/1
 * Desc :
 * 调用处理程序，返回结果
 */
public class UserProxyInvocationHandler implements java.lang.reflect.InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getTarget() {
//       生成代理类
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法");
        Object object = method.invoke(target, args);
        return object;
    }


}
