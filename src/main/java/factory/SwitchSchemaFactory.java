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
                                  String procName) {
        return new ProcessorSwitchCon(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, memory, procName);
    }
}
