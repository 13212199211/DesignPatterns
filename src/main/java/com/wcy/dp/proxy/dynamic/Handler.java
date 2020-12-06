package com.wcy.dp.proxy.dynamic;

import com.wcy.dp.proxy.Movable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {
    Movable movable;

    public Handler(Movable movable) {
        this.movable = movable;
    }

    /**
     * 实现动态代理类的调用方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start invoke");
        method.invoke(movable, args);
        System.out.println("end invoke");
        return null;
    }
}
