package com.company;

class Tablet extends MobileDevice {
    public Tablet(OperatingSystem os) {
        super(os);
    }

    @Override
    void runApp(String appName) {
        os.openApp(appName);
    }

    @Override
    void closeApp(String appName) {
        os.closeApp(appName);
    }
}
