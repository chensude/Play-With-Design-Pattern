package com.yt.strategy;

public class GiveGreenLight implements Strategy {
    @Override
    public void operate() {
        System.out.println("策略B");
    }
}
