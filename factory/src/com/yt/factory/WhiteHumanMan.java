package com.yt.factory;

/**
 * 为啥要定义抽象类
 * 因为要区分性别
 */
public class WhiteHumanMan extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("白种人性别为女");
    }
}
