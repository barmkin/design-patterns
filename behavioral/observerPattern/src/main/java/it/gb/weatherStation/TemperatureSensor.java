package it.gb.weatherStation;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements WeatherSensor {

    private List<WeatherObserver> weatherObservers;
    private float temperature;

    public TemperatureSensor() {
        super();
        this.weatherObservers = new ArrayList<WeatherObserver>();
        this.temperature = 0.0f;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        this.notifyWeatherObservers();
    }

    @Override
    public boolean addWeatherObserver(WeatherObserver weatherObserver) {
        return this.weatherObservers.add(weatherObserver);
    }

    @Override
    public boolean removeWeatherObserver(WeatherObserver weatherObserver) {
        return this.weatherObservers.remove(weatherObserver);
    }

    @Override
    public void notifyWeatherObservers() {
        for (WeatherObserver weatherObserver : weatherObservers) {
            weatherObserver.updateTemperature(this.temperature);
        }
    }
    
}
