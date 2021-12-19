package memory;

public class Memory {
    private String name;
    private Boolean isBusy;

    public Memory(String name, Boolean isBusy) {
        this.name = name;
        this.isBusy = isBusy;
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
