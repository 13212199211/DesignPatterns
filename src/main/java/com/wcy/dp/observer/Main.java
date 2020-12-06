package com.wcy.dp.observer;

/**
 * 观察者模式
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Button button = new Button();
        button.addObserver(new FirstObserver());
        button.addObserver(new SecondObserver());
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            button.touch();
        }
    }
}
