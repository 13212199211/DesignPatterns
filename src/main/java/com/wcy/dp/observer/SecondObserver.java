package com.wcy.dp.observer;

public class SecondObserver implements Observer {
    @Override
    public void observe(ObserveEvent observeEvent) {
        System.out.println("Second action happend at time : " + observeEvent.getActionTime());
        System.out.println("source is : " + observeEvent.getSource());
    }
}
