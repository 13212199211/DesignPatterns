package com.wcy.dp.visitor.impl;

import com.wcy.dp.visitor.Visitor;

public class PeopelVisitor implements Visitor {
    private double totalPrice;

    @Override
    public void visiteCPU(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visiteMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.8;
    }

    public void getTotalPrice() {
        System.out.println(totalPrice);
    }
}
