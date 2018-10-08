package com.being.zero.design.patterns.question1;

public interface PreDefinedConfig {

    Processor getProcessor();
    MotherBoard getMotherBoard();
    int getRamInGB();
    int getHardDiskTB();
    boolean isCdRomRequired();
    int getScreenSizeInch();
    boolean isSsdDriveRequired();
}
