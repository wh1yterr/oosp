package com.company;


class BasicSmartSocket implements SmartSocket {
    private boolean isOn;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("����� ������� ��������");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("����� ������� ���������");
    }
}
