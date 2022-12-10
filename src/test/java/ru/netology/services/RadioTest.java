package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.nextStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationTest(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setCurrentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void prevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeDownTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.setVolumeDown();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setVolumeDownTestMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.setVolumeDown();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationZeroTest(){
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationAfterMax(){
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAfterMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeUpOne() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(0);

        int expected = 0;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDownOne() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(1);

        int expected = 0;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void shouldVolumeUpOneTest() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(10);

        int expected = 0;
        int actual = radio.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }



}
