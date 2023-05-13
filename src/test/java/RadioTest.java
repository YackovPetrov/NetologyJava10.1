import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStationNumber2() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetRadioStationNumberAboveMin() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStationNumberMax() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStationNumberMin() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);

        radio.nextRadioStationNumber();

        int expected = 6;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);

        radio.prevRadioStationNumber();

        int expected = 4;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextRadioStationNumberAfterNine() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        radio.nextRadioStationNumber();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevRadioStationNumberBeforeZero() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        radio.prevRadioStationNumber();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolume() {
        Radio radio = new Radio();

        radio.setVolume(1);

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolume2() {
        Radio radio = new Radio();

        radio.setVolume(99);

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeMax() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeMin() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldUpVolume() {
        Radio radio = new Radio();

        radio.setVolume(50);

        radio.upVolume();

        int expected = 51;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDownVolume() {
        Radio radio = new Radio();

        radio.setVolume(50);

        radio.downVolume();

        int expected = 49;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpVolumeAfterMax() {
        Radio radio = new Radio();

        radio.setVolume(100);

        radio.upVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDownVolumeBeforeMin() {
        Radio radio = new Radio();

        radio.setVolume(0);

        radio.downVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
