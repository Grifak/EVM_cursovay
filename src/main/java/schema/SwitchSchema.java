package schema;

import factory.SchemaFactory;
import factory.SwitchSchemaFactory;
import processor.Status;

public class SwitchSchema extends Schema{
    public SwitchSchema(Integer cmdPercent, Integer memPercent) {
        super(cmdPercent, memPercent);
    }

    @Override
    protected SchemaFactory makeSchemaFactory() {
        return new SwitchSchemaFactory();
    }

    @Override
    public void runSchema() {
        super.CPU_1.setStatus(Status.START);
        super.CPU_2.setStatus(Status.START);
        super.CPU_3.setStatus(Status.START);
        super.CPU_4.setStatus(Status.START);
        System.out.println("Run SWITCH schema");

        long start = System.currentTimeMillis();
        super.CPU_1.start();
        super.CPU_2.start();
        super.CPU_3.start();
        super.CPU_4.start();

        try{
            super.CPU_1.join();
            super.CPU_2.join();
            super.CPU_3.join();
            super.CPU_4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis() + (super.CPU_1.getCntNoMemoryCom() * 500);
        this.time = (end - start)/1000.0;
        System.out.println(String.format("Program was completed in %f seconds", time));
    }
}
