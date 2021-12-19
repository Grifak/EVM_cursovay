package factory;

import memory.Memory;
import processor.Processor;
import processor.ProcessorSwitchCon;

public class SwitchSchemaFactory implements SchemaFactory{

    @Override
    public Processor getProcessor() {
        return new ProcessorSwitchCon();
    }
}
