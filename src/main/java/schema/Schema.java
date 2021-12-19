package schema;

import factory.SchemaFactory;
import memory.Memory;
import processor.Processor;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class Schema {
    protected final Integer cntCommands = 100;
    protected Integer cmdPercent;
    protected Integer memPercent;
    protected Double time;

    protected Processor CPU_1;
    protected Processor CPU_2;
    protected Processor CPU_3;
    protected Processor CPU_4;

    protected Memory memory_1;
    protected Memory memory_2;
    protected Memory memory_3;
    protected Memory memory_4;

    public Schema(Integer cmdPercent, Integer memPercent) {
        MathContext context = new MathContext(5, RoundingMode.HALF_UP);
        BigDecimal cmdValue = new BigDecimal((1 - cmdPercent/100.0), context);
        BigDecimal memValue = new BigDecimal((1 - memPercent/100.0), context);

        int cntNoMemCommand = (int) (cntCommands * (cmdPercent/100.0));
        int cntMemCommand = (int) (cntCommands * cmdValue.doubleValue());
        int cntOwnDataCom = (int) (cntMemCommand * (memPercent/100.0));
        int cntExternalDataCom = (int) (cntMemCommand * memValue.doubleValue());

        SchemaFactory schemaFactory = makeSchemaFactory();
        CPU_1 = schemaFactory.getProcessor(cntNoMemCommand, cntMemCommand, cntExternalDataCom, memory_1);
        CPU_2 = schemaFactory.getProcessor(cntNoMemCommand, cntMemCommand, cntExternalDataCom, memory_2);
        CPU_3 = schemaFactory.getProcessor(cntNoMemCommand, cntMemCommand, cntExternalDataCom, memory_3);
        CPU_4 = schemaFactory.getProcessor(cntNoMemCommand, cntMemCommand, cntExternalDataCom, memory_4);

        memory_1 = schemaFactory.getMemory("MEMORY_1");
        memory_2 = schemaFactory.getMemory("MEMORY_2");
        memory_3 = schemaFactory.getMemory("MEMORY_3");
        memory_4 = schemaFactory.getMemory("MEMORY_4");
    }

    public abstract void runSchema();

    protected abstract SchemaFactory makeSchemaFactory();
}
