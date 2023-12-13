package com.company;


class BasicSmartSocket implements SmartSocket {
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Умная розетка включена");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Умная розетка выключена");
    }
}
