package processor;

import memory.Memory;

public class ProcessorPciCon extends Processor{
    public ProcessorPciCon(Integer cntNoMemoryCom, Integer cntOwnMemoryCom, Integer cntExternalMemoryCom, Memory ownMemory) {
        super(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, ownMemory);
    }

    @Override
    void runProgram(int cntCommands, int cntMemCommands) {
        System.out.println("Run program on PROCESSOR with PCI con");
    }
}
