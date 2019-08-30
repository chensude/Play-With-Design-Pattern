package com.yt;

/**
 * 执行者，代理人
 */
public class Invoker {
    private Command command;

    public Invoker() {

    }

    public Invoker(Command command) {
        this.command=command;
    }

    public void action() {
        this.command.execute();
    }


}
