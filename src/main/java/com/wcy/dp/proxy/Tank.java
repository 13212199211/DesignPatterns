package com.wcy.dp.proxy;

import com.wcy.dp.proxy.Movable;

public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("i am moving !");
    }

    @Override
    public void show() {
        System.out.println("let me show you !");
    }
}
