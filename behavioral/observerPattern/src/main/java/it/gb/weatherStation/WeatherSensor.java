package it.gb.weatherStation;

public interface WeatherSensor {

    /**
     * Adds an observer to the list of observers to notify when 
     * a weather parameter changes.
     */
    public boolean addWeatherObserver(WeatherObserver weatherObserver);

    /** Removes an observer from the list of observers. */
    public boolean removeWeatherObserver(WeatherObserver weatherObserver);

    /** Notifies all registered observers about the update. */
    public void notifyWeatherObservers();
    
}
