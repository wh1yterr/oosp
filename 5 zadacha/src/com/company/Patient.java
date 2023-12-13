package com.company;

class Patient implements Observer {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Пациент " + name + ", получил уведомление: " + message);
    }
}
