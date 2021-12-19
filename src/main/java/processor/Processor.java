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

    public String getRandomMemory(){
        Integer memNumber = (int)(Math.random() * 4);
        String memName = null;
        switch (memNumber){
            case 0 -> memName = "MEMORY_1";
            case 1 -> memName = "MEMORY_2";
            case 2 -> memName = "MEMORY_3";
            case 3 -> memName = "MEMORY_4";
        }

        return memName;
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
