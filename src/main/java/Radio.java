public class Radio {
    public int radioStationNumber;
    public int getRadioStationNumber() {
        return radioStationNumber;
    }
    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        radioStationNumber = radioStationNumber + 1;
        if (radioStationNumber > 9) {
            radioStationNumber = 0;
        }
    }

    public void prevRadioStationNumber() {
        radioStationNumber = radioStationNumber - 1;
        if (radioStationNumber < 0) {
            radioStationNumber = 9;
        }

    }
    public int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void upVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void downVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
