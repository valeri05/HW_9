import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testMinMaxRadioStationNumber() {
        Radio radio = new Radio(9);

        Assertions.assertEquals(0,radio.getMinRadioStationNumber());
        Assertions.assertEquals(9,radio.getMaxRadioStationNumber());
    }
    @Test
    public void testMinMaxVolume() {
        Radio radio = new Radio(0,100);

        Assertions.assertEquals(0,radio.getMinVolume());
        Assertions.assertEquals(100,radio.getMaxVolume());
    }

    @Test
    public void shouldSetCurrentRadioStationNumber() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentRadioStationNumberAboveMax() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioStationNumberLessMin() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test void shouldNextRadioStationNumber() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStationNumber(4);

        int expected = 5;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test void shouldNextRadioStationNumberAboveMax() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStationNumber(9);

        int expected = 0;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumber() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStationNumber(3);

        int expected = 2;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberLessMin() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStationNumber(0);

        int expected = 9;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMax() {
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetCurrentVolumeLessMin() {
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual;
        actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseCurrentVolume() {
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(90);

        int expected = 91;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCurrentVolumeAboveMax() {
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolume() {
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(1);

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotCurrentVolumeLessMin() {
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}