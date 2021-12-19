package memory;

public class Memory {
    Boolean isBusy;

    public Memory(Boolean isBusy) {
        this.isBusy = isBusy;
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }
}
