package com.wcy.dp.visitor;

public interface ComputerPart {
    // 接收不同的消费者
    void accept(Visitor v);
    // 价格
    double getPrice();
}

