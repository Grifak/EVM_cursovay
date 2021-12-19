package schema;

import factory.SchemaFactory;
import memory.Memory;
import processor.Processor;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class Schema {
    private final Integer cntCommands = 1000;
    private Integer cmdPercent;
    private Integer memPercent;
    private Float time;

    private Processor CPU_1;
    private Processor CPU_2;
    private Processor CPU_3;
    private Processor CPU_4;

    private Memory memory_1;
    private Memory memory_2;
    private Memory memory_3;
    private Memory memory_4;

    public Schema(Integer cmdPercent, Integer memPercent) {
        MathContext context = new MathContext(5, RoundingMode.HALF_UP);
        BigDecimal cmdValue = new BigDecimal((1 - cmdPercent/100.0), context);
        BigDecimal memValue = new BigDecimal((1 - memPercent/100.0), context);

        int noMemCommand = (int) (1000 * (cmdPercent/100.0));
        int memCommand = (int) (1000 * cmdValue.doubleValue());
        int cntOwnData = (int) (memCommand * (memPercent/100.0));
        int cntExternalData = (int) (memCommand * memValue.doubleValue());
        Boolean isBusy = false;

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

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    abstract protected SchemaFactory makeSchemaFactory();
}
