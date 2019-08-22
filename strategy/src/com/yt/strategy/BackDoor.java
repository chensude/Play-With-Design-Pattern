package com.yt.strategy;

public class BackDoor implements Strategy {
    @Override
    public void operate() {
        System.out.println("策略A");
    }
}
