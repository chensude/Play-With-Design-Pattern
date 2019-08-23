package com.yt.proxy;

public class ProxySubject implements Subject {


    Subject subject;
    public ProxySubject(Subject subject) {
        this.subject = subject;
    }


    @Override
    public void visit() {
        subject.visit();
    }
}
