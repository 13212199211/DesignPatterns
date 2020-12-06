package com.wcy.dp.observer;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ObserveEvent {
    private Object source;
    private long actionTime;

    public ObserveEvent(Object source, long actionTime) {
        this.source = source;
        this.actionTime = actionTime;
    }
}
