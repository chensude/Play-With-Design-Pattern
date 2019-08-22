package com.yt.strategy;

/**
 * 测试策略模式
 */
public class Main {


    public static void main(String[] args) {
        //角色注入
        Context context;

        context=   new Context(new BackDoor());

        context.operate();
        System.out.println("执行策略A");

        context=   new Context(new GiveGreenLight());

        context.operate();
        System.out.println("执行策略B");


        context=   new Context(new BlockEnemy());

        context.operate();
        System.out.println("执行策略C");
    }



}
