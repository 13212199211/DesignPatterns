package com.wcy.dp.visitor;

import com.wcy.dp.visitor.impl.Computer;
import com.wcy.dp.visitor.impl.PeopelVisitor;

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer();
        PeopelVisitor visitor = new PeopelVisitor();
        c.accept(visitor);
        visitor.getTotalPrice();
    }
}
