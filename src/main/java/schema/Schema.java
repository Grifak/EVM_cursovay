package schema;

import factory.SchemaFactory;
import memory.Memory;
import processor.Processor;

public abstract class Schema {
    private Processor CPU_1;
    private Processor CPU_2;
    private Processor CPU_3;
    private Processor CPU_4;

    public Processor getCPU_1() {
        return CPU_1;
    }

    private Memory memory_1;
    private Memory memory_2;
    private Memory memory_3;
    private Memory memory_4;

    private SchemaFactory schemaFactory;

    public Schema() {
        CPU_1 = schemaFactory.getProcessor();
        CPU_2 = schemaFactory.getProcessor();
        CPU_3 = schemaFactory.getProcessor();
        CPU_4 = schemaFactory.getProcessor();

        memory_1 = schemaFactory.getMemory();
        memory_2 = schemaFactory.getMemory();
        memory_3 = schemaFactory.getMemory();
        memory_4 = schemaFactory.getMemory();
    }

    public void runSchema(int cntCom, int cntMemCom){
        CPU_1.runProgram(cntCom, cntMemCom);
        CPU_2.runProgram(cntCom, cntMemCom);
        CPU_3.runProgram(cntCom, cntMemCom);
        CPU_4.runProgram(cntCom, cntMemCom);
    }
}
