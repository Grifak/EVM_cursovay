package schema;

import factory.SchemaFactory;
import factory.SwitchSchemaFactory;

public class SwitchSchema extends Schema{

    public SwitchSchema() {
        super();
    }

    @Override
    public void runSchema() {
        System.out.println("Run Switch schema");
        super.runSchema();
    }

    @Override
    protected SchemaFactory makeSchemaFactory() {
        return new SwitchSchemaFactory();
    }
}
