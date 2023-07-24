package it.gb.weatherStation;

import java.util.ArrayList;
import java.util.List;

public class HumiditySensor implements WeatherSensor {

    private List<WeatherObserver> weatherObservers;
    private float humidity;

    public HumiditySensor() {
        super();
        weatherObservers = new ArrayList<WeatherObserver>();
        this.humidity = 0.0f;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
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
            weatherObserver.updateHumidity(this.humidity);
        }
    }
    
}
