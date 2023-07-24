package it.gb.weatherStation;

public class ForecastDisplay extends WeatherObserver {

    private float receivedTemperature;
    private float receivedHumidity;

    public ForecastDisplay(TemperatureSensor temperatureSensor, HumiditySensor humiditySensor) {
        temperatureSensor.addWeatherObserver(this);
        humiditySensor.addWeatherObserver(this);
    }

    private void displayForecast() {
        if (receivedHumidity > 60.0f && receivedTemperature <= 34f) {
            System.out.println("{ForecastDisplay} RAIN");
        } else {
            System.out.println("{ForecastDisplay} SUN");
        }
    }

    @Override
    public void updateTemperature(float temperature) {
        System.out.print("[DEBUG] {ForecastDisplay} ");
        super.updateTemperature(temperature);
        this.receivedTemperature = temperature;
        this.displayForecast();
    }

    @Override
    public void updateHumidity(float humidity) {
        System.out.print("[DEBUG] {ForecastDisplay} ");
        super.updateHumidity(humidity);
        this.receivedHumidity = humidity;
        this.displayForecast();
    }
    
}
