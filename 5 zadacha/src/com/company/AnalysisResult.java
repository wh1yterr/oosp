package com.company;

import java.util.ArrayList;
import java.util.List;

class AnalysisResult implements Observable {
    private List<Observer> observers = new ArrayList<Observer>();
    private String message;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void updateResult(String newMessage) {
        this.message = newMessage;
        notifyObservers(newMessage);
    }
}
