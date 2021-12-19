package factory;

import memory.Memory;
import processor.Processor;
import processor.ProcessorPciCon;

public class PciSchemaFactory implements SchemaFactory{

    @Override
    public Processor getProcessor(Integer cntNoMemoryCom, Integer cntOwnMemoryCom, Integer cntExternalMemoryCom, Memory memory) {
        return new ProcessorPciCon(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, memory);
    }
}
