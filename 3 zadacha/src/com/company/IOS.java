package com.company;

class IOS implements OperatingSystem {
    @Override
    public void openApp(String appName) {
        System.out.println("�������� ���������� " + appName + " �� iOS");
    }

    @Override
    public void closeApp(String appName) {
        System.out.println("�������� ���������� " + appName + " �� iOS");
    }
}
