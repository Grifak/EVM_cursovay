package processor;

import memory.Memory;

public class ProcessorPciCon extends Processor{
    public ProcessorPciCon(Integer cntNoMemoryCom, Integer cntOwnMemoryCom, Integer cntExternalMemoryCom, Memory ownMemory) {
        super(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, ownMemory);
    }
}
