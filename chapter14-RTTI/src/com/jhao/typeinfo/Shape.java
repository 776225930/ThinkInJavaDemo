package com.jhao.typeinfo;

/**
 * @author JiangHao
 * @date 2020/5/3
 * @describe
 */
public abstract class Shape {
    @Override
    public abstract String toString();

    public void draw() {
        System.out.println(this + ".draw()");

    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

