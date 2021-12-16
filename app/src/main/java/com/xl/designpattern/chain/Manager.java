package com.xl.designpattern.chain;

public class Manager extends Leader {
    @Override
    public int getLimit() {
        return 20000;
    }

    @Override
    public void handle(int money) {
        System.out.println(money+"由经理批准");
    }
}
