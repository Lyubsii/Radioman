package ru.netology.services;

public class Radio {
    public int numberRadioStation;
    public int increaseVolume;
    private int currentVolume;

    public void setNumberRadioStation(int newNumberRadioStation) {
        numberRadioStation = newNumberRadioStation;
    }

    public void setToMaxRadioStation(int i) {
        numberRadioStation = 9;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setIncreaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume < 10) {
            currentVolume = currentVolume + 1;
            return;
        }
        if (newIncreaseVolume > 10) {
            currentVolume = currentVolume - 1;
            return;
        }

        increaseVolume = newIncreaseVolume;

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

}

