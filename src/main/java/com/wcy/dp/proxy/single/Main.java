package com.wcy.dp.proxy.single;

import com.wcy.dp.proxy.Movable;
import com.wcy.dp.proxy.Tank;

public class Main {
    public static void main(String[] args) {
        Movable tank = new Tank();
        // 日志代理
        Movable logProxy = new LogProxy(tank);
        // 时间代理
        Movable timeProxy = new TimeProxy(logProxy);
        timeProxy.move();
    }
}
