package processor;

import memory.Memory;

public class ProcessorSwitchCon extends Processor{
    public ProcessorSwitchCon(Integer cntNoMemoryCom, Integer cntOwnMemoryCom, Integer cntExternalMemoryCom, Memory ownMemory) {
        super(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, ownMemory);
    }

    @Override
    public void runProgram(int cntCommands, int cntMemCommands) {
        System.out.println("Run program on processor with SWITCH con");
    }
}
