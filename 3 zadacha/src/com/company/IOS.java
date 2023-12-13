package com.company;

class IOS implements OperatingSystem {
    @Override
    public void openApp(String appName) {
        System.out.println("Открытие приложения " + appName + " на iOS");
    }

    @Override
    public void closeApp(String appName) {
        System.out.println("Закрытие приложения " + appName + " на iOS");
    }
}
