package com.company;

import java.util.Stack;

class AudioPlayer {
    private int volumeLevel;
    private final Stack<AudioMemento> mementoStack;

    public AudioPlayer() {
        volumeLevel = 50;
        mementoStack = new Stack<AudioMemento>();
    }

    public void setVolume(int volume) {
        volumeLevel = volume;
        System.out.println("Громкость установлена на уровень: " + volumeLevel);
    }

    public void restoreFromMemento(AudioMemento memento) {
        volumeLevel = memento.getVolumeLevel();
        System.out.println("Восстановлен уровень громкости: " + volumeLevel);
    }

    public AudioMemento createMemento() {
        return new AudioMemento(volumeLevel);
    }

    public void saveVolumeLevel() {
        AudioMemento memento = createMemento();
        mementoStack.push(memento);
        System.out.println("Уровень громкости сохранен.");
    }

    public void undoVolumeLevel() {
        if (!mementoStack.isEmpty()) {
            AudioMemento memento = mementoStack.pop();
            restoreFromMemento(memento);
            System.out.println("Отмена уровня громкости.");
        } else {
            System.out.println("Нечего отменять. Стек снимков пуст.");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}
