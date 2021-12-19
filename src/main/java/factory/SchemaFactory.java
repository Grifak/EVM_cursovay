package factory;

import memory.Memory;
import processor.Processor;

public interface SchemaFactory {
    default Memory getMemory(String name){
        return new Memory(name ,false);
    }
    Processor getProcessor(Integer cntNoMemoryCom,
                           Integer cntOwnMemoryCom,
                           Integer cntExternalMemoryCom,
                           Memory memory,
                           String procName,
                           Memory exMem_1,
                           Memory exMem_2,
                           Memory exMem_3);
}
