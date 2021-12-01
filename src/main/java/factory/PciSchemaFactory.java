package factory;

import memory.Memory;
import processor.Processor;
import processor.ProcessorPciCon;

public class PciSchemaFactory implements SchemaFactory{

    @Override
    public Processor getProcessor() {
        return new ProcessorPciCon();
    }
}
