package com.yt;

import java.util.HashMap;

/**
 * 工厂方法模式还有一个非常重要的应用，就是延迟始化(Lazy initialization)，
 * 什么是延迟始化呢? 一个对象初始化完毕后就不释放，等到再次用到得就不用再次初始化了，直接从内存过中拿到就可以了，
 */

public class HumanFactory {

    private static HashMap<String,Human> humans=  new HashMap<>();
    public static Human createHuman(Class c) {
        Human human = null;

        try{
            if(humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            }else {

                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(),human);
            }
        }catch (Exception e){
            System.out.println("定义有问题");
        }

        return human;
    }
}
