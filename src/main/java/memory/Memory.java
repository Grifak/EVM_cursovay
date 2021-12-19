package memory;

public class Memory {
    int cntOwnData;
    int cntExternalData;
    Boolean isBusy;

    public Memory(int cntOwnData, int cntExternalData, Boolean isBusy) {
        this.cntOwnData = cntOwnData;
        this.cntExternalData = cntExternalData;
        this.isBusy = isBusy;
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }
}
