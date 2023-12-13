package com.company;

class HarmonyOS implements OperatingSystem {
    @Override
    public void openApp(String appName) {
        System.out.println("Открытие приложения " + appName + " на HarmonyOS");
    }

    @Override
    public void closeApp(String appName) {
        System.out.println("Закрытие приложения " + appName + " на HarmonyOS");
    }
}
