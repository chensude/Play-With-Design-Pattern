package com.yt;

public class Main {

    public static void main(String[] args) {

        //白色
        Color white = new White();
        //正方形
        Shape circle = new Circle();
        //白色的正方形
        circle.setColor(white);
        circle.draw();

        //长方形
        Shape rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();
    }
}
