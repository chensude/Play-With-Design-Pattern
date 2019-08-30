package com.yt;

public class DeletePageComand extends Command {


    @Override
    public void execute() {
        pg.find();
        pg.delete();
        pg.plan();
    }
}
