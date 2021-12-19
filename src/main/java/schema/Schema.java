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
    private Integer time;

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

        int cntNoMemCommand = (int) (1000 * (cmdPercent/100.0));
        int cntMemCommand = (int) (1000 * cmdValue.doubleValue());
        int cntOwnDataCom = (int) (cntMemCommand * (memPercent/100.0));
        int cntExternalDataCom = (int) (cntMemCommand * memValue.doubleValue());

        SchemaFactory schemaFactory = makeSchemaFactory();
        CPU_1 = schemaFactory.getProcessor(cntNoMemCommand, cntMemCommand, cntExternalDataCom, memory_1);
        CPU_2 = schemaFactory.getProcessor(cntNoMemCommand, cntMemCommand, cntExternalDataCom, memory_2);
        CPU_3 = schemaFactory.getProcessor(cntNoMemCommand, cntMemCommand, cntExternalDataCom, memory_3);
        CPU_4 = schemaFactory.getProcessor(cntNoMemCommand, cntMemCommand, cntExternalDataCom, memory_4);

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

    protected abstract SchemaFactory makeSchemaFactory();

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Processor getCPU_1() {
        return CPU_1;
    }

    public void setCPU_1(Processor CPU_1) {
        this.CPU_1 = CPU_1;
    }

    public Processor getCPU_2() {
        return CPU_2;
    }

    public void setCPU_2(Processor CPU_2) {
        this.CPU_2 = CPU_2;
    }

    public Processor getCPU_3() {
        return CPU_3;
    }

    public void setCPU_3(Processor CPU_3) {
        this.CPU_3 = CPU_3;
    }

    public Processor getCPU_4() {
        return CPU_4;
    }

    public void setCPU_4(Processor CPU_4) {
        this.CPU_4 = CPU_4;
    }

    public Memory getMemory_1() {
        return memory_1;
    }

    public void setMemory_1(Memory memory_1) {
        this.memory_1 = memory_1;
    }

    public Memory getMemory_2() {
        return memory_2;
    }

    public void setMemory_2(Memory memory_2) {
        this.memory_2 = memory_2;
    }

    public Memory getMemory_3() {
        return memory_3;
    }

    public void setMemory_3(Memory memory_3) {
        this.memory_3 = memory_3;
    }

    public Memory getMemory_4() {
        return memory_4;
    }

    public void setMemory_4(Memory memory_4) {
        this.memory_4 = memory_4;
    }
}
