package com.jhao.stringdemo;

import java.util.Formatter;

/**
 * @author JiangHao
 * @date 2020/5/2
 * @describe
 */
public class Turtle {

    private String name;
    public Formatter formatter;

    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }

    public void move(int x, int y) {
        formatter.format("%s The turtle is at (%d, %d)\n", name, x, y);
    }

    public static void main(String[] args) {
        Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
        tommy.move(1, 1);
        Turtle terry = new Turtle("Terry", new Formatter(System.err));
        terry.move(2, 2);
    }
}
