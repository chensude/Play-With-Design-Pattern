package com.yt.proxy;

public class RealSubject implements Subject{

    @Override
    public void visit() {
        System.out.println("真实被代理类做事情");
    }
}
