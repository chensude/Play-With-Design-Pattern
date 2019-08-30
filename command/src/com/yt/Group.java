package com.yt;

/**
 *
 * 做事的接受者
 */
public abstract class Group {

    //甲乙双方分开办公，你要和那个组讨论，你首先要找到这个组
    public abstract void find(); //被要求增加功能
    public abstract void add(); //被要求删除功能
    public abstract void delete(); //被要求修改功能
    public abstract void change();

    public abstract void plan();
}
