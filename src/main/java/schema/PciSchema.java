package schema;


import factory.PciSchemaFactory;
import factory.SchemaFactory;

public class PciSchema extends Schema {
    public PciSchema(Integer cmdPercent, Integer memPercent) {
        super(cmdPercent, memPercent);
    }

    @Override
    protected SchemaFactory makeSchemaFactory() {
        return new PciSchemaFactory();
    }

    @Override
    public void runSchema() {
        System.out.println("Run PCI schema");
        long start = System.currentTimeMillis();
        super.CPU_1.start();
        super.CPU_2.start();
        super.CPU_3.start();
        super.CPU_4.start();
        long end = System.currentTimeMillis() + (super.CPU_1.getCntNoMemoryCom() * 1000);
        this.time = (end - start)/1000.0;

    }
}
