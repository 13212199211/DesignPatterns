package com.wcy.dp.flyweight;


/**
 * 享元模式，实例共享同一个元数据
 */
public class Main {
    private static String[] colors = new String[]{"red", "blue", "green", "yellow"};

    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
            circle.setxPos((int) (Math.random() * 100));
            circle.setyPos((int) (Math.random() * 100));
            circle.draw();
        }

    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
