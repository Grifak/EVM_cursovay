package factory;

import memory.Memory;
import processor.Processor;

public interface SchemaFactory {
    Memory getMemory();
    Processor getProcessor();
}
