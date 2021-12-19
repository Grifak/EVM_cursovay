package factory;

import memory.Memory;
import processor.Processor;

public interface SchemaFactory {
    default Memory getMemory(){
        return new Memory(false);
    }
    Processor getProcessor();
}
