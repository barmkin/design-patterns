package it.gb.weatherStation;

public abstract class WeatherStationApp {

    public static void executeWeatherStationApp() {
        // Create sensors
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Add observers
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(temperatureSensor);
        ForecastDisplay forecastDisplay = new ForecastDisplay(temperatureSensor, humiditySensor);

        // Test temp and humidity changes
        temperatureSensor.setTemperature(28.5f);
        humiditySensor.setHumidity(25.34f);

        // Unsubscribe observers from temperature updates
        temperatureSensor.removeWeatherObserver(temperatureDisplay);
        temperatureSensor.removeWeatherObserver(forecastDisplay);

        // Test temp and humidity changes
        temperatureSensor.setTemperature(35.2f);
        humiditySensor.setHumidity(60.15f); 
    }

}
