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
        super.runSchema();
    }
}
