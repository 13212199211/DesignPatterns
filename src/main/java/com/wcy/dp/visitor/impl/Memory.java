package com.wcy.dp.visitor.impl;

import com.wcy.dp.visitor.ComputerPart;
import com.wcy.dp.visitor.Visitor;

public class Memory implements ComputerPart {

    @Override
    public void accept(Visitor v) {
        v.visiteMemory(this);
    }

    @Override
    public double getPrice() {
        return 200;
    }
}
