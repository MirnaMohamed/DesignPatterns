package org.example.observer.Impl;

import org.example.observer.DisplayElement;
import org.example.observer.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex ;
    private WeatherData weatherData;
    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void computeHeatIndex(float temperature, float relativeHumidity){
        this.heatIndex = (float)((16.923 + (0.185212 * temperature) + (5.37941 * relativeHumidity)
                - (0.100254 * temperature * relativeHumidity) + (0.00941695 * (temperature * temperature))
                + (0.00728898 * (relativeHumidity * relativeHumidity)) + (0.000345372 * (temperature * temperature * relativeHumidity))
                - (0.000814971 * (temperature * relativeHumidity * relativeHumidity)) +
                (0.0000102102 * (temperature * temperature * relativeHumidity * relativeHumidity)) -
                (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 * (relativeHumidity * relativeHumidity * relativeHumidity))
                + (0.00000142721 * (temperature * temperature * temperature * relativeHumidity)) +
                (0.000000197483 * (temperature * relativeHumidity * relativeHumidity * relativeHumidity)) -
                (0.0000000218429 * (temperature * temperature * temperature * relativeHumidity * relativeHumidity)) +
                0.000000000843296 * (temperature * temperature * relativeHumidity * relativeHumidity * relativeHumidity)) -
                (0.0000000000481975 * (temperature * temperature * temperature * relativeHumidity * relativeHumidity * relativeHumidity)));
    }

    @Override
    public void display() {
        System.out.println("Heat index is: " + heatIndex);
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        float pressure = weatherData.getPressure();
        computeHeatIndex(temperature, pressure);
        display();
    }
}
