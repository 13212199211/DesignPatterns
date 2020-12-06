package com.wcy.dp.proxy.single;

import com.wcy.dp.proxy.Movable;

import java.util.Date;

public class TimeProxy implements Movable {

    Movable movable;

    public TimeProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("start time is : " + new Date().toString());
        movable.move();
        System.out.println("end time is : " + new Date().toString());
    }

    @Override
    public void show() {
        movable.show();
    }
}
