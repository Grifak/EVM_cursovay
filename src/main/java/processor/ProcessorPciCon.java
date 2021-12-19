package processor;

import memory.Memory;

import java.util.concurrent.TimeUnit;

public class ProcessorPciCon extends Processor{
    public ProcessorPciCon(Integer cntNoMemoryCom,
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
    public void run() {
        try {
            runProgram();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void runProgram() throws InterruptedException {
        while (!(super.cntOwnMemoryCom == 0 && super.cntExternalMemoryCom == 0)){
            if(super.cntExternalMemoryCom == 0) {
                workWithOwnMem();
                continue;
            }
            if(super.cntOwnMemoryCom == 0){
                workWithExternalMem();
                continue;
            }
            Integer comNumber = (int) (Math.random() * 2);
            switch (comNumber){
                case 0-> {
                    workWithOwnMem();
                }
                case 1-> {
                    workWithExternalMem();
                }
            }
        }
    }
}
