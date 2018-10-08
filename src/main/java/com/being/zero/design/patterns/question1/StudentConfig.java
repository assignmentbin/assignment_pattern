package com.being.zero.design.patterns.question1;

public class StudentConfig implements PreDefinedConfig {

    public Processor getProcessor() {
        return Processor.INTEL_DUAL_CORE_I5;
    }

    public MotherBoard getMotherBoard() {
        return MotherBoard.ASUS;
    }

    public int getRamInGB() {
        return 4;
    }

    public int getHardDiskTB() {
        return 2;
    }

    public boolean isCdRomRequired() {
        return true;
    }

    public int getScreenSizeInch() {
        return 16;
    }

    public boolean isSsdDriveRequired() {
        return false;
    }
}
