package com.company;


class SocketAdapter implements SmartSocket {
    private final BasicSmartSocket smartSocket;

    public SocketAdapter(BasicSmartSocket smartSocket) {
        this.smartSocket = smartSocket;
    }

    @Override
    public void turnOn() {
        smartSocket.turnOn();
    }

    @Override
    public void turnOff() {
        smartSocket.turnOff();
    }
}
