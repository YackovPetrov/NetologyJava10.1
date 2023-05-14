public class Radio {
    private int minRadioStationNumber = 0;

    public int allRadioStationNumber;
    public Radio(int number){
        allRadioStationNumber = minRadioStationNumber + number - 1;
    }
    public Radio(){
        allRadioStationNumber = 10;
    }
    public int radioStationNumber;
    public int getRadioStationNumber() {
        return radioStationNumber;
    }
    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newRadioStationNumber > allRadioStationNumber) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        radioStationNumber = radioStationNumber + 1;
        if (radioStationNumber > allRadioStationNumber) {
            radioStationNumber = 0;
        }
    }

    public void prevRadioStationNumber() {
        radioStationNumber = radioStationNumber - 1;
        if (radioStationNumber < minRadioStationNumber) {
            radioStationNumber = allRadioStationNumber;
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
