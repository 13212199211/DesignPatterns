package com.wcy.dp.visitor;

import com.wcy.dp.visitor.impl.CPU;
import com.wcy.dp.visitor.impl.Memory;

public interface Visitor {
    void visiteCPU(CPU cpu);

    void visiteMemory(Memory memory);
}
