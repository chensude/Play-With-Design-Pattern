package com.yt;

public class GodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("要求找到代码组");
    }

    @Override
    public void add() {
        System.out.println("要求增加一项功能");
    }

    @Override
    public void delete() {
        System.out.println("要求删除一项功能");
    }

    @Override
    public void change() {
        System.out.println("要求修改代码");
    }

    @Override
    public void plan() {
        System.out.println("要求代码变更");
    }
}
