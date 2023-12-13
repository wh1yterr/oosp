package com.company;
//Задача №4 Вариант 1
public class Main {
    public static void main(String[] args) {
        BasicSmartSocket basicSmartSocket = new BasicSmartSocket();

        SocketAdapter socketAdapter = new SocketAdapter(basicSmartSocket);

        socketAdapter.turnOn();
        socketAdapter.turnOff();
    }
}
