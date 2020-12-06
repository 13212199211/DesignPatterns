package com.wcy.dp.flyweight;

public class Circle implements Shape {
    private int xPos;
    private int yPos;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public void draw() {
        System.out.println("Color{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                ", color='" + color + '\'' +
                '}');
    }
}
