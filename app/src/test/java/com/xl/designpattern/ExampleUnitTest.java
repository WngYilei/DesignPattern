package com.xl.designpattern;

import org.junit.Test;

import com.xl.designpattern.proxy.User;
import com.xl.designpattern.proxy.static1.UserProxy;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
//        chain
//        Leader groupLeader = new GroupLeader();
//        Leader director = new Director();
//        Leader manager = new Manager();
//        groupLeader.setNextLeader(director);
//        director.setNextLeader(manager);
//
//        groupLeader.handleRequest(5000);
//        groupLeader.handleRequest(9000);
//        groupLeader.handleRequest(12000);
//        groupLeader.handleRequest(30000);


////        Simplefactory
//        Car car1 = SimpleFactory.getCar("五菱");
//        Car car2 = SimpleFactory.getCar("BYD");
//        car1.getName();
//        car2.getName();
//
////      MethodFactory
//        car1 = new WulingFactory().getCar();
//        car2 = new BYDFactory().getCar();
//        car1.getName();
//        car2.getName();
////      abstarce
//        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
//        IPhone phone = xiaoMiFactory.getPhone();
//        phone.call();
//        phone.sendSms();
//
//        IRoute route = xiaoMiFactory.getRoute();
//        route.openWifi();
//        route.setting();
//
//
//        HuaweiFactory huaweiFactory = new HuaweiFactory();
//
//        phone = huaweiFactory.getPhone();
//        phone.sendSms();
//        phone.call();
//        route = huaweiFactory.getRoute();
//        route.setting();
//        route.openWifi();

////        Adapter
////      电脑
//        Computer computer = new Computer();
////      网线
//        NetworkCable networkCable = new NetworkCable();
////      适配器 - 连接网线
//        Adapter2 adapter = new Adapter2(networkCable);
////      电脑连接 适配器，适配器连接网线 -> 上网
//        computer.connect(adapter);

////        bridge
//        Computer computer = new Desktop(new Apple());
//        Computer computer2 = new Laptop(new Dell());
//
//        computer.getName();
//        computer2.getName();

//        static proxy

        User user = new User();
        UserProxy userProxy = new UserProxy();
        userProxy.setUser(user);
        userProxy.add();
    }
}