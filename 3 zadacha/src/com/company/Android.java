package com.company;

class Android implements OperatingSystem {
    @Override
    public void openApp(String appName) {
        System.out.println("Открытие приложения " + appName + " на Android");
    }

    @Override
    public void closeApp(String appName) {
        System.out.println("Закрытие приложения " + appName + " на Android");
    }
}
