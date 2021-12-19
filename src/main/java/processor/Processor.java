package processor;

public abstract class Processor extends Thread{
    abstract void runProgram(int cntCommands, int cntMemCommands);
}
