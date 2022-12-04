package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setNumberRadioStation(9);

        int expected = 9;
        int actual = radio.numberRadioStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPutRadioStationPrev() {
        Radio radio = new Radio();

        radio.setToMaxRadioStation(0);

        int expected = 9;
        int actual = radio.numberRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(20);

        int expected = 0;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);





    }





}
