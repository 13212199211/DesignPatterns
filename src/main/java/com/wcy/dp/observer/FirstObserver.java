package com.wcy.dp.observer;

public class FirstObserver implements Observer {
    @Override
    public void observe(ObserveEvent observeEvent) {
        System.out.println("First action happend at time : " + observeEvent.getActionTime());
        System.out.println("source is : " + observeEvent.getSource());
    }
}
