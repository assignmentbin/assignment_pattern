package com.being.zero.design.patterns.question1;

public class Computer {

    private Processor processor; //type of processor
    private MotherBoard motherBoard; // mother board company
    private int ramInGB; // ram size in GB, 2,4,8,16
    private int hardDiskTB; // hard disk in B, 1, 2 etc
    private boolean cdRom; //true -> need cdrom, false -> no cdrom
    private int screenSizeInch; // screen size in inches
    private boolean ssdDrive; // true -> include SSD , false -> no


    /**
     * DO NOT CHANGE
     * @return
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Processor: " + processor);
        builder.append(", motherBoard: " + motherBoard);
        builder.append(", ram: " + ramInGB + "GB");
        builder.append(", hardDisk: " + hardDiskTB + "TB");
        builder.append(", CDRome Included: " + cdRom);
        builder.append(", Screen Size: " + screenSizeInch + "inch");
        builder.append(", SSD Included: " + ssdDrive);
        return builder.toString();
    }
}
