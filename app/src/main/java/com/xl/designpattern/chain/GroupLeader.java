package com.xl.designpattern.chain;

public class GroupLeader extends Leader {
    @Override
    public int getLimit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println(money+"由组长批准");
    }
}
