package processor;

import memory.Memory;

public abstract class Processor extends Thread{
    private Status status;
    private Integer cntNoMemoryCom;
    private Integer cntOwnMemoryCom;
    private Integer cntExternalMemoryCom;
    private Memory ownMemory;

    public Processor(Integer cntNoMemoryCom, Integer cntOwnMemoryCom, Integer cntExternalMemoryCom, Memory ownMemory){
        this.cntNoMemoryCom = cntNoMemoryCom;
        this.cntOwnMemoryCom = cntOwnMemoryCom;
        this.cntExternalMemoryCom = cntExternalMemoryCom;
        this.ownMemory = ownMemory;
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
}
