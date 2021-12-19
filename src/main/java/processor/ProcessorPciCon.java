package processor;

import memory.Memory;

import java.sql.Time;
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
        Integer cntOwnMemoryCom = this.getCntOwnMemoryCom();
        Integer cntExternalMemoryCom = this.getCntExternalMemoryCom();

        while (cntOwnMemoryCom != 0 && cntExternalMemoryCom !=0){
            Integer comNumber = (int)(Math.random() * 2);
            switch (comNumber){
                case 0-> {
                    TimeUnit.SECONDS.sleep(2);
                    setCntOwnMemoryCom(--cntOwnMemoryCom);
                }
                case 1-> {
                    TimeUnit.SECONDS.sleep(2);
                    setCntExternalMemoryCom(--cntExternalMemoryCom);
                }
            }
        }
    }
}
