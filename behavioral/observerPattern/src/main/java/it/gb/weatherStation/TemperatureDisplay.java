package it.gb.weatherStation;

public class TemperatureDisplay extends WeatherObserver {

    private float receivedTemperature;
    private String unitType;

    public TemperatureDisplay(TemperatureSensor temperatureSensor) {
        temperatureSensor.addWeatherObserver(this);
        this.unitType = "°C";
    }

    private void displayTemperature() {
        System.out.println("{TemperatureDisplay} Temperature is " + this.receivedTemperature + " " + this.unitType);
    }


    @Override
    public void updateTemperature(float temperature) {
        System.out.print("[DEBUG] {TemperatureDisplay} ");
        super.updateTemperature(temperature);
        this.receivedTemperature = temperature;
        this.displayTemperature();
    }    
}
