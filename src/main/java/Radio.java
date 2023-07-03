public class Radio {
    public int currentRadioStationNumber;
    int newCurrentRadioStationNumber;
    public int currentVolume;
    int newCurrentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int next() {

        if (currentRadioStationNumber == 9) {
            newCurrentRadioStationNumber = 0;
        } else {
            newCurrentRadioStationNumber = currentRadioStationNumber + 1;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
        return currentRadioStationNumber;
    }

    public int prev() {

        if (currentRadioStationNumber == 0) {
            newCurrentRadioStationNumber = 9;
        } else {
            newCurrentRadioStationNumber = currentRadioStationNumber - 1;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume >= 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {

        if (currentVolume < 100) {
            newCurrentVolume = currentVolume + 1;
        }
       return currentVolume = newCurrentVolume;
    }

    public int decreaseVolume() {

        if (currentVolume > 0) {
            newCurrentVolume = currentVolume - 1;
        }
       return currentVolume = newCurrentVolume;
    }
}


