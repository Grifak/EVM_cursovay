package processor;

import memory.Memory;

import java.util.concurrent.TimeUnit;

public class ProcessorPciCon extends Processor{
    public ProcessorPciCon(Integer cntNoMemoryCom, Integer cntOwnMemoryCom, Integer cntExternalMemoryCom, Memory ownMemory) {
        super(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, ownMemory);
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
        while (super.cntOwnMemoryCom != 0 && super.cntExternalMemoryCom !=0){
            Integer comNumber = (int)(Math.random() * 2);
            switch (comNumber){
                case 0-> {
                    TimeUnit.SECONDS.sleep(2);
                    super.cntOwnMemoryCom--;
                }
                case 1-> {
                    TimeUnit.SECONDS.sleep(2);
                    super.cntExternalMemoryCom--;
                }
            }
        }
    }
}
