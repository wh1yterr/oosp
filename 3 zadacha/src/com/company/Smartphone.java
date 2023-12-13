package com.company;

class Smartphone extends MobileDevice {
    public Smartphone(OperatingSystem os) {
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
