package com.yt;

public class AddRequirementCommand extends Command {

    @Override
    public void execute() {
        //找到需求组
        rg.find();

        //增加一份需求
        rg.add();

        //给出计划
        rg.plan();
    }

}
