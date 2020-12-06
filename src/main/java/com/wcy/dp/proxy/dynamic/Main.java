package com.wcy.dp.proxy.dynamic;

import com.wcy.dp.proxy.Movable;
import com.wcy.dp.proxy.Tank;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // 动态代理时将生成的代理类保存
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Movable movable = new Tank();
        Movable mov = (Movable) Proxy.newProxyInstance(
                Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new Handler(movable));
        mov.move();
        mov.show();
    }
}
