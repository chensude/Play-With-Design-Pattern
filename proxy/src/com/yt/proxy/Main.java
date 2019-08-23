package com.yt.proxy;

public class Main {

    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();
    }
}
