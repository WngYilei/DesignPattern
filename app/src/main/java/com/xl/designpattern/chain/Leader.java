package com.xl.designpattern.chain;

public abstract class Leader {
     Leader nextLeader;

    public void setNextLeader(Leader leader) {
        this.nextLeader = leader;
    }

    public final void handleRequest(int money) {
        if (money <= getLimit()) {
            handle(money);
        } else {
            if (nextLeader != null) {
                nextLeader.handleRequest(money);
            } else {
                System.out.println(money + "没人能批准");
            }
        }
    }

    public abstract int getLimit();

    public abstract void handle(int money);
}
