package com.wcy.dp.proxy.single;

import com.wcy.dp.proxy.Movable;

public class LogProxy implements Movable {
    Movable movable;

    public LogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("log proxy start !");
        movable.move();
        System.out.println("log proxy end !");
    }

    @Override
    public void show() {
        movable.show();
    }
}
