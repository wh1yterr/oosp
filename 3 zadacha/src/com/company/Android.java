package com.company;

class Android implements OperatingSystem {
    @Override
    public void openApp(String appName) {
        System.out.println("�������� ���������� " + appName + " �� Android");
    }

    @Override
    public void closeApp(String appName) {
        System.out.println("�������� ���������� " + appName + " �� Android");
    }
}
