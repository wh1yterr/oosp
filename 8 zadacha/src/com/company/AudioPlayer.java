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
        System.out.println("��������� ����������� �� �������: " + volumeLevel);
    }

    public void restoreFromMemento(AudioMemento memento) {
        volumeLevel = memento.getVolumeLevel();
        System.out.println("������������ ������� ���������: " + volumeLevel);
    }

    public AudioMemento createMemento() {
        return new AudioMemento(volumeLevel);
    }

    public void saveVolumeLevel() {
        AudioMemento memento = createMemento();
        mementoStack.push(memento);
        System.out.println("������� ��������� ��������.");
    }

    public void undoVolumeLevel() {
        if (!mementoStack.isEmpty()) {
            AudioMemento memento = mementoStack.pop();
            restoreFromMemento(memento);
            System.out.println("������ ������ ���������.");
        } else {
            System.out.println("������ ��������. ���� ������� ����.");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}
