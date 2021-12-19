package processor;

import memory.Memory;

import java.util.concurrent.TimeUnit;

public abstract class Processor extends Thread{
    protected String procName;
    protected Status status;
    protected Integer cntNoMemoryCom;
    protected Integer cntOwnMemoryCom;
    protected Integer cntExternalMemoryCom;
    protected Memory ownMemory;
    protected Memory exMem_1;
    protected Memory exMem_2;
    protected Memory exMem_3;

    public Processor(Integer cntNoMemoryCom,
                     Integer cntOwnMemoryCom,
                     Integer cntExternalMemoryCom,
                     Memory ownMemory,
                     String procName,
                     Memory exMem_1,
                     Memory exMem_2,
                     Memory exMem_3){
        this.cntNoMemoryCom = cntNoMemoryCom;
        this.cntOwnMemoryCom = cntOwnMemoryCom;
        this.cntExternalMemoryCom = cntExternalMemoryCom;
        this.ownMemory = ownMemory;
        this.procName = procName;
        this.exMem_1 = exMem_1;
        this.exMem_2 = exMem_2;
        this.exMem_3 = exMem_3;
    }

    public abstract void runProgram() throws InterruptedException;

    public Memory getRandomMemory(){
        Integer memNumber = (int)(Math.random() * 3);
        Memory memory = null;
        switch (memNumber){
            case 0 -> memory = this.exMem_1;
            case 1 -> memory = this.exMem_2;
            case 2 -> memory = this.exMem_3;
        }

        return memory;
    }

    @Override
    public String toString() {
        return procName + ": " + status.getTitle();
    }

    public synchronized void workWithOwnMem() throws InterruptedException {
        if(ownMemory.getBusy() == true) {
            this.wait();
            this.status = Status.WAIT;
            System.out.println(toString());
        }
        else {
            this.status = Status.fromString(ownMemory.getName());
            ownMemory.setBusy(true);
            System.out.println(toString());
            TimeUnit.SECONDS.sleep(2);
            this.cntOwnMemoryCom--;
            ownMemory.setBusy(false);
            notify();
        }
    }

    public synchronized void workWithExternalMem() throws InterruptedException {
        Memory exMem = getRandomMemory();
        if(exMem.getBusy() == true) {
            this.wait();
            this.status = Status.WAIT;
            System.out.println(toString());
        }
        else {
            this.status = Status.fromString(exMem.getName());
            System.out.println(toString());
            TimeUnit.SECONDS.sleep(2);
            this.cntExternalMemoryCom--;
        }
    }

    public String getProcName() {
        return procName;
    }

    public void setProcName(String procName) {
        this.procName = procName;
    }

    public Integer getCntNoMemoryCom() {
        return cntNoMemoryCom;
    }

    public void setCntNoMemoryCom(Integer cntNoMemoryCom) {
        this.cntNoMemoryCom = cntNoMemoryCom;
    }

    public Integer getCntOwnMemoryCom() {
        return cntOwnMemoryCom;
    }

    public void setCntOwnMemoryCom(Integer cntOwnMemoryCom) {
        this.cntOwnMemoryCom = cntOwnMemoryCom;
    }

    public Integer getCntExternalMemoryCom() {
        return cntExternalMemoryCom;
    }

    public void setCntExternalMemoryCom(Integer cntExternalMemoryCom) {
        this.cntExternalMemoryCom = cntExternalMemoryCom;
    }

    public String getStatus(){
        return this.status.getTitle();
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
