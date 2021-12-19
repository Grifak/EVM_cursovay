package processor;

import memory.Memory;

public abstract class Processor extends Thread{
    protected Status status;
    protected Integer cntNoMemoryCom;
    protected Integer cntOwnMemoryCom;
    protected Integer cntExternalMemoryCom;
    protected Memory ownMemory;

    public Processor(Integer cntNoMemoryCom, Integer cntOwnMemoryCom, Integer cntExternalMemoryCom, Memory ownMemory){
        this.cntNoMemoryCom = cntNoMemoryCom;
        this.cntOwnMemoryCom = cntOwnMemoryCom;
        this.cntExternalMemoryCom = cntExternalMemoryCom;
        this.ownMemory = ownMemory;
    }

    public abstract void runProgram() throws InterruptedException;

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
