package processor;

import memory.Memory;

import java.util.concurrent.TimeUnit;

public class ProcessorPciCon extends Processor{
    public ProcessorPciCon(Integer cntNoMemoryCom, Integer cntOwnMemoryCom, Integer cntExternalMemoryCom, Memory ownMemory, String procName) {
        super(cntNoMemoryCom, cntOwnMemoryCom, cntExternalMemoryCom, ownMemory, procName);
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
                    super.status = Status.fromString(ownMemory.getName());
                    TimeUnit.SECONDS.sleep(2);
                    super.cntOwnMemoryCom--;
                }
                case 1-> {
                    super.status = Status.fromString(getRandomMemory());
                    TimeUnit.SECONDS.sleep(2);
                    super.cntExternalMemoryCom--;
                }
            }
            System.out.println(toString());
        }
    }
}
