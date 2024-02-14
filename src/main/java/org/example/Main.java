package org.example;

import org.example.observer.Impl.CurrentConditionsDisplay;
import org.example.observer.Impl.HeatIndexDisplay;
import org.example.observer.Impl.WeatherData;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(25, 58, 15);

        weatherData.setMeasurements(10, 74, 26);

    }
}