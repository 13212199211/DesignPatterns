package com.wcy.dp.visitor.impl;

import com.wcy.dp.visitor.ComputerPart;
import com.wcy.dp.visitor.Visitor;

public class CPU implements ComputerPart {
    @Override
    public void accept(Visitor v) {
        v.visiteCPU(this);
    }

    @Override
    public double getPrice() {
        return 500;
    }
}
