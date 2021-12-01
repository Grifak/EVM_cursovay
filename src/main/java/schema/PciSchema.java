package schema;

import factory.PciSchemaFactory;
import factory.SchemaFactory;

public class PciSchema extends Schema{
    private SchemaFactory schemaFactory = new PciSchemaFactory();

    public PciSchema() {
        super();
    }
}
