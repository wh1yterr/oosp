package com.company;

class HarmonyOS implements OperatingSystem {
    @Override
    public void openApp(String appName) {
        System.out.println("�������� ���������� " + appName + " �� HarmonyOS");
    }

    @Override
    public void closeApp(String appName) {
        System.out.println("�������� ���������� " + appName + " �� HarmonyOS");
    }
}
