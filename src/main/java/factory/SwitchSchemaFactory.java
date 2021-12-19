package factory;

import memory.Memory;
import processor.Processor;
import processor.ProcessorSwitchCon;

public class SwitchSchemaFactory implements SchemaFactory{

    @Override
    public Processor getProcessor(Integer cntNoMemoryCom,
                                  Integer cntOwnMemoryCom,
                                  Integer cntExternalMemoryCom,
                                  Memory memory,
                                  String procName,
                                  Memory exMem_1,
                                  Memory exMem_2,
                                  Memory exMem_3) {
        return new ProcessorSwitchCon(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, memory, procName, exMem_1, exMem_2, exMem_3);
    }
}
