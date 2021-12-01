package processor;

public abstract class Processor extends Thread{
    abstract public void runProgram(int cntCommands, int cntMemCommands);
}
