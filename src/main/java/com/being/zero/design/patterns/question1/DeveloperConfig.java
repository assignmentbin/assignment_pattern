package com.being.zero.design.patterns.question1;

public class DeveloperConfig implements PreDefinedConfig {

    public Processor getProcessor() {
        return Processor.INTEL_QUAD_CORE_I7;
    }

    public MotherBoard getMotherBoard() {
        return MotherBoard.INTEL;
    }

    public int getRamInGB() {
        return 16;
    }

    public int getHardDiskTB() {
        return 4;
    }

    public boolean isCdRomRequired() {
        return false;
    }

    public int getScreenSizeInch() {
        return 18;
    }

    public boolean isSsdDriveRequired() {
        return true;
    }
}
