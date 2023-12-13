package com.company;

abstract class MobileDevice {
    protected OperatingSystem os;

    public MobileDevice(OperatingSystem os) {
        this.os = os;
    }

    abstract void runApp(String appName);

    abstract void closeApp(String appName);
}
