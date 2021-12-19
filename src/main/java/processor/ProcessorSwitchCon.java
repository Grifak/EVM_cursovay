package processor;

import memory.Memory;

public class ProcessorSwitchCon extends Processor{
    public ProcessorSwitchCon(Integer cntNoMemoryCom, Integer cntOwnMemoryCom, Integer cntExternalMemoryCom, Memory ownMemory) {
        super(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, ownMemory);
    }
}
