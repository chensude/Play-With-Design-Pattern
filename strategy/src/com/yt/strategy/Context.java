package com.yt.strategy;

/**
 * 策略的角色
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy=strategy;
    }

    public void operate() {
        strategy.operate();
    }
}
