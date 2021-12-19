package processor;

import memory.Memory;

public class ProcessorSwitchCon extends Processor{
    public ProcessorSwitchCon(Integer cntNoMemoryCom,
                              Integer cntOwnMemoryCom,
                              Integer cntExternalMemoryCom,
                              Memory ownMemory,
                              String procName) {
        super(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, ownMemory, procName);
    }

    @Override
    public void runProgram() {

    }
}
