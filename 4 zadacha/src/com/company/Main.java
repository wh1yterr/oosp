package com.company;
//������ �4 ������� 1
public class Main {
    public static void main(String[] args) {
        BasicSmartSocket basicSmartSocket = new BasicSmartSocket();

        SocketAdapter socketAdapter = new SocketAdapter(basicSmartSocket);

        socketAdapter.turnOn();
        socketAdapter.turnOff();
    }
}
