public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int maxRadioStationNumber = 9;
    private int minRadioStationNumber = 0;
    private int currentRadioStationNumber = minRadioStationNumber;

    public Radio(int size) {
        maxRadioStationNumber = minRadioStationNumber + size;
        maxVolume = minVolume + size;
    }

    public Radio(int minVolume, int maxVolume) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = minVolume;
    }

    public int getCurrentRadioStationNumber() { return currentRadioStationNumber; }
    public int getMaxRadioStationNumber() { return maxRadioStationNumber; }
    public int getMinRadioStationNumber() { return minRadioStationNumber; }

    public int getCurrentVolume() { return currentVolume; }
    public int getMaxVolume() { return maxVolume; }
    public int getMinVolume() { return minVolume; }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int next() {

        if (currentRadioStationNumber == maxRadioStationNumber) {
            currentRadioStationNumber = minRadioStationNumber;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        return currentRadioStationNumber;
    }

    public int prev() {

        if (currentRadioStationNumber == minRadioStationNumber) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        return currentRadioStationNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= minVolume) {
            newCurrentVolume = minVolume;
        }
        if (newCurrentVolume >= maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {

        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}