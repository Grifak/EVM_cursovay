package processor;

public class ProcessorSwitchCon extends Processor{
    @Override
    public void run() {
        runProgram(5,5);
        System.out.println(this.getName());
    }

    @Override
    public void runProgram(int cntCommands, int cntMemCommands) {
        System.out.println("Run program on processor with SWITCH con");
    }
}
