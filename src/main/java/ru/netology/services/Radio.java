package ru.netology.services;


public class Radio {

    private int currentVolume;
    private int currentStation;
    private int maxStation;
    int maxVolume = 9;
    int minVolume = 0;
    private int increaseVolume;
    int stationsCount;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;

    }

    public int getStationsCount() {
        return stationsCount;
    }

    public void setStationsCount(int stationsCount) {
        if (stationsCount < 0) {
            return;
        }
        if (stationsCount > maxStation) {
            return;
        }
        this.stationsCount = stationsCount;
    }


    public void nextStationCount() {
        if (stationsCount < maxStation) {
            stationsCount++;
        } else {
            stationsCount = 0;
        }
    }

    public void prevStationCount() {
        if (stationsCount > 0) {
            stationsCount--;
        } else {
            stationsCount = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setIncreaseVolume(int increaseVolume) {
        if (increaseVolume < 10) {
            increaseVolume = increaseVolume + 1;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setVolumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}
