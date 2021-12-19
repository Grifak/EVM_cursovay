package processor;

public class ProcessorPciCon extends Processor{
    @Override
    public void run() {
        runProgram(5,5);
        System.out.println(this.getName());
    }

    @Override
    void runProgram(int cntCommands, int cntMemCommands) {
        System.out.println("Run program on PROCESSOR with PCI con");
    }
}
