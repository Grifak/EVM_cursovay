package schema;

import factory.SchemaFactory;
import factory.SwitchSchemaFactory;

public class SwitchSchema extends Schema{
    private SchemaFactory schemaFactory = new SwitchSchemaFactory();

    public SwitchSchema() {
        super();
    }
}
