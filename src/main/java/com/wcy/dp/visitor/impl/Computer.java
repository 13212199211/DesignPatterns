package com.wcy.dp.visitor.impl;

import com.wcy.dp.visitor.ComputerPart;
import com.wcy.dp.visitor.Visitor;

public class Computer {
    ComputerPart CPU = new CPU();
    ComputerPart memory = new Memory();

    public void accept(Visitor visitor) {
        // 这里可以理解为facade门面模式，只是将visitor进行了一下分发，但是最后还是返回到visitor中去处理数据
        CPU.accept(visitor);
        memory.accept(visitor);
    }

}
