package com.wcy.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Button {

    List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void touch() {
        for (Observer observer : observers) {
            observer.observe(new ObserveEvent(this, System.currentTimeMillis()));
        }
    }
}
