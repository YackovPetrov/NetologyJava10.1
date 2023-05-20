public class Radio {
    private int minRadioStationNumber = 0;

    private int allRadioStationNumber;

    private int radioStationNumber;

    public Radio(int number) {
        allRadioStationNumber = minRadioStationNumber + number - 1;
    }

    public Radio() {
        allRadioStationNumber = 10;
    }

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

    private int volume;

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
// Члены класса должны быть упорядочены в следующем порядке: сначала все поля, потом все конструкторы, потом все методы; чередовать члены разных типов нельзя.
// Не понял, про чередование разных типов. Получается, что сначала идут поля, конструкторы и методы радиостанций, а потом идут поля, конструкторы и методы звука?
