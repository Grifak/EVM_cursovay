package schema;

import factory.SchemaFactory;
import memory.Memory;
import processor.Processor;

public abstract class Schema {
    private Processor CPU_1;
    private Processor CPU_2;
    private Processor CPU_3;
    private Processor CPU_4;

    private Memory memory_1;
    private Memory memory_2;
    private Memory memory_3;
    private Memory memory_4;

    public Schema() {
        SchemaFactory schemaFactory = makeSchemaFactory();
        CPU_1 = schemaFactory.getProcessor();
        CPU_2 = schemaFactory.getProcessor();
        CPU_3 = schemaFactory.getProcessor();
        CPU_4 = schemaFactory.getProcessor();

        memory_1 = schemaFactory.getMemory();
        memory_2 = schemaFactory.getMemory();
        memory_3 = schemaFactory.getMemory();
        memory_4 = schemaFactory.getMemory();
    }

    public void runSchema(){
        CPU_1.run();
        CPU_2.run();
        CPU_3.run();
        CPU_4.run();
    }

    abstract protected SchemaFactory makeSchemaFactory();
}
