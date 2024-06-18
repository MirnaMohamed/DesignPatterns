package org.example.observer.Impl;

import org.example.observer.DisplayElement;
import org.example.observer.Observer;

public class AvgMaxMinDisplay implements DisplayElement, Observer {
    private WeatherData weatherData;
    private float avg, min, max;

    public AvgMaxMinDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %.2f/%.2f/%.2f%n", avg, max, min );
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        if(min == 0)
            min = temperature;
        else
            min = Math.min(temperature, min);
        max = Math.max(temperature, max);
        avg = (min + max) / 2;
        display();
    }
}
