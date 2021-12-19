package processor;

import memory.Memory;

public class ProcessorSwitchCon extends Processor{
    public ProcessorSwitchCon(Integer cntNoMemoryCom,
                              Integer cntOwnMemoryCom,
                              Integer cntExternalMemoryCom,
                              Memory ownMemory,
                              String procName,
                              Memory exMem_1,
                              Memory exMem_2,
                              Memory exMem_3) {
        super(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, ownMemory, procName, exMem_1, exMem_2, exMem_3);
    }

    @Override
    public void runProgram() {

    }
}
