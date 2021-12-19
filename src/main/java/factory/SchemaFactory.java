package factory;

import memory.Memory;
import processor.Processor;

public interface SchemaFactory {
    default Memory getMemory(int cntOwnData, int cntExternalData, Boolean isBusy){
        return new Memory(cntOwnData, cntExternalData, isBusy);
    }
    Processor getProcessor();
}
