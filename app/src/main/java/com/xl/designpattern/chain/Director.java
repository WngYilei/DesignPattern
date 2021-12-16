package com.xl.designpattern.chain;

public class Director extends Leader {
    @Override
    public int getLimit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println(money+"由主管批准");
    }
}
