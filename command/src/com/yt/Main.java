package com.yt;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new AddRequirementCommand());

        invoker.action();
    }
}
