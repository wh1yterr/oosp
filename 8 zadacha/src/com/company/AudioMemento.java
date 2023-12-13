package com.company;

class AudioMemento {
    private final int volumeLevel;

    public AudioMemento(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}
