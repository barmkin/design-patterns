package it.gb.weatherStation;

public abstract class WeatherObserver {

    protected float temperature;
    protected float humidity;

    public void updateTemperature(float temperature) {
        System.out.println("Temperature has changed, new value is: " + temperature);
        this.temperature = temperature;
    }

    public void updateHumidity(float humidity) {
        System.out.println("Humidity has changed, new value is: " + humidity);
        this.humidity = humidity;
    }

}
